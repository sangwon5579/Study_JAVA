package com.beyond.linkedlist.practice;

public interface List<E> {
    void addFirst(E data);

    void addLast(E data);

    void add(int index, E data);

    E get(int index);

    int size();

    boolean contains(E data);

    void removeFirst();

    void removeLast();

    void remove(int index);

    void remove(E element);
}
