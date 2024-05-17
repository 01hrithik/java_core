import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Scanner;

public class input {
    public static void main(String[] args) throws Exception  {
        System.out.println("hello what's you're name :-");
        InputStreamReader bf = new InputStreamReader(System.in);
        BufferedReader gf = new BufferedReader(bf);
        int num = Integer.parseInt(gf.readLine());
        System.out.println(num);


        Scanner call = new Scanner(System.in);
        int love = call.nextInt();
        System.out.println(love);
    }
}
