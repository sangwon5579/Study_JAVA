package com.beyond.assiststream.practice;

import java.io.*;

public class D_ObjectStream {
    public void fileSave(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c_object.dat"))) {
            oos.writeObject(new Member("hong123", "1234", "홍길동",30,'남'));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void fileRead() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c_object.dat"))) {

            Member member = (Member) ois.readObject();

            System.out.println(member);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
