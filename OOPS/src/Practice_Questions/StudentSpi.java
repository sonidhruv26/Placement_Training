package Practice_Questions;

import java.util.Scanner;

class Student{
    int id_no, spi;
    String[] subject = new String[6];
    int marks[];
    Student(int id, int grade){
        Scanner scan = new Scanner(System.in);
        id_no = id;
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter grade of Student of"+id+" Subject-"+(i+1)+" :");
            marks[i] = scan.nextInt();
        }
    }
    int subCredit = 5;
    void display(){
        int sumOfCredit = 0;
        for (int i = 0; i < 6; i++) {
            sumOfCredit += (subCredit * marks[i])/50;
        }
        System.out.println("SPI of Student with ID: "+id_no+" : "+(sumOfCredit/6));
    }
}

public class StudentSpi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of Student: ");
        int n = scan.nextInt();
        Student[] student = new Student[n];
        for (int i = 0; i < n; i++) {
//            student[i] = new Student();
        }
    }
}

