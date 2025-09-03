package com;

public class Node {
    private int value;
    private Node left;
    private Node right;
    private Node parent;
    private int height;

    public Node() {
    }

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

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBf() {
        int leftHeight = (left != null) ? left.height : -1;
        int rightHeight = (right != null) ? right.height : -1;

        return leftHeight - rightHeight;
    }
}