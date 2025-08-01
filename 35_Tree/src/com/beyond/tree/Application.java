package com.beyond.tree;

import com.beyond.tree.practice.BinarySearchTree;

public class Application {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        //insert() 메소드 구현
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        //order() 메소드 구현
        bst.order();
        System.out.println();

        //search() 메소드 구현
        System.out.println("40 : " + bst.search(40));
        System.out.println("70 : " + bst.search(70));
        System.out.println("90 : " + bst.search(90));
        System.out.println();

        //delete() 메소드 구현
        System.out.println("delete 20");
        bst.delete(20);
        bst.order();
        System.out.println();

        System.out.println("delete 30, 20");
        bst.delete(30);
        bst.delete(20);
        bst.order();
        System.out.println();


        System.out.println("delete 50, 20");
        bst.delete(50);
        bst.delete(20);
        bst.order();
        System.out.println();



    }
}
