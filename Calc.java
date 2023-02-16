
/*
 * 3. Реализовать простой калькулятор
 */
import java.util.Scanner;

class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int x = scanner.nextInt();
        System.out.print("Введите действие ");
        char arithmeticOperation = scanner.next().charAt(0);
        System.out.print("Введите второе число ");
        int y = scanner.nextInt();
        calculator(x, y, arithmeticOperation);
        scanner.close();
    }

    public static void calculator(int x, int y, char arithmeticOperation) {
        switch (arithmeticOperation) {
            case '+':
                sum(x, y);
                break;
            case '-':
                sub(x, y);
                break;
            case '/':
                div(x, y);
                break;
            case '*':
                mult(x, y);
                break;
            default:
                System.out.println("Ни один из case не сработал");
        }
    }

    public static void sum(int x, int y) {
        System.out.println(x + y);

    }

    public static void sub(int x, int y) {
        System.out.println(x - y);

    }

    public static void mult(int x, int y) {
        System.out.println(x * y);

    }

    public static void div(int x, int y) {
        if (y != 0) {
            System.out.println(x / y);
        } else {
            System.out.println("На ноль делить нельзя");
        }
    }

}