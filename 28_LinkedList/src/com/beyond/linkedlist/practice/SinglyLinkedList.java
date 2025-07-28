package com.beyond.linkedlist.practice;

public class SinglyLinkedList<E> implements List<E> {
    //연결리스트의 첫번쨰 노드를 가리키는 참조
    private Node<E> head;

    //노드 개수 저장
    private int size;

    public SinglyLinkedList(){
        this.head = null;
        this.size = 0;
    }

    @Override
    public void addFirst(E data) {
        // 새 노드 생성
        Node<E> newNode = new Node<>(data);

        //리스트가 비어있는 경우
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        //size 증가
        size++;
    }

    @Override
    public void addLast(E data) {
    }

    @Override
    public void add(int index, E data) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E data) {
        return false;
    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(E element) {

    }

    @Override
    public String toString() {
        Node<E> curentNode = head;
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        while (curentNode != null) {
            sb.append(curentNode.data + ", ");
            curentNode = curentNode.next;
        }
        if( sb.lastIndexOf(",") != -1 ){
            sb.replace(sb.lastIndexOf(","), sb.length(), "]");
        }else{
            sb.append("]");
        }



        return sb.toString();
    }

    private static class Node<E>{
        //노드가 저장하는 데이터
        private E data;

        //다음 노드를 가리키는 참조
        private Node<E> next;


        public Node(E data){
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public E get(int index) {
        return null;
    }
}
