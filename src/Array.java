public class Array {
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
        for (int i = 0; i < 12; i++) {
            if (namesOfMonth[i] != "December") {
            System.out.print(namesOfMonth[i] + ", ");
            }
            if (namesOfMonth[i] == "December")
            {System.out.println(namesOfMonth[i] + ".");
            }
        }
    }
}
