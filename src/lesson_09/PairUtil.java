
package lesson_09;

/* Создать статический обобщённый метод swap в final классе PairUtil.
        Метод должен принимать объект класса Pair и возвращать пару, в которой элементы поменяны местами.*/

public final class PairUtil <K,V extends String> {
	public static class Pair<K, V> {
		private K name;
		private V value;

		Pair<String, String> p = new Pair<String, String>();

		public Pair(String value, String name) {
		}

		public static void swap(String name, String value) {
			return new Pair(value, name);
		}
	}
}

