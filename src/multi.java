class AO{
    private int price;
    private String brand;

    public int getPrice(int price){
        return this.price=price;
    }

    public String getBrand(String brand){
        return this.brand=brand;
    }

}
public class multi {
    public static void main(String[] args) {
        AO hr = new AO();

        System.out.println("BRAND:-"+hr.getBrand("msi")+" "+"PRICE:-"+ hr.getPrice(42000));
    }
}
