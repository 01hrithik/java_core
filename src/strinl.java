class Mobile{
    String brand;
    String Name;
    int price;
    String Network;

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



    }
}
