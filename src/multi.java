class AO{
   int price;
    String brand;

    public int getPrice(int price){
        return this.price=price;
    }

    public String getBrand(String brand){
        return this.brand=brand;
    }

    public boolean equl(AO that){
        if(this.brand.equals(that.brand) && this.price == that.price){
            return true;
        }else{
            return false;
        }
    }
}
public class multi {
    public static void main(String[] args) {
        AO hr = new AO();
        hr.brand="msi";
        hr.price=42000;
        AO rh = new AO();
        rh.brand="msi_";
        rh.price=42000;
        boolean result =hr.equl(rh);
        System.out.println("BRAND:-"+hr.getBrand("msi")+" "+"PRICE:-"+ hr.getPrice(42000));
        System.out.println("BRAND:-"+rh.getBrand("msi")+" "+"PRICE:-"+ rh.getPrice(42000));
        System.out.println(result);
        System.out.println("BRAND:-"+hr.brand+" "+"PRICE:-"+ hr.price);
        System.out.println("BRAND:-"+rh.brand+" "+"PRICE:-"+ rh.price);
    }
}
