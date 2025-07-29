package com.beyond.queue.practice;

public class LinkedQueue<E> implements Queue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int size;

    public LinkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element);

        if(isEmpty()) {
            this.front = newNode;
        }
        else{
            this.rear.next = newNode;
        }
        this.rear = newNode;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        Node<E> tempNode = front;
        E element = tempNode.data;

        front = tempNode.next;
        tempNode.data = null;
        tempNode.next = null;
        size--;

        return element;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return this.front.data;
    }

    @Override
    public boolean contains(E element) {
        boolean result = false;
        Node<E> curentNode = front;

        while (curentNode != null) {
            if (curentNode.data.equals(element)) {
                result = true;
                break;
            }
            curentNode = curentNode.next;
        }

        return result;
    }

    @Override
    public String toString() {
        Node<E>currentNode = front;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while(currentNode != null){
            sb.append(currentNode.data).append(",");
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

    private static class Node<E> {
        private E data;

        private Node<E> next;

        private Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
}
