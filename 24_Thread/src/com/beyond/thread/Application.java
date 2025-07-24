package com.beyond.thread;

import com.beyond.thread.practice.LoopRunnable;
import com.beyond.thread.practice.LoopThread;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("메인 스레드 시작");
        System.out.printf("%s\n", Thread.currentThread().getName());

        //스레드 생성 방법
        // 1. Thread 클래스를 상속받는 방법
        LoopThread loopThread = new LoopThread();
        loopThread.setName("Thread-1");
        loopThread.setPriority(Thread.MAX_PRIORITY);
        loopThread.start();   //새로운 실행흐름인 스레드를 만든다
//        loopThread.run();   //main 스레드가 호출하는 것. 새로운 스레드X

        // 2. Runable 인터페이스 구현하는 방법
        Thread thread = new Thread(new LoopRunnable());
        thread.setName("Thread-2");
        thread.setPriority(Thread.MAX_PRIORITY);
//        thread.run();
        thread.start();

        // 3. 익명 구현 객체로 Runnable 인터페이스를 구현하는 방법
        Thread anonymousThread = new Thread(new Runnable(){
            @Override
            public void run(){
                //작업하고자 하는 코드를 작성한다
                for (int i = 1 ; i <= 100; i++){
                    System.out.printf("%s[%d]\n", Thread.currentThread().getName(), i);
                }
            }
        });
        anonymousThread.setName("Thread-3");
        anonymousThread.start();

        // 4. 람다식으로 Runnable 인터페이스와 구현 객체를 생성하는방법
        Thread lamdaThread = new Thread(() -> {
            //작업하고자 하는 코드를 작성한다
            for (int i = 1 ; i <= 100; i++){
                System.out.printf("%s[%d]\n", Thread.currentThread().getName(), i);
            }
        });
        lamdaThread.setName("Thread-4");
        /*
        Daemon 스레드
            - 보조적인 역할을 수행하는 스레드
            - 모든 스레드가 종료되면 데몬 스레드는 강제로 종료됨
         */
        lamdaThread.setDaemon(true);
        lamdaThread.start();

        // join() 메소드
        //  - join() 메소드를 호출한 스레드는 해당 스레드가 종료될 때까지 기다렸다가 스레드가 종료되면
        //      호출한 스레드를 다시 실행한다
        loopThread.join();
        thread.join();
        anonymousThread.join();


        System.out.println("메인 스레드 종료");
    }
}
