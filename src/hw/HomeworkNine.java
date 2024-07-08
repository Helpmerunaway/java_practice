package hw;

public class HomeworkNine {
    public static void main(String[] args) {
        String[] namesOfMonth = new String[12];
        namesOfMonth[0] = "January";
        namesOfMonth[1] = "February";
        namesOfMonth[2] = "March";
        namesOfMonth[3] = "April";
        namesOfMonth[4] = "May";
        namesOfMonth[5] = "June";
        namesOfMonth[6] = "July";
        namesOfMonth[7] = "August";
        namesOfMonth[8] = "September";
        namesOfMonth[9] = "October";
        namesOfMonth[10] = "November";
        namesOfMonth[11] = "December";
        // изменение длины массива не влияет на код засчет использования .length
        for (int i = 0; i < namesOfMonth.length; i++) {
            System.out.print(namesOfMonth[i]);
            // в проверке тоже вместо 11 - указываем длину массива nameOfMonth.length
            if (i < namesOfMonth.length - 1) {
                System.out.print(", ");
            }
            else {
                System.out.println(".");
            }
        }
    }
}

// January, February, March, April, May, June, July, August, September, October, November, December.