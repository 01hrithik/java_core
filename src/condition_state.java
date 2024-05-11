import java.util.Scanner;
public class condition_state {
    public static void main(String args[]){
        Scanner call = new Scanner(System.in);
         int age = call.nextInt();
        //if condition check.
        if(age >= 18){
            System.out.println("congs! you can vote");
        }else {
            System.out.println("you're not eligible for vote");
        }

        //compare number.
        System.out.print("enter first number :");
        int num_1=call.nextInt();
        System.out.print("enter second number :");
        int num_2=call.nextInt();
        System.out.print("enter third number :");
        int num_3=call.nextInt();

        if((num_1 > num_2) && (num_1 > num_3)){
            System.out.println("the highest num :"+num_1);
        }else if((num_2>num_1)&&(num_2>num_3)){
            System.out.println("the highest num :"+num_2);
        }else{
            System.out.println("the highest num :"+num_3);
        }
    }
}
