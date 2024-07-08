public class WhatToDo {
    public static void main(String[] args) {
        boolean isGoodWeather = true;
        boolean isNight = false;
        if (isNight) {
            System.out.println("Sleep");
        }
        if (!isNight && isGoodWeather) {
            System.out.println("Walk");
        }
        if (!isNight && !isGoodWeather) {
            System.out.println("Read");
        }
    }


}
