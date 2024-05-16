@FunctionalInterface
interface MI{
    void show(int i,int j);
}

public class interface_part_1 {
    public static void main(String[] args) {
            MI oi = (i,j) ->System.out.println("in show of love :-"+i+" -> "+j);
            oi.show(5824,9080);
    }
}
