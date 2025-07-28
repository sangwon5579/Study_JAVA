package com.beyond.stack.practice;

import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {

    //스택의 최상위 요소를 가리키는 인덱스
    private int top;

    //스택의 최대 크기
    private int maxSize;

    //스택 배열
    private E[] elements;

    public ArrayStack() {
        this(16);
    }

    public ArrayStack(int maxSize) {
        this.top = -1;
        this.maxSize = maxSize;
        this.elements = (E[]) new Object[maxSize];
    }

    @Override
    public void push(E element) {
        if (top == maxSize - 1) {
            throw new RuntimeException("스택 가득참");
        }else{
            elements[++top] = element;
        }
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public E pop() {
        if(isEmpty()){
            throw new RuntimeException("스택이 비어 있습니다");
        }
        else{
            return elements[top--];
        }
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("[");

       for(int i = 0; i<= top;i++){
           sb.append(elements[i]).append(", ");
       }
        if (sb.lastIndexOf(",") != -1) {
            sb.replace(sb.lastIndexOf(","), sb.length(), "]");
        } else {
            sb.append("]");
        }

       return sb.toString();
    }
}
