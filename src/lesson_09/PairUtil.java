
package lesson_09;

/* Создать статический обобщённый метод swap в final классе PairUtil.
        Метод должен принимать объект класса Pair и возвращать пару,
         в которой элементы поменяны местами.*/

public final class PairUtil {
    public static <K, V> Pair<V, K> swap(Pair<K, V> obj) {
        return new Pair<>(obj.getPairV(), obj.getPairK());
    }
}