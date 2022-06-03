package bjornspetprojects.blockchain;

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
        System.out.println("Array 1"+toHashArray1.toString()+" with hash : "+ Arrays.hashCode(toHashArray1));
        System.out.println("Array 2"+toHashArray2.toString()+" with hash : "+ Arrays.hashCode(toHashArray2));
        System.out.println("Array 3"+toHashArray3.toString()+" with hash : "+ Arrays.hashCode(toHashArray3));

    }
}
