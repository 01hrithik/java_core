import java.util.Arrays;

enum Status{
    Run,Rest,Pending,Success;
}
public class enum_ {
    public static void main(String[] args) {

        Status[] s = Status.values();
        System.out.println(Arrays.toString(s));


    }
}
