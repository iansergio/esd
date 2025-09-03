package com;

public class Main {
    public static void main(String[] args) {

        Node root = new Node(30);
        Tree tree = new Tree(root);

        tree.add(20);
        tree.add(10);

        tree.printTree();
    }
}