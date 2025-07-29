package com.beyond.stack.practice;

import java.util.EmptyStackException;

public class SinglyLinkedStack<E> implements Stack<E> {
    private int size;
    private Node<E> top;
    public SinglyLinkedStack(){
        this.size = 0;
        this.top = null;
    }


    @Override
    public void push(E element) {
        Node<E> newNode = new Node<>(element);

        newNode.next = top;
        top = newNode;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public E pop() {
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        Node<E> temp = top;
        E data = temp.data;
        top = temp.next;
        temp.data = null;
        temp.next = null;
        size--;

        return data;
    }

    @Override
    public boolean contains(E element) {
        boolean result = false;
        Node<E> currentNode = top;
        while (currentNode != null){
            if (currentNode.data.equals(element)){
                result = true;
                break;
            }
            currentNode = currentNode.next;
        }
        return result;
    }

    @Override
    public E peek() {
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    @Override
    public String toString() {
        Node<E> currentNode = top;
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        while(currentNode != null){
            sb.insert(1, currentNode.data+", ");
            currentNode = currentNode.next;
        }

        if(sb.lastIndexOf(",") != -1){
            sb.replace(sb.lastIndexOf(","),sb.length(),"]");
        }
        else{
            sb.append("]");
        }
        return sb.toString();
    }

    //노드 클래스
    private static class Node<E>{
        private E data;
        private Node<E> next;
        private Node(E data){
            this.data = data;
            this.next = null;
        }
    }
}
