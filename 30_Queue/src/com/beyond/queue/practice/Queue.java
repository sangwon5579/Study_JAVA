package com.beyond.queue.practice;

public interface Queue<E> {
    void enqueue(E element);
    int size();
    boolean isEmpty();
    E dequeue();
    E peek();
    boolean contains(E element);

}
