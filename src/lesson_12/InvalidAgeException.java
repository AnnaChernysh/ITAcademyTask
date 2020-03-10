package lesson_12;

import javafx.concurrent.Worker;

/*Создать собственный класс-исключение - наследник класса Exception.
        Создать метод, выбрасывающий это исключение.
        Вызвать этот метод и отловить исключение. Вывести stacktrace в консоль.
*/
public class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
	super(s);
	}
}
	class TestException {

		static void getvalid(int age) throws InvalidAgeException {
			if (age < 18)
				throw new InvalidAgeException("not valid");
			else
				System.out.println("welcome!");
		}

		public static void main(String args[]) {
			try {
				getvalid(57);
			} catch (RuntimeException | InvalidAgeException e) {
				e.printStackTrace();
			}

		}

	}