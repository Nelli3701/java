/*
 * 2. Вывести все простые числа от 1 до 1000
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        simpleNum();
    }

    public static void simpleNum() {
        for (int i = 1; i < 1000; i++) {
            if (isSimple(i))
                System.out.println(i);
        }
    }

    public static boolean isSimple(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}