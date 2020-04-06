
package lesson_09;
 /*
Создать класс Pair, параметризованный двумя параметрами K и V.
        Класс должен хранить две переменные типов K и V соответственно. У класса должен быть конструктор,
        принимающий 2 параметра типов K и V, а также набор соответствующих геттеров/сеттеров.*/

public class Pair<K, V> {
    protected K pairK;
    protected V pairV;

    public Pair(K k, V v) {
        this.pairK=k;
        this.pairV=v;
    }

    public K getPairK() {
        return pairK;
    }

    public void setPairK(K pairK) {
        this.pairK = pairK;
    }

    public V getPairV() {
        return pairV;
    }

    public void setPairV(V pairV) {
        this.pairV = pairV;
    }
}