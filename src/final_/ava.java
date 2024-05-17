package final_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ava {
    public static void main(String[] args) throws Exception {
        int num;

        //try with resources.
        try(  BufferedReader umm = new BufferedReader(new InputStreamReader(System.in));){

            num= Integer.parseInt(umm.readLine());
            System.out.println(num);

        }catch (Exception e){
            System.out.println("something wrong");
        }
    }
}
