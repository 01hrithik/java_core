class Human_{
    int age;
    String Name;

    public Human_(){
        age=20;
        Name="love";
        System.out.println("in constructor");
    }

    public Human_(int age,String Name){
      this.age=age;
      this.Name=Name;
    }
}
public class constructor {
    public static void main(String args[]){
        Human_ gen_v = new Human_();
        gen_v.age=20;
        gen_v.Name="Hrithik";

        Human_ gen_H = new Human_();
        gen_H.age=20;
        gen_H.Name="Shreya";
        Human_ gen_M = new Human_(20,"Mansi");
        System.out.println("Name:-"+gen_v.Name+" "+"Age:-"+gen_v.age);
        System.out.println("Name:-"+gen_H.Name+" "+"Age:-"+gen_H.age);
        System.out.println("Name:-"+gen_M.Name+" "+"Age:-"+gen_M.age);
    }
}
