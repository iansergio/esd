package com;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------");
        System.out.println("PRIMEIRA ARVORE");

        Node root1 = new Node(40);
        Tree tree1 = new Tree(root1);

        tree1.add(20);
        tree1.add(60);
        tree1.add(10);
        tree1.add(30);
        tree1.add(25);
        tree1.printTree();

        System.out.println("---------------");
        System.out.println("SEGUNDA ARVORE");
        
        Node root2 = new Node(60);
        Tree tree2 = new Tree(root2);

        tree2.add(40);
        tree2.add(80);
        tree2.add(35);
        tree2.add(50);
        tree2.add(90);
        tree2.add(20);
        tree2.add(38);
        tree2.add(37);
        tree2.printTree();

        System.out.println("---------------");
        System.out.println("TERCEIRA ARVORE");

        Node root3 = new Node(30);
        Tree tree3 = new Tree(root3);

        tree3.add(20);
        tree3.add(10);
        tree3.add(25);
        tree3.add(40);
        tree3.add(50);
        tree3.add(5);
        tree3.add(35);
        tree3.add(45);
        tree3.printTree();
    }
}