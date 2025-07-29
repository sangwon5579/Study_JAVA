package com.beyond.queue;

import com.beyond.queue.practice.ArrayQueue;
import com.beyond.queue.practice.LinkedQueue;
import com.beyond.queue.practice.Queue;

public class Application {
    public static void main(String[] args) {
        //자바에서 제공하는 queue 테스트
//        Queue<String> queue = new LinkedList<>();
//
//        //add()
//        System.out.println(queue);
//        System.out.println("add");
//        queue.add("딸기");
//        queue.add("사과");
//        System.out.println(queue);
//        System.out.println(queue.size());
//        System.out.println(queue.isEmpty());
//        System.out.println();
//
//        //poll()
//        System.out.println(queue);
//        System.out.println("poll");
//        System.out.println(queue.poll());
//        System.out.println(queue);
//        System.out.println(queue.size());
//        System.out.println(queue.isEmpty());
//        System.out.println();
//
//        queue.add("바나나");
//
//        //peek()
//        System.out.println(queue);
//        System.out.println("peek");
//        System.out.println(queue.peek());
//        System.out.println(queue);
//        System.out.println(queue.size());
//        System.out.println(queue.isEmpty());
//        System.out.println();
//
//        //contains()
//        System.out.println(queue);
//        System.out.println("contains");
//        System.out.println(queue.contains("딸기"));
//        System.out.println(queue.contains("사과"));
//        System.out.println(queue);
//        System.out.println(queue.size());
//        System.out.println(queue.isEmpty());
//        System.out.println();

        //ArrayQueue 구현/테스트
//        Queue<String> queue = new ArrayQueue<>(5);

        //LinkedQueue 구현/테스트
        Queue<String> queue = new LinkedQueue<>();

        //enqueue 구현
        System.out.println("enqueue");
        queue.enqueue("딸기");
        queue.enqueue("사과");
        queue.enqueue("바나나");
        queue.enqueue("포도");
        queue.enqueue("복숭아");

        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println();

        //dequeue
        System.out.println("dequeue");
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println();
//
//        queue.enqueue("두리안");
//        System.out.println(queue);
//        queue.dequeue();
//        System.out.println(queue);
//        System.out.println((0 + 1) % 5);
//        System.out.println((1 + 1) % 5);
//        System.out.println((2 + 1) % 5);
//        System.out.println((3 + 1) % 5);
//        System.out.println((4 + 1) % 5);
//        System.out.println((5 + 1) % 5);
//        System.out.println((6 + 1) % 5);
//        System.out.println((7 + 1) % 5);
//        System.out.println();
//
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue);
//        System.out.println(queue.size());
//        System.out.println(queue.isEmpty());
//        System.out.println();

        //peek
        System.out.println("peek");
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println();
        
        //contains
        System.out.println("contains");
        System.out.println(queue.contains("사과"));
        System.out.println(queue.contains("포도"));
        System.out.println();
    }
}
