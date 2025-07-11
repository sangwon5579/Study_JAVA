//패키지(Package)
//java에서 클래스를 관리하기 위해 패키지를 사용한다.
//폴더를 만들어서 파일을 저장하고 관리하듯이 패키지를 만들어 클래스를 저장하고 관리한다.
package com.beyond.variable;
//블록 주석 : 컨트롤 + /

import com.beyond.variable.practice.A_Variable;

//클래스의 이름은 java 파일의  이름과 동일
public class Application {
    //main 메소드
    //프로젝트의 시작점. java.exe가 Application.class를 실행시킬 때 제일 먼저 실행되는 메소드.
    public static void main(String[] args) {
        //main 메소드에 A_Variable 클래스에 variableTest 메소드를 호출(실행)
        // 1) 실행할 메소드가 있는 클래스를 생성(new) 해야한다
        //[표현법]
        //  클래스명 변수명(이름) = new 클래스명();

        // 1-1) import 문을 사용하지 않고 클래스 생성
        //com.beyond.variable.practice.A_Variable variable = new com.beyond.variable.practice.A_Variable();

        // 1-2) import 문을 사용해서 클래스 생성
        A_Variable variable = new A_Variable();

        // 2) 생성한 클래스로 메소드 호출(실행)
        // [표현법]
        //  변수명.메소드명();
        variable.variableTest();

        System.out.println("==========================");
        variable.autoCasting();

        System.out.println("==========================");
        variable.casting();
    }
}