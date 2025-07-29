package com.beyond.io;

import com.beyond.io.model.dao.FileDao;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FileDao fd = new FileDao();

        while(true){
            System.out.println("*****MyNote*****");
            System.out.println("1. 노트 새로 만들기");
            System.out.println("2. 노트 열기");
            System.out.println("3. 노트 열어서 수정하기");
            System.out.println("4. 끝내기");
            System.out.print("번호를 입력하세요 : ");
            int num = sc.nextInt();
            if(num==1){
                fd.fileSave();
            }
            else if(num==2){
                fd.fileOpen();
            }
            else if(num==3){
                fd.fileEdit();
            }
            else if(num==4){
                break;
            }
            else{
                System.out.println("잘못된 입력 ..");
            }
        }

    }
}
