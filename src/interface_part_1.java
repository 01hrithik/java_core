@FunctionalInterface
interface MI{
    int show(int i,int j);
}

public class interface_part_1 {
    public static void main(String[] args) {
            MI oi = (i,j) -> i+j;
           int  ans= oi.show(5824,9080);
        System.out.println(ans);
    }
}
