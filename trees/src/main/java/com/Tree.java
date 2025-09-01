package com;

public class Tree {
    public Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public void add(int value) {
        add(value, this.root, null);
    }

    public Node add(int value, Node currentNode, Node parent) {
        if (currentNode == null) {
            Node node = new Node(value);
            node.parent = parent;
            return node;
        }

        if (value < currentNode.value) {
            // Criando um novo nó e colocando ele no lado esquerdo do nó atual
            currentNode.left = add(value, currentNode.left, parent);
        }

        if (value > currentNode.value) {
            // Criando um novo nó e colocando ele no lado direito do nó atual
            currentNode.right = add(value, currentNode.right, parent);
        }

        return currentNode;
    }
}
