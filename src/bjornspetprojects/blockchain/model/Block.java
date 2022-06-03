package bjornspetprojects.blockchain.model;

import java.util.Arrays;

public class Block {
    private String[] transactions;
    private final int currentHash;
    private int previousHash;

    public Block(String[] transactions, int previousHash) {
        this.transactions = transactions;
        this.previousHash = previousHash;
        this.currentHash = Arrays.hashCode(new int[]{Arrays.hashCode(transactions),previousHash});
    }

    public String[] getTransactions() {
        return transactions;
    }

    public void setTransactions(String[] transactions) {
        this.transactions = transactions;
    }

    public int getCurrentHash() {
        return currentHash;
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    @Override
    public String toString() {
        return "Block{" +
                "transactions=" + Arrays.toString(transactions) +
                ", currentHash=" + currentHash +
                ", previousHash=" + previousHash +
                '}';
    }
}
