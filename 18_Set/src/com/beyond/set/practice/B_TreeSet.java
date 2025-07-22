package com.beyond.set.practice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class B_TreeSet {
    public void method1(){
        Set<String> set = new TreeSet<>();

        //중복 제거, 정렬, null 저장X
        set.add("하하하");
        set.add("나나나");
        set.add("가가가");
        set.add("다다다");
        set.add("다다다");
        set.add("하하하");

        System.out.println(set);
        //Treeset 클래스에서 제공하는 메소드
//        System.out.println(set.first());
//        System.out.println(set.last());
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println();
    }

    public void method2(){
//        Set<Music> musics = new TreeSet<>();
        Set<Music> musics = new TreeSet<>(
                (Music o1, Music o2) -> o1.getArtist().compareTo(o2.getArtist())
        );
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
