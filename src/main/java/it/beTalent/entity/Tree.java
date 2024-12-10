package it.beTalent.entity;

public class Tree {

    private int branches;
    static final int period = 1;


    public Tree(int branches) {
        this.branches = branches;
    }

    public int getBranches() {
        return branches;
    }

    public void setBranches(int branches) {
        this.branches = branches;
    }


    @Override
    public String toString() {
        return "Tree{" +
                "branches=" + branches +
                '}';
    }


}
