public class Variable {
    // операции с челыми числами:
    // сложение +
    // вычитание -
    // умножение *
    // остаток от деления %
    // можно использовать скобки для определения последовательсти действий

    public static void main(String[] args) {
        int days = 10000;
        int year = days / 365;
        int month = (days % 365) / 30;
        int day = (days % 365) % 30;
        // int left_days = days - (year * 365) - (month * 30);
        System.out.println("Лет " + year);
        System.out.println("Месяцев " + month);
        System.out.println("Дней " + day);

    }

}
