package com.beyond.assiststream.practice;

import java.io.*;

public class A_ByteToCharStream {
    //InputStreamReader test
    public void method1(){
        try {
            String line;
            //여러개의 보조스트림을 연결해서 사용할 수 있다
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("문자열 입력 > ");
            line = br.readLine();
            System.out.println(line);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //OutputStreamWriter test
    public void method2(){
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write("안녕하세요. 저는 이몽룡입니다.");
            bw.newLine();
            bw.write("만나서 반가워요.. 힘내세요..^^");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
