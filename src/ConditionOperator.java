public class ConditionOperator {
    // if (условие) {
    // выполняемый код если условие выполняется true}
    // else if (еще одно условие) {если код в скобках - true}
    // else (все остальные условия)
    public static void main(String[] args) {
        int temp = 30;
        boolean hot = temp >= 25;
        boolean cold = temp <= 22;
        int time = 23;
        // || = логическое или
        boolean isNight = time > 22 || time < 6;
        // если сейчас жарко и сейчас не ночь
        // && = логическое и
        // ! = логическое не
        if (hot && !isNight) {
            System.out.println("Кондиционер включен");
        } else if (cold) {
            System.out.println("Кондиционер выключен");
        } else {
            System.out.println("Кондиционер ничего не делает");
        }
    }


}
