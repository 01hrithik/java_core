class Clac{
    public int addition(int num_1,int num_2){
        return num_1+num_2;
    }

    public int subtract(int num_1,int num_2){
        return num_1-num_2;
    }

    public int multiply(int num_1,int num_2){
        return num_1*num_2;
    }

    public int divide(int num_1,int num_2){
        return num_1/num_2;
    }

    public int modlue(int num_1,int num_2){
        return num_1%num_2;
    }
}
public class clac {
    public static void main(String args[]){
        Calc obj = new Calc();
       int r= obj.add(6,9);
        System.out.println(r);
    }
}
