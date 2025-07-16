package com.beyond.constructor.practice;

public class User {
    private String id;
    private String passward;
    private String name;
    private int age;
    private char gender;

    //기본 생성자. 객체 생성만을 목적으로 사용된다.
    public User() {
    }
    
    //매개변수가 있는 생성자
    //객체 생성과 동시에 전달된 값들을 
    public User(String id, String passward, String name){
        this.id = id;
        this.passward = passward;
        this.name = name;
    }

    public User(String hong1234, String number, Object o, String 홍길동) {
    }

    //매개변수가 있는 생성자(아이디, 패스워드,  이름, 나이, 성별)
    public User(String id, String passward, String name, int age, char gender) {
        /*this.id = id;
        this.passward = passward;
        this.name = name;*/
        //클래스내에서 문자열 매개변수 3개를 가지는 생성자를 호출한다.
        this(id,passward,name);
        this.age = age;
        this.gender = gender;
    }


    //메소드 선언
    public String information(){
        //매소드내부에서는 this()를 사용해서 생성자를 호출할 수없다.
        //this(id, passward, name);
        String information = String.format("%s %s %s %d %c\n", id, passward, name, age, gender);
        System.out.println("this : " + this);
        return information;
//        return String.format("%s %s %s %d %c\n", id, passward, name, age, gender);
    }
}
