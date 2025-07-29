package com.beyond.io.model.dao;

import com.beyond.io.Application;

import java.io.*;
import java.util.Scanner;

public class FileDao {
    private Scanner sc = new Scanner(System.in);

    public FileDao() {};

    public void fileSave(){
        StringBuilder sb = new StringBuilder();
        while(true){
            System.out.println("파일에 저장할 내용을 입력하시오(\"exit\"을 입력하면 내용 입력 끝) : ");
            String str = sc.nextLine();
            if(str.equals("exit")){
                break;
            }
            else{
                sb.append(str).append(System.lineSeparator());  //줄바꿈
            }
        }

        System.out.println("저장하시겠습니까? (y/n) > ");
        char yn = sc.next().charAt(0);
        sc.nextLine();

        if(yn == 'y' || yn == 'Y'){
            System.out.println("저장할 파일명을 입력하시오 : ");
            String fileName = sc.nextLine();
            if(!fileName.endsWith(".txt")){
                fileName += ".txt";
            }

            BufferedWriter bw = null;
            try{
                bw = new BufferedWriter(new FileWriter(fileName));
                bw.write(sb.toString());
                System.out.println("입력받은 " + fileName + " 파일에 성공적으로 저장하였습니다.");
            }catch (IOException e) {
                e.printStackTrace();
            }finally{
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        else{
            System.out.println("다시 메뉴로 돌아갑니다.");
        }

    }

    public void fileOpen(){
        System.out.print("열기 할 파일명 : ");
        String fileName = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String i;
            while((i = br.readLine()) != null){
                System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("존재하는 파일이 없습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileEdit(){
        System.out.print("수정 할 파일명 : ");
        String fileName = sc.nextLine();
        try {
            BufferedReader fr = new BufferedReader(new FileReader(fileName));
            String s;
            while((s = fr.readLine()) != null ){
                System.out.println(s);
            }
            fr.close();
            System.out.print("파일에 추가할 내용을 입력하시오 : ");
            StringBuilder str = new StringBuilder();
            while(true){
                String input = sc.nextLine();
                if(input.equals("exit")){
                    break;
                }
                str.append(input).append(System.lineSeparator());
            }
            System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) > ");
            char yn = sc.next().charAt(0);
            sc.nextLine();
            if(yn == 'y' || yn == 'Y'){
                BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
                bw.write(str.toString());
                bw.close();
                System.out.println(fileName + " 파일의 내용이 변경되었습니다. ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
