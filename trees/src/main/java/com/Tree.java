package com;

public class Tree {
    public Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public void add(int value) {
        this.root = add(value, this.root, null);
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

        return balanceTree(currentNode);
    }

    public void calculateAndSetHeight(Node node) {
        // Ternário | variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
        int leftHeight = (node.getLeft() != null) ? node.getLeft().getHeight() : -1;
        int rightHeight = (node.getRight() != null) ? node.getRight().getHeight() : -1;

        node.setHeight(1 + (Math.max(leftHeight, rightHeight)));
    }

    public Node balanceTree(Node node) {
        Node newRoot = node;
        if (node.getBf() > 1) { // Lado esquerdo desbalanceado
            if (node.getLeft().getBf() >= 0) {
                newRoot = rotateRight(node);
            } else {
                rotateLeft(node.getLeft());
                newRoot = rotateRight(node);
            }
        }

        if (node.getBf() < -1) { // Lado direito desbalanceado
            if (node.getRight().getBf() <= 0) {
                newRoot = rotateLeft(node);
            } else {
                rotateRight(node.getRight());
                newRoot = rotateLeft(node);
            }
        }

        return newRoot;
    }

    public Node rotateLeft(Node node) {
        if (node == null || node.getRight() == null) {
            return node;
        }

        Node rightChild = node.getRight();
        Node leftSubTree = rightChild.getLeft();

        rightChild.setParent(node.getParent());
        if (node.getParent() != null) {
            if (node.getParent().getLeft() == node) {
                node.getParent().setLeft(rightChild);
            } else {
                node.getParent().setRight(rightChild);
            }
        }

        node.setParent(rightChild);
        rightChild.setLeft(node);

        node.setRight(leftSubTree);
        if (leftSubTree != null) {
            leftSubTree.setParent(node);
        }

        return rightChild;
    }

    public Node rotateRight(Node node) {
        if (node == null || node.getLeft() == null) {
            return node;
        }

        Node leftChild = node.getLeft();
        Node rightSubTree = leftChild.getRight();

        leftChild.setParent(node.getParent());
        if (node.getParent() != null) {
            if (node.getParent().getLeft() == null) {
                node.getParent().setLeft(leftChild);
            } else {
                node.getParent().setRight(leftChild);
            }
        }

        node.setParent(leftChild);
        leftChild.setRight(node);

        node.setLeft(rightSubTree);
        if (rightSubTree != null) {
            rightSubTree.setParent(node);
        }

        return leftChild;
    }

    public void printTree() {
        printTree(this.root, 0);
    }

    private void printTree(Node node, int level) {
        if (node == null) {
            return;
        }
        printTree(node.getRight(), level + 1);
        System.out.println("     ".repeat(level) + node.getValue() + " [" + node.getHeight() + "]");
        printTree(node.getLeft(), level + 1);
    }
}