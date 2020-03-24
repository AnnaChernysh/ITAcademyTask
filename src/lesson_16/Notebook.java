package lesson_16;
	/*Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad -
также созданного класса со своими полями.
        Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл.
        Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.
*/
import java.io.*;
public class Notebook implements Serializable {
	String processor;
	int memory;
	int battery;
	transient int screen;
	String Touchpad;


public Notebook(String processor, int memory, int battery, int screen, String Touchpad)
			{
				this.processor = processor;
				this.memory = memory;
				this.battery = battery;
				this.screen = screen;
				this.Touchpad = Touchpad;
			}

			public static void printdata(Notebook object1)
			{

				System.out.println("processor = " + object1.processor);
				System.out.println("memory = " + object1.memory);
				System.out.println("battery = " + object1.battery);
				System.out.println("screen = " + object1.screen);
				System.out.println("Touchpad = " + object1.Touchpad);
			}

			public static void main(String[] args)
			{
				Notebook object = new Notebook("AMD", 32, 10, 15, "Synaptics");
				String filename = "data.txt";

				// Serialization
				try {

					FileOutputStream file = new FileOutputStream(filename);
					ObjectOutputStream out = new ObjectOutputStream(file);

					out.writeObject(object);

					out.close();
					file.close();

					System.out.println("Object serialized\n"
							+ "Data before Deserialization.");
					printdata(object);

				}

				catch (IOException ex) {
					System.out.println("IOException is caught");
				}

				object = null;

				// Deserialization
				try {

					// Reading the object from a file
					FileInputStream file = new FileInputStream
							(filename);
					ObjectInputStream in = new ObjectInputStream
							(file);

					// Method for deserialization of object
					object = (Notebook) in.readObject();

					in.close();
					file.close();
					System.out.println("Object deserialized\n"
							+ "Data after Deserialization.");
					printdata(object);

				}

				catch (IOException ex) {
					System.out.println("IOException is caught");
				}

				catch (ClassNotFoundException ex) {
					System.out.println("ClassNotFoundException" +
							" is caught");
				}
			}
		}

