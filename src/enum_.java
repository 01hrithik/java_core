import java.util.Arrays;

enum Status{
    Run,Failed,Pending,Success;
}

enum Laptops {
    Msi(42000), Mac(50000), Asus(43000), Dell(44000), Hp(45000);
    private int price;

    private Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class enum_ {
    public static void main(String args[]) {

        Status[] s = Status.values();
        System.out.println(Arrays.toString(s));

        Laptops lab = Laptops.Msi;
        System.out.println(lab);

        for(Laptops lap:Laptops.values()){
            System.out.println(lap+ " ->"+lap.getPrice());
    }


}
}
