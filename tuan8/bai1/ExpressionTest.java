package tuan8.bai1;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression num1 = new Numeral(10);
        Expression num2 = new Numeral(-1);
        Square sq = new Square(num1);
        Addition add1 = new Addition(sq, num2);
        System.out.println(sq.toString()+num2.toString() +" = " + add1.evaluate());

        Expression num3 = new Numeral(2);
        Expression num4 = new Numeral(3);
        Expression num5 = new Numeral(1);
        Subtraction sub = new Subtraction(sq, num5);
        Multiplication mul = new Multiplication(num3, num4);
        Addition add2 = new Addition(sub, mul);
        System.out.println(add2.toString()+ " = " + add2.evaluate());

        Expression num6 = new Numeral(0);
        Division div = new Division(add2, num6);
        try {
            System.out.println("("+add2.toString()+")/"+num6+" = " + div.evaluate());
        }
        catch (ArithmeticException e){
            System.out.println("Loi khi chia cho 0");
        }


    }
}
