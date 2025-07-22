package com.beyond.list.practice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
        System.out.println();

        list.add(2,10000);
        System.out.println(list);
        System.out.println();

        list.set(2,true);
        System.out.println(list);
        System.out.println();

        //JDK21 버전에 추가된 메소드
        list.addFirst("1st");
        list.addLast("last");
        System.out.println(list);
        System.out.println();

        list.remove(2);
        list.remove("1st");
        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        //Boxing
//        list.remove(Integer.valueOf(100000));

        list.remove(null);
        System.out.println(list);
        System.out.println();

        System.out.println(list.isEmpty());

        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());

    }

    public void method2(){
        /*
        컬렉션에서 제네릭스를 사용하는 이유
            - 명시된 타입의 객체만 저장하도록 제한을 두기 위해서 사용한다
            - 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형 변환을 하지 않아도 된다
        */
        List<String> fruits = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("kiwi");
        fruits.add("grapes");
        System.out.println(fruits);

        numbers.add(8);
        numbers.add(3);
        numbers.add(21);
        numbers.add(10);
        numbers.add(3);
        numbers.add(2);
        System.out.println(numbers);

        numbers.remove(3);
        numbers.remove(Integer.valueOf(3));

        //오름차순으로 정렬
        Collections.sort(fruits);
        Collections.sort(numbers);
        System.out.println(fruits);
        System.out.println(numbers);


        //내림차순 정렬
        Collections.reverse(fruits);
        Collections.reverse(numbers);
        System.out.println(fruits);
        System.out.println(numbers);

        Collections.sort(fruits, Collections.reverseOrder());
        fruits.sort(Collections.reverseOrder());
    }

    public void method3(){
        List<Music> musics = new ArrayList<>();

        musics.add(new Music("뛰어", "BlackPink",1));
        musics.add(new Music("Dirty Work", "aespa",3));
        musics.add(new Music("빌려온 고양이", "아일릿",6));
        musics.add(new Music("너에게 닿기를", "10cm",5));
        musics.add(new Music("시작의 아이", "마크룹",4));
        musics.add(new Music("눈물참기", "QWER",2));

        for(Music music : musics){
            System.out.println(music);
        }
        System.out.println();

        //오름차순으로 리스트 정렬(랭킹순으로 리스트 정렬)
        Collections.sort(musics);

        for(Music music : musics){
            System.out.println(music);
        }
        System.out.println();

        //오름차순으로 리스트 정렬(아티스트순으로 리스트 정렬)
        Collections.sort(musics, new ArtistAscending());

        for(Music music : musics){
            System.out.println(music);
        }
        System.out.println();

        //오름차순으로 리스트 정렬(타이틀 순으로 리스트 정렬)
        //1) 익명 구현 객체
//        Collections.sort(musics, new Comparator<Music>() {
//            @Override
//            public int compare(Music o1, Music o2) {
//                return o1.getTitle().compareTo(o2.getTitle());
//            }
//        });
//
//        for(Music music : musics){
//            System.out.println(music);
//        }
//        System.out.println();

        //2) 람다식
        Collections.sort(musics, (Music o1, Music o2) -> {
            return o1.getTitle().compareTo(o2.getTitle());
        });

        for(Music music : musics){
            System.out.println(music);
        }
        System.out.println();

        }
}
