package lesson_09;
        /*Создать класс Pair, параметризованный двумя параметрами K и V.
        Класс должен хранить две переменные типов K и V соответственно. У класса должен быть конструктор,
        принимающий 2 параметра типов K и V, а также набор соответствующих геттеров/сеттеров.*/

    public class Pair<K,V>{
     private K name;
     private V value;

     public Pair(){
        };
        public Pair (K name, V value) {
            this.name = name;
            this.value = value;
        }

        public K getName() {
            return name;
        }
        public void setName(K name) {
            this.name = name;
        }
        public V getValue() {
            return value;
        }
        public void setValue(V value) {
            this.value = value;
        }

     }
class Test {
    public static void main(String[] args) {
        Pair<String, String> pair = new Pair<>("Java", "Good");
    }
}
