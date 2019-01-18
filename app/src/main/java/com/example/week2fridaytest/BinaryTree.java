package com.example.week2fridaytest;

public class BinaryTree {
    BinaryNode root;

    public BinaryTree() {
    }

    public void add(int val){
        root = addRec(root, val);
    }

    private BinaryNode addRec(BinaryNode bn, int n){
        if(bn == null){
            return new BinaryNode(n);
        }

        if(n < bn.value){
            bn.left = addRec(bn.left, n);
        } else if(n > bn.value){
            bn.right = addRec(bn.right, n);
        } else {
            return bn;
        }
        return bn;
    }

    public static void printPreorder(BinaryNode node){
        if(node != null){
            System.out.print(" " + node.value);
            printPreorder(node.left);
            printPreorder(node.right);
        }
    }
}