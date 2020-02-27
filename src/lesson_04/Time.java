package lesson_04;


 /*Создать класс, описывающий промежуток времени.
        Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами.
        Создать метод для получения полного количества секунд в объекте
        Создать два конструктора: первый принимает общее количество секунд, второй - часы, минуты и секунды по отдельности.
        Создать метод для вывода данных.
        Написать программу для тестирования возможностей класса.*/


public class Time {
    private int hours;
    private int seconds;
    private int minutes;

    private Time(){
    }

    private Time(int seconds) {
        this.seconds = 3000;
        System.out.println(seconds);
    }

    private Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
              }

     public int getHours() {
        return hours;
     }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public int toSeconds() {
        final int i = hours * 3600 + minutes * 60 + seconds;
        return i;
    }
    public String getTime(int s){
        int hours = s / 3600;
        int minutes = (s % 3600) / 60;
        int seconds = s % 60;
        return  hours + "ч " + minutes + "мин " + seconds+ "сек ";
            }

    public static void main(String[] args) {
        Time time = new Time();
        Time time1 = new Time(3000);
        Time time2 = new Time(5, 35, 45);

        System.out.println(time);
    }
}