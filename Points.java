/*
 * Написать метод который приводит сторку к нормальному виду
 * строка на вход
 * Добрый день Как дела Все хорошо
 * выход
 * Добрый день. Как дела. Все хорошо.
 */

class Points {
    public static void main(String[] args) {
        String str = "Добрый день Как дела Все хорошо";
        points(str);
    }

    public static void points(String str) {
        str = str.replaceAll("\\s{1,}([А-ЯЁ])", ". $1");
        char point = '.';
        if (str.charAt(str.length() - 1) != point) {
            str += point;
        }
        System.out.println(str);
    }

}
