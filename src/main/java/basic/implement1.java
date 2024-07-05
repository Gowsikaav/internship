package basic;


public class implement1 extends Aditionalprogram {



    @Override
    public void ArithemeticOperator(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }

    @Override
    public void additional(int a, int b) {
        int data = a - b;
        System.out.println(data);

    }

    public static void main(String[] args) {


    implement1 imple = new implement1();
        imple.AdditionMethod(22,85);
        imple.ArithemeticOperator(55,55);
        imple.additional(1500,650);
}
}