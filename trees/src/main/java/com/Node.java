package com;

public class Node {
    public int value;
    public Node left;
    public Node right;
    public Node parent;
    public int height;
    public int bf;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null; 
        this.parent = null;
        this.height = 0;
        this.bf = 0;
    }
}
