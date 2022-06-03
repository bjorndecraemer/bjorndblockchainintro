package bjornspetprojects.blockchain;

import bjornspetprojects.blockchain.model.Block;

import java.util.ArrayList;
import java.util.Arrays;

public class BjornsBlockchain {

    public static void main(String[] args){
        System.out.println("This is a blockchain demo app");
        String toHashValue1 = "This is a value";
        String toHashValue2 = "This is a value";
        String toHashValue3 = "This is another value";
        System.out.println("Hashes of same strings are identical");
        System.out.println("Value1 : "+toHashValue1 + " with hash : "+toHashValue1.hashCode());
        System.out.println("Value1 : "+toHashValue2 + " with hash : "+toHashValue2.hashCode());
        System.out.println("Value1 : "+toHashValue3 + " with hash : "+toHashValue3.hashCode());

        // Arrays of Strings also give the same hash values
        System.out.println("--------------------------------------");

        String[] toHashArray1 = new String[]{toHashValue1,toHashValue3};
        String[] toHashArray2 = new String[]{toHashValue2,toHashValue3};
        String[] toHashArray3 = new String[]{toHashValue2,toHashValue1};

        System.out.println("Hashes of same value String Arrays also give the same hash");
        System.out.println("Array 1"+Arrays.toString(toHashArray1)+" with hash : "+ Arrays.hashCode(toHashArray1));
        System.out.println("Array 2"+Arrays.toString(toHashArray2)+" with hash : "+ Arrays.hashCode(toHashArray2));
        System.out.println("Array 3"+Arrays.toString(toHashArray3)+" with hash : "+ Arrays.hashCode(toHashArray3));

        System.out.println("--------------------------------------");

        // BlockChain tests
        ArrayList<Block> blockChain1 =  new ArrayList<>();
        Block block1 =  new Block(new String[]{"Bjorn has 300"},0);
        blockChain1.add(block1);
        System.out.println("Block 1");
        System.out.println(block1.toString());
        System.out.println("BlockChain");
        System.out.println(Arrays.toString(blockChain1.toArray()));

        Block block2 =  new Block(new String[]{"Bjorn gives 100 to Yannick","Bjorn receives 30 from Maarten"},block1.getCurrentHash());
        blockChain1.add(block2);
        System.out.println("Block 2");
        System.out.println(block2.toString());
        System.out.println("BlockChain");
        System.out.println(Arrays.toString(blockChain1.toArray()));

        Block block3 =  new Block(new String[]{"Yannick gives 50 to Bjorn"},block2.getCurrentHash());
        blockChain1.add(block3);
        System.out.println("Block 3");
        System.out.println(block3.toString());
        System.out.println("BlockChain");
        System.out.println(Arrays.toString(blockChain1.toArray()));

        System.out.println("--------------------------------------");
        System.out.println("Same values and transactions give the same hashes");
        ArrayList<Block> blockChain2 =  new ArrayList<>();
        Block block4 =  new Block(new String[]{"Bjorn has 300"},0);
        blockChain2.add(block4);
        Block block5 =  new Block(new String[]{"Bjorn gives 100 to Yannick","Bjorn receives 30 from Maarten"},block4.getCurrentHash());
        blockChain2.add(block2);

        Block block6 =  new Block(new String[]{"Yannick gives 50 to Bjorn"},block5.getCurrentHash());
        blockChain2.add(block6);
        System.out.println("BlockChain 1");
        System.out.println(Arrays.toString(blockChain1.toArray()));
        System.out.println("BlockChain 2");
        System.out.println(Arrays.toString(blockChain2.toArray()));

    }
}
