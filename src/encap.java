class Human{
    private int age;
    private String Name;

    public int getAge(){
        return age;
    }

    public void SetAge(int a){
        age =a;
    }

    public void SetName(String n){
        Name=n;
    }
    public String NAme(){
        return Name;
    }

}
public class encap {
    public static void main(String args[]){
   Human gen = new Human();
   gen.SetAge(22);
   gen.SetName("Hrithik");

   System.out.println("Name:-"+gen.NAme()+" "+"age:-"+gen.getAge());
    }
}
