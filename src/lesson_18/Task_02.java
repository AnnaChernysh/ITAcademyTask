/*

package lesson_18;

*/
/*Безумный учёный каждую ночь на протяжении 50 суток отправляет своего прислужника
        на свалку фабрики роботов за деталями.
        Чтобы собрать одного робота нужно:
        Голова, Тело, Левая рука, Правая рука, Левая нога, Правая нога, CPU, RAM, HDD
        В первую ночь фабрика выбрасывает 20 случайных деталей на свалке.
        Каждую последующую ночь фабрика выбрасывает на свалку от 1 до 4 случайных деталей.
        В то же самое время прислужник отправляются на свалку и  собирает от 1 до 4 случайных деталей.
        Если на свалке деталей нет – прислужник уходит ни с чем.
        Затем он возвращаются домой и отдаёт детали хозяину.
        Учёный пытается собрать робота из деталей, которые есть в наличии.
        Написать программу, симулирующую этот процесс. Для симуляции принять,
        что каждая ночь наступает через 100мс.
        Фабрика и прислужник действуют в одно и то же время.
        После 50 ночей (около 5 секунд) определить количество собранных роботов.*//*




import java.util.*;

public class Task_02 {
    int period = 50;
    String parts;

    public String getParts() {
        return parts;
    }

    public void setParts(String parts) {
        this.parts = parts;
    }

    public enum Parts {
        HEAD,
        BODY,
        LEFTHAND,
        RIGHTHAND,
        LEFTLEG,
        RIGHTLEG,
        CPU,
        RAM,
        HDD;


     Map<String,Integer> map = new HashMap<Parts,Number>;{
        map.put("HEAD", 1);
        map.put("BODY", 2);
        map.put("LEFTHAND", 3);
        map.put("RIGHTHAND", 4);
        map.put("LEFTLEG", 5);
        map.put("CPU", 5);
        map.put("RAM", 5);
        map.put("HDD", 5);
        }
                List<Integer> valuesList = new ArrayList<Integer>(map.values());
        int randomIndex = new Random().nextInt(valuesList.size());
        Integer randomValue = valuesList.get(randomIndex);

public static void main(String[] args) {

        for ( Parts parts : Parts.values()) {

        System.out.println("Enum value is "+ parts.value  + "    Map vlaue is "+ parts.get(parts.name()));
        }

*/




