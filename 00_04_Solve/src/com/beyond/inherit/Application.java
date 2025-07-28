package com.beyond.inherit;

import com.beyond.inherit.practice.Employee;
import com.beyond.inherit.practice.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("학생1", 20, 178.2, 70.0,1,"정보시스템공학과");
        students[1] = new Student("학생2", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new Student("학생3", 23, 167.0, 45.0, 4, "정보통신공학과");
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].information());
        }
        System.out.println("==============");

        int count = 0;
        Employee[] employees = new Employee[10];
        while(true){
            Scanner input1 = new Scanner(System.in);
            System.out.print("NAME > ");
            String name = input1.nextLine();

            Scanner input2 = new Scanner(System.in);
            System.out.print("AGE > ");
            int age = input2.nextInt();

            Scanner input3 = new Scanner(System.in);
            System.out.print("HEIGHT > ");
            double height = input3.nextDouble();

            Scanner input4 = new Scanner(System.in);
            System.out.print("WEIGHT > ");
            double weight = input4.nextDouble();

            Scanner input5 = new Scanner(System.in);
            System.out.print("SALARY > ");
            int salary = input5.nextInt();

            Scanner input6 = new Scanner(System.in);
            System.out.print("DEPT > ");
            String dept = input6.nextLine();

            employees[count] = new Employee(name, age, height, weight, salary, dept);

            Scanner input = new Scanner(System.in);
            System.out.print("계속 하시겠습니까? (y/n) > ");
            char answer = input.next().charAt(0);
            count++;
            if(answer == 'y'){
                continue;
            }
            else if(answer == 'n'){
                break;
            }
            else{
                throw new RuntimeException();
            }
        }
        System.out.println("총 카운트 : " + count);
        for(int i = 0; i < count; i++) {
            System.out.println(employees[i].information());
        }

    }
}
