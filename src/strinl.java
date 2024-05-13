class Mobile{
    String brand;
    static String Name;
    int price;
    String Network;
    static{
        Name = "phone";
        System.out.println();
        System.out.println("it is static world!");
    }
    public Mobile(){
        brand ="";
        price=20000;
        Name="Smart-phone";
        System.out.println("it");
    }
    public void Show(){
        System.out.println("BRAND :- "+brand+" "+"NAME :- "+Name+" "+"PRICE :- "+price+" "+"NETWORK :- "+Network);
    }
}
public class strinl {
    public static void main(String args[]){
        String greeting = "Have a good day!";
        String Name = new String();
        Name = "hey Hrithik Gorane!";
        System.out.println(greeting);
        System.out.println(Name);
        System.out.println(Name.concat(" how are you?"));
        Name = Name+"good";

        String name = "raj";
        String name2 = "raj";
        System.out.println(name2 == name);
        System.out.println(name.compareTo(name2));
        StringBuffer sbi = new StringBuffer("Hrithik");
        System.out.println(sbi.capacity());
        System.out.println("length of string is :"+sbi.length());
        System.out.println("the append is :"+sbi.append(" love"));
        System.out.println("the delete is :"+sbi.deleteCharAt(3));

        //creating mobile object.

        Mobile obj_1= new Mobile();

        obj_1.brand="ios";
        obj_1.Name="iphone";
        obj_1.price=150000;
        obj_1.Network="jio";

        Mobile obj_2 = new Mobile();
        obj_2.price=20000;
        obj_2.Name="poco";
        obj_2.brand="xiami";
        obj_2.Network="jio";

        obj_1.Show();
        obj_2.Show();

        System.out.println(Name.charAt(1));
    }
}
