package com.beyond.fileio.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class A_FileByteStream {
    public void fileSave(){
        FileOutputStream fos = null;
        byte[] values = {99, 100, 101, 102, 103};

        try {
            fos = new FileOutputStream("a_byte.dat",true);

            fos.write(97);
            fos.write('b');
            fos.write(10);  //줄바꿈 문자 저장
            fos.write('c');
            fos.write(10);
            fos.write('한'); //한글은 2바이트로 표현되기 때문에 바이트 단위 스트림으로는 출력에 제한이 있다
            fos.write(10);
            fos.write(values);
            fos.write(10);
            fos.write(values, 1, 2);
            fos.write(10);
            fos.flush();
            //위에서 예외 발생시 close 메소드 실행 안될수 있음
            //그래서 close()는 finally 에서 실행한다
            //fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fos.close();    //사용이 끝난 스트림 닫아주는 역할
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void fileRead(){
        FileInputStream fis = null;
        byte[] buffer = new byte[50];
        try {
            // 파일 존재하지 않으면 FileNotFoundException 예외를 발생한다
            fis = new FileInputStream("a_byte.dat");

//            System.out.print((char)fis.read());
//            System.out.print((char)fis.read());
//            System.out.print((char)fis.read());
//            int read= fis.read(buffer);
//            int read= fis.read(buffer, 10, 5);
//            System.out.println(fis.read(buffer));
//            System.out.println(Arrays.toString(buffer));
            //read() 메소드는 더 이상 읽어올 데이터가 없으면 -1을 리턴
//            System.out.println(fis.read());
            int value = 0;
            while ((value = fis.read()) != -1) {
                System.out.print((char)value);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
                try {
                    if(fis!=null){
                        fis.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
