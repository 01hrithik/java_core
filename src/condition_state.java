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
        int num_1=call.nextInt();
        int num_2=call.nextInt();
        int num_3=call.nextInt();


    }
}
