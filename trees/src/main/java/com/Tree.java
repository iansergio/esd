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
            node.setHeight();
            return node;
        }
        
        if (value < currentNode.getValue()) {
            Node node = add(value, currentNode.getLeft(), currentNode);
            currentNode.setLeft(node);
            currentNode.setHeight();
        }
        
        if (value > currentNode.getValue()) {
            Node node = add(value, currentNode.getRight(), currentNode);
            currentNode.setRight(node);
            currentNode.setHeight(); 
        }

        return currentNode;
    }

    public void printTree() {
        printTree(this.root, 0);
    }

    private void printTree(Node node, int level) {
        if (node == null)
            return;

        printTree(node.getRight(), level + 1);

        System.out.println("    ".repeat(level) +
                node.getValue() + " [" + node.getHeight() + "]");

        printTree(node.getLeft(), level + 1);
    }
}
