package com.beyond.assiststream.practice;

import java.io.*;

public class B_BufferedStream {
    public void fileSave(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("a_buffer.txt"))){
            bw.write("안녕하세요.");
            bw.newLine();   //BufferedWriter 클래스가 제공하는 메소드, 개행할 때 사용
            bw.write("줄바꿈 적용");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void fileRead(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("a_buffer.txt"));

            String line;

            //BufferedReader에서 제공하는 메소드로 파일에서 한 줄을 읽어올떄 사용한다
            //더 이상 읽어올 데이터가 없을 떄 null을 리턴한다
//            line = br.readLine();
//            System.out.println(line);

            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
