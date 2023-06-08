import java.util.Scanner;
class Calculator {
    double a, b, x;

    public Calculator(double a, double b, double x) {
        this.a = a;
        this.b = b;
        this.x = x;
    }

    double lvl1() {
        return ((3 * x) + 5);
    }

    void lvl2() {
        if ((a - b) != 0) {
            System.out.println((a + b) / (a - b));
        } else {
            System.out.println("Error");
        }
    }

    public static int getFactorial(double f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    void lvl3() {
        if (b != 0 && ((a * x) / b)%1==0){
            System.out.println(getFactorial((a * x) / b));
        } else {
            System.out.println("Error");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите элементы выражений:");
        double a = in.nextDouble(), b = in.nextDouble(), x = in.nextDouble();
        Calculator calc = new Calculator(a ,b, x);
        double y = calc.lvl1();
        System.out.println(y);
        calc.lvl2();
        calc.lvl3();
    }
}
