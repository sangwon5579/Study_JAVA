package com.beyond.set.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class A_HashSet {
    public void method1(){
//        Set<String> set = new HashSet<>();
        Set<String> set = new LinkedHashSet<>();

        set.add(null);
        set.add("반갑습니다.");
        set.add(new String("반갑습니다."));
        set.add("여러분");
        set.add("안녕하세요.");
        set.add("여러분");
        set.add(null);

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println();

        //Set에 저장된 객체에 접근하는 방법
        //1. 향상된 for문을 사용하는 방법
        for(String str: set){
            System.out.println(str);
        }

        // 람다식, 메소드 참조 활용
//        set.forEach(s -> System.out.println(s));
//        set.forEach(System.out::println);

        //2. HashSet에 저장되어 있는 객체들을 ArrayList에 담아서 사용하는 방법
        List<String> list =  new ArrayList<>(set);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        //3. Iterator 반복자를 사용하는 방법
        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        //람다식, 메소드 참조 활용
        set.iterator().forEachRemaining(s -> System.out.println(s));
        set.iterator().forEachRemaining(System.out::println);
    }

    public void method2(){
        Set<Music> musics = new HashSet<>();

        musics.add(new Music("뛰어", "BlackPink",1));
        musics.add(new Music("뛰어", "BlackPink",1));
        musics.add(new Music("Dirty Work", "aespa",3));
        musics.add(new Music("Dirty Work", "aespa",3));
        musics.add(new Music("빌려온 고양이", "아일릿",6));
        musics.add(new Music("너에게 닿기를", "10cm",5));
        musics.add(new Music("시작의 아이", "마크룹",4));
        musics.add(new Music("시작의 아이", "마크룹",4));
        musics.add(new Music("눈물참기", "QWER",2));

        for(Music music: musics){
            System.out.println(music);
        }
    }
}
