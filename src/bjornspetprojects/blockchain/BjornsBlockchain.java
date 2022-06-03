package bjornspetprojects.blockchain;

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
    }
}
