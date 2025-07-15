package com.beyond.array.practice;

public class B_TwoDimensionalArray {
    //2차원 배열 선언, 생성, 초기화(new)
    public void method1(){
        //선언, 생성
        int[][] iArray;
        iArray = new int[3][5];

        //2차원 배열 변수와 인덱스를 이용한 값 저장
        //1  2  3  4  5
        //6  7  8  9  10
        //11 12 13 14 15
        int value = 1;
        for(int i = 0 ; i < iArray.length; i++){
            for(int j = 0 ; j < iArray[i].length; j++){
                iArray[i][j] = value++;
            }
        }

        //출력
        for(int i = 0 ; i < iArray.length; i++){
            for(int j = 0 ; j < iArray[i].length; j++){
                System.out.printf("%2d, ", iArray[i][j]);
            }
            System.out.println();
        }
    }
    //2차원 배열 선언, 생성, 초기화(값의 목록)
    public void method2(){
//        String[][] sArray = new String[][]{
//                {"linux", "mariadb"},
//                {"java", "spring"}};
//        String[][] sArray = {
//                {"linux", "mariadb"},
//                {"java", "spring"},
//                {"html5", "css3", "vue.js"}};
        String[][] sArray = new String[3][];
        sArray[0] = new String[] {"linux", "mariadb"};
        sArray[1] = new String[] {"java", "spring"};
        sArray[2] = new String[] {"html5", "css3", "vue.js"};
        for(int i = 0; i<sArray.length; i++){
            for(int j = 0; j<sArray[i].length; j++){
                System.out.printf("%s\t", sArray[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void practice1(){
        int iArray[][] = new int[3][3];
        for(int i = 0; i < iArray.length; i++){
            for(int j = 0; j < iArray[i].length; j++){
                iArray[i][j] = (int)(Math.random() * 9 + 1);
                System.out.printf("%2d",iArray[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void practice2(){
        int[] temp = new int[9];
        int[][] iArray = new int[3][3];
        int index = 0;

        //1차원 배열을 이용해서 중복 제거된 랜덤 값 추출
        for(int i =0; i<temp.length; i++){
            temp[i] = (int)(Math.random() * 9 + 1);

            //중복제거
            for(int j = 0; j < i; j++){
                if(temp[i] == temp[j]){
                    i--;
                    break;
                }
            }
        }

        for(int i =0; i<iArray.length; i++){
            for(int j = 0 ; j < iArray[i].length; j++){
                iArray[i][j] = temp[index++];
                System.out.printf("%2d",iArray[i][j]);
            }
            System.out.println();
        }

    }
}
