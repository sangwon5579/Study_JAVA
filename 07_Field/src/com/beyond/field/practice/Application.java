package com.beyond.field.practice;

public class Application {
    public static void main(String[] args) {
        //접근 제한자 테스트
        User user = new User();

        // 1) public : 어디서든 필드에 직접 접근이 가능
        user.id = "hong";
        System.out.println(user.id);

        // 2) protected : 깉은패키지, 자식 클래스에서만 직접 접근이 가능
        user.address="경기도";
        System.out.println(user.address);

        // 3) default : 같은 패키지 내에서만 직접 접근이 가능
        user.name = "이몽룡";
        System.out.println(user.name);

        // 4) private : 클래스 내에서만 직접 접근이 가능
    }
}
