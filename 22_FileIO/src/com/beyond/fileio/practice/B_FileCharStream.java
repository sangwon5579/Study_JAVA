package com.beyond.fileio.practice;

import java.io.*;
import java.util.Arrays;

public class B_FileCharStream {
    public void fileSave() {
        //try-with-resource 문을 통해서 사용한 리소스를 자동으로 close() 시킨다
        try(FileWriter fw = new FileWriter("b_char.txt",true)) {
            fw.write('A');
            fw.write('\n');
            fw.write('가');
            fw.write('\n');
            fw.write(new char[] {'a', 'p', 'p', 'l', 'e'});
            fw.write('\n');
            fw.write(new char[] {'안', '녕', '하', '세', '요','.'},2,4);
            fw.write('\n');
            fw.write("안녕하세요.\n");
            fw.write("저는 홍길동입니다.\n",3,8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileRead() {
        char[] buffer = new char[50];
        try(FileReader fr = new FileReader("b_char.txt")) {
//            System.out.println((char) fr.read());
//            System.out.println((char) fr.read());
//            System.out.println((char) fr.read());
//            System.out.println(fr.read(buffer,10,10));
//            System.out.println(Arrays.toString(buffer));
            int value;
            while ((value = fr.read()) != -1) {
                System.out.println((char)value);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
