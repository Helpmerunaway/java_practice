public class ArrayInt {
    public static void main(String[] args) {
        int[] numbers = {4, 1, 34, 45, 13, 666};
        // код не привязан к массиву
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);

        // вывод массива в обратном порядке
        for (int i = numbers.length -1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
