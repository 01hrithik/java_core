class Coll{
    public int addition(int num_1,int num_2){
        return num_1+num_2;
    }

    public int subtract(int num_1,int num_2){
        return num_1-num_2;
    }

    public int multiply(int num_1,int num_2){
        return num_1*num_2;
    }

    public float divide(float num_1,float num_2){
        return num_1/num_2;
    }

    public float modlue(float num_1,float num_2){
        return num_1%num_2;
    }
}
public class clac {
    public static void main(String args[]){
        Coll dor = new Coll();
        System.out.println(dor.modlue(8,9));

    }
}
