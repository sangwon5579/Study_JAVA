package com.beyond.file.practice;

import java.io.File;
import java.io.IOException;

/*
    File 클래스
    - 파일 크기, 속성, 이름 등의 정보를 얻어내는 기능과 파일 생성 및 삭제하는 기능을 제공
    - 파일의 데이터를 읽고 쓰는 기능은 지원하지 않는다
    - 파일의 데이터를 읽고 쓰기 위해서는 파일 관련 입출력 스트림 사용해야 한다
 */
public class A_File {
    public void method1(){

        try {
            File file = new File("test.txt");   //메모리상에만 존재하는 객체
            file.createNewFile();   //실제 파일이 만들어진다
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
