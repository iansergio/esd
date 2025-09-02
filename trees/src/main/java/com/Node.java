package com;

public class Node {
    private int value;
    private Node left;
    private Node right;
    private Node parent;
    private int height;
    private int bf;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight() {
        int leftHeight;
        int rightHeight;

        if (left != null) {
            leftHeight = left.height;
        } else {
            leftHeight = -1;
        }

        if (right != null) {
            rightHeight = right.height;
        } else {
            rightHeight = -1;
        }

        this.height = 1 + (Math.max(leftHeight, rightHeight));
    }

    public int getBf() {
        return bf;
    }

    public void setBf(int bf) {
        this.bf = bf;
    }
}
