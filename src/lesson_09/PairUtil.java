

/*
package lesson_09;


*/
/* Создать статический обобщённый метод swap в final классе PairUtil.
        Метод должен принимать объект класса Pair и возвращать пару, в которой элементы поменяны местами.*//*

public class PairUtil {

    static <K, V> Pair<K, V> swap(Pair<K, V> initialPair) {

        Pair swappedPair = new Pair(initialPair.getPairValue(), initialPair.getPairKey());

        return swappedPair;
    }
}*/
