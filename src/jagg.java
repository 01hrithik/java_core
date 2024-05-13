import java.util.Scanner;

class Student{
    String name;
    int roll_no;
}
public class jagg {
    public static void main(String args[]){

        //taking input from user.
        Scanner cs = new Scanner(System.in);
        int[][] array = new int[2][5];

        for(int i=0; i< array.length; i++){
            for (int j=0; j<= array.length; j++){
                array[i][j] = (int)(Math.random()*8);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        for(int n[]: array){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }

        int num[] = new int[6];

        for(int i=0; i< num.length; i++){
            num[i] = (int)(Math.random()*5);
            System.out.print(num[i]+" ");
        }
        System.out.println();
        Student hello = new Student();
        hello.name="rahul";
        hello.roll_no=1;

        Student s1 = new Student();
        s1.name="Hrithik";
        s1.roll_no=3;

        Student s2 = new Student();
        s2.name="kiran";
        s2.roll_no=2;

        Student s3 =new Student();
        s3.name="Shreya";
        s3.roll_no=4;

        Student t[] = new Student[4];
        t[0] = hello;
        t[1] =s2;
        t[2]=s1;
        t[3]=s3;

        for(int i=0;  i<t.length; i++){
            System.out.println("Name :- "+t[i].name +" ->- "+ "Roll No:- "+t[i].roll_no);
        }
        System.out.println("---->>>>>----");
       for(Student love :t){
           System.out.println("Name :- "+love.name +" -> "+"Roll No :- "+love.roll_no);
       }


    }
}
