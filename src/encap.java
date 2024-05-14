class Human{
    private int age;
    private String Name;

    public int getAge(){
        return age;
    }

    public void SetAge(int age){
        this.age =age;
    }

    public void SetName(String Name){
        this.Name=Name;
    }
    public String NAme(){
        return Name;
    }

}
public class encap {
    public static void main(String args[]){
   Human gen = new Human();
   gen.SetAge(20);
   gen.SetName("Hrithik");

   System.out.println("Name:-"+gen.NAme()+" "+"age:-"+gen.getAge());
    }
}
