import java.util.Scanner;
public class revese {
        public static void main(String args[]){
            Scanner call= new Scanner(System.in);
            System.out.print("ENTER THE VALUE : ");
            int Value = call.nextInt();
            int revsev=0,reminder=0;

            for(int i=0; i<Value; i++){
                reminder= Value % 10;
                revsev = revsev * 10 + reminder;
                Value /= 10;
            }
            System.out.println(revsev);
        }
}
