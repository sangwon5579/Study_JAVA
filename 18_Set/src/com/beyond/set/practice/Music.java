package com.beyond.set.practice;

public class Music implements Comparable<Music> {
    private String title;
    private String artist;
    private int ranking;

    public Music(String title, String artist, int ranking) {
        this.title = title;
        this.artist = artist;
        this.ranking = ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getRanking() {
        return ranking;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", ranking=" + ranking +
                '}';
    }


    @Override
    public int compareTo(Music music) {
        System.out.printf("this.ranking=%d\n", this.ranking);
        System.out.printf("music.ranking=%s\n",music.ranking);

        //오름차순 정렬
        return this.ranking - music.ranking;
        //내림차순 정렬
//        return music.ranking - this.ranking;
    }
}
