package com.beyond.list.practice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class A_ArrayList {
    public void method1(){
        List list = new ArrayList();

        //객체를 저장할 때는 add() 메소드를 사용한다
        list.add("안녕하세요.");
        list.add(LocalDateTime.now());
        //Auto Boxing이 적용된다
        list.add(3.14);
        list.add(false);
        list.add('a');
        //객체의 중복 저장 허용
        list.add("안녕하세요.");
        //null도 가능
        list.add(null);

        System.out.println(list);   //[안녕하세요., 2025-07-21T17:21:51.054557600, 3.14, false, a]
        System.out.println(list.size());    //5

        //객체를 가져올 때는 get() 메소드 사용
        //형변환 필요
        //다운캐스팅
        String str = (String) list.get(0);
        LocalDateTime now = (LocalDateTime) list.get(1);
        Double number = (Double) list.get(2);
        System.out.println(str);
        System.out.println(now);
        System.out.println(number);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(Object obj : list){
            System.out.println(obj);
        }
    }
}
