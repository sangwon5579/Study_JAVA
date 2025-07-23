package com.beyond.assiststream.practice;

import java.io.*;

public class C_DataSteam {
    public void fileSaveAndRead(){
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("b_data.txt"));
             DataInputStream dis = new DataInputStream(new FileInputStream("b_data.txt"))) {

            //파일에 데이터를 출력하기
            dos.writeUTF("홍길동");
            dos.writeInt(30);
            dos.writeDouble(175.3);
            dos.writeChar('남');
            dos.writeBoolean(false);

            //파일에서 데이터를 읽어오기
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readChar());
            System.out.println(dis.readBoolean());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
