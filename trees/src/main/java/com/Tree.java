package com;

public class Tree {
    public Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public void add(int value) {
        add(value, this.root, null);
    }

    private Node add(int value, Node currentNode, Node parent) {
        if (currentNode == null) {
            Node node = new Node(value);
            node.setParent(parent);
            calculateAndSetHeight(node);
            return node;
        }

        if (value < currentNode.getValue()) {
            Node node = add(value, currentNode.getLeft(), currentNode);
            currentNode.setLeft(node);
        }

        if (value > currentNode.getValue()) {
            Node node = add(value, currentNode.getRight(), currentNode);
            currentNode.setRight(node);
        }

        calculateAndSetHeight(currentNode);
        calculateBalanceFactor(currentNode);

        return currentNode;
    }

    public void calculateAndSetHeight(Node node) {
        int leftHeight;
        int rightHeight;

        if (node.getLeft() != null) {
            leftHeight = node.getLeft().getHeight();
        } else {
            leftHeight = -1;
        }

        if (node.getRight() != null) {
            rightHeight = node.getRight().getHeight();
        } else {
            rightHeight = -1;
        }

        node.setHeight(1 + (Math.max(leftHeight, rightHeight)));
    }

    public void calculateBalanceFactor(Node node) {
        int leftHeight;
        int rightHeight;

        if (node.getLeft() != null) {
            leftHeight = node.getLeft().getHeight();
        } else {
            leftHeight = -1;
        }

        if (node.getRight() != null) {
            rightHeight = node.getRight().getHeight();
        } else {
            rightHeight = -1;
        }

        node.setBf(leftHeight - rightHeight);
    }

    public void printTree() {
        printTree(this.root, 0);
    }

    private void printTree(Node node, int level) {
        if (node == null) {
            return;
        }
        
        printTree(node.getRight(), level + 1);
        System.out.println("    ".repeat(level) + node.getValue() + " [" + node.getHeight() + "] {" + node.getBf() + "}");
        printTree(node.getLeft(), level + 1);
    }
}