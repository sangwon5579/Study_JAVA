package com.beyond.map.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class A_HashMap {
    public void method1(){
        Map<String, Snack> map = new HashMap<>();

        //put() 메소드는 entry 객체를 저장하는 메소드이다
        map.put("다이제", new Snack("다이제","초코맛",1000));
        map.put("칸쵸", new  Snack("칸쵸", "바나나맛", 200));
        map.put("프링글스", new Snack("프링글스","어니언맛",400));
        map.put("프링글스", new Snack("프링글스","짠맛",400));
        map.put("먹태깡",new Snack("먹태깡", "청양마요", 300));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println();

        //get() 메소드는 key에 해당하는 value를 얻어오는 메소드이다
        Snack snack = map.get("칸쵸");
        System.out.println(snack);

        //remove() 메소드는 key에 해당하는 entry 객체를 삭제하는 메소드이다
        snack = map.remove("먹태깡");
        System.out.println(snack);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println();

        //clear() 메소드는 모든 entry 객체를 삭제하는 메소드이다.
        map.clear();
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println();
    }

    public void meyhod2(){
//        Map<String, Snack> map = new HashMap<>();
        Map<String, Snack> map = new TreeMap<>();

        //put() 메소드는 entry 객체를 저장하는 메소드이다
        map.put("다이제", new Snack("다이제","초코맛",1000));
        map.put("칸쵸", new  Snack("칸쵸", "바나나맛", 200));
        map.put("프링글스", new Snack("프링글스","어니언맛",400));
        map.put("초코파이", new Snack("초코파이","수박맛",400));
        map.put("먹태깡",new Snack("먹태깡", "청양마요", 300));

        //map은 인덱스의 개념이 없어서 반복문 사용 불가
//        for(int i = 0; i < map.size(); i++){
//
//        }
        //Map은 Iterable 인터페이스를 구현하지 않아서 향상된 for문을 사용할 수 없다.
//        for(Map.Entry<String, Snack> entry : map){
//
//        }
        //List와 Map 구조가 달라서 ArrayList에 담아서 사용할 수 없다
//        new ArrayList<>(map);

        // 1. keySet() 메소드를 이용하는 방법
        //      - Map 컬렉션에 있는  키값들만 Set 컬렉션에 담아서 반환한다
        Set<String> set = map.keySet();
//        for (String key : set){
//            System.out.printf("key : %s, value : %s\n", key, map.get(key));
//        }

        set.forEach(key -> System.out.printf("key : %s, value : %s\n", key, map.get(key)));
        System.out.println();

        // 2. entrySet() 메소드를 이용하는 방법
        //      - Map 컬렉션에 있는 Entry 객체들 Set 컬렉샨에 담아서 반환한다
        Set<Map.Entry<String, Snack>> entrySet = map.entrySet();
        for(Map.Entry<String, Snack> entry : entrySet){
            System.out.printf("key : %s, value : %s\n",entry.getKey(),entry.getValue());
        }
        System.out.println();
    }
}
