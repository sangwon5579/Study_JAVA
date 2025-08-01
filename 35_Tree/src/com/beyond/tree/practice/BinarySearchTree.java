package com.beyond.tree.practice;

import org.w3c.dom.Node;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        this.root = insert(this.root, value);
    }

    private Node insert(Node node, int value){
        if (node == null){
            return new Node(value);
        }else if(node.value > value){
            node.left = insert(node.left, value);
        }else if(node.value < value){
            node.right = insert(node.right, value);
        }
        //중복된값 입력되면 저장되지 않도록 해당 노드 그대로 반환
        return node;
    }

    public void order() {
        //전위 순회
        System.out.print("전위 순회  ");
        this.preorder(this.root);
        System.out.println();

        //중위 순회
        System.out.print("중위 순회  ");
        this.inorder(this.root);
        System.out.println();

        //후위 순회
        System.out.print("후위 순회  ");
        this.postorder(this.root);
        System.out.println();
    }

    private void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.value + " ");
        }
    }

    private void inorder(Node node) {
        if(node != null){
            this.inorder(node.left);
            System.out.print(node.value + " ");
            this.inorder(node.right);
        }
    }

    private void preorder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            this.preorder(node.left);
            this.preorder(node.right);
        }
    }

    public boolean search(int value) {
        return this.search(this.root, value) != null;
    }

    private Node search(Node node, int value){
        if(node == null || node.value == value){
            return node;
        }else if(node.value > value){
            return this.search(node.left, value);
        }else{
            return this.search(node.right, value);
        }
    }

    public void delete(int value) {
        this.root = delete(this.root, value);
    }

    private Node delete(Node node, int value){
        if(node == null){
            return null;
        }else if(node.value > value){
            node.left = delete(node.left, value);
        }else if(node.value < value){
            node.right = delete(node.right, value);
        }else{
            if(node.left == null){
                return node.right;
            }else if(node.right == null){
                return node.left;
            } else{
                node.value = minValue(node.right);
                node.right = delete(node.right, node.value);
            }
        }
        return node;
    }

    private int minValue(Node node){
        int minValue = node.value;
        while (node.left != null){
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }

    private static class Node {
        private int value;
        private Node left;
        private Node right;
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

}
