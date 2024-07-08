package hw;

public class HomeworkSix {
    public static void main(String[] args) {
        boolean weatherGood = true;
        boolean dayLight = true;
        if (weatherGood && dayLight) {
            System.out.println("Гулять");
        }
        if (!weatherGood && dayLight) {
            System.out.println("Читать книгу");
        }
        if (!dayLight) {
            System.out.println("Спать");
        }
    }

}
