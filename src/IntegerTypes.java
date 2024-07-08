public class IntegerTypes {
    public static void main(String[] args) {
        // если в выражении используются различные типы данных то результат выражения будет приведен к самому большему
        // из типов
        long speed = 300_000;
        // неявное приведение типа от меньшего int в больший long
        long distance = 365 * 24 * 60 * 60 * speed;
        // wrong answer with int speed = -1012953088
        System.out.println(distance);

        // значения byte от 127 до -128
        byte b = 127;
        // b = b + 1;
        b ++;
        // при переполнении получаем минимальное число в данном случае -128
        System.out.println(b);
        // явное приведение типа от большего int к меньшему byte в виде переменной b
        b = (byte) (b + 10);
        System.out.println(b);
        // как увеличить значение а на 1?
        int a = 5;
        // первый способ
        a = a + 1;
        // второй способ
        a += 1;
        // третий способ
        a ++ ;

        a += 10;
        a -= 6;
        //a-- ;
    }
}
