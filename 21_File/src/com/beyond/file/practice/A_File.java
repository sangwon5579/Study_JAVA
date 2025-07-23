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
//            File file = new File("C:\\Users\\chosw\\OneDrive\\바탕 화면\\beyond_java\\test.txt");
            System.out.printf("파일 이름 : %s\n", file.getName());
            System.out.printf("파일 경로 : %s\n", file.getAbsolutePath());
            System.out.printf("파일 용량 : %s\n", file.length());
            System.out.printf("파일 존재 여부 : %b\n", file.exists());
            System.out.printf("파일 여부 : %b\n", file.isFile());
            System.out.printf("디렉터리 여부 : %b\n", file.isDirectory());
            if(file.exists()){
                file.delete();          //파일 or 디렉터리 삭제
            }
            else{
                file.createNewFile();   //파일 생성
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void method2(){
//        File file = new File("C:/Users/chosw/OneDrive/바탕 화면/beyond_java/temp/demo/demo.txt");
        try {
            boolean result = false;
//            File temp = new File("C:/Users/chosw/OneDrive/바탕 화면/beyond_java/temp");
            File demo = new File("C:/Users/chosw/OneDrive/바탕 화면/beyond_java/temp/demo");
            File file = new File("C:/Users/chosw/OneDrive/바탕 화면/beyond_java/temp/demo/demo.txt");

            if(!demo.exists()){
                result = demo.mkdirs(); //경로상에 없는 모든 폴더(이렉터리)를 생성하는 메소드
            }
            System.out.printf("폴더 생성 여부 : %b\n", result);

            if(!file.exists()){
                result = file.createNewFile();
            }
            System.out.printf("파일 생성 여부 : %b\n", result);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
