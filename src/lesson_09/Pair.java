/*
package lesson_09;
        */
/*Создать класс Pair, параметризованный двумя параметрами K и V.
        Класс должен хранить две переменные типов K и V соответственно. У класса должен быть конструктор,
        принимающий 2 параметра типов K и V, а также набор соответствующих геттеров/сеттеров.*//*


public class Pair <K, V> {
    private K pairKey;
    private V pairValue;

    Pair(){
    }

    Pair (K pairKey, V pairValue) {
        this.pairKey = pairKey;
        this.pairValue = pairValue;

    }

    public K getPairKey() {
        return pairKey;
    }

    public void setPairKey(K pairKey) {
        this.pairKey = pairKey;
    }

    public V getPairValue() {
        return pairValue;
    }

    public void setPairValue(V pairValue) {
        this.pairValue = pairValue;
    }

    @Transaction
    public static void transactionTesting() {
        ApplicationLogger.LOGGER.info("Transaction processing, please wait");

    }

*/
