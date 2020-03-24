package lesson_16;
/*2.	Создать класс Computer. Добавить ему несколько полей, создать объект этого класса, сериализовать в файл.
        Десериализовать объект из того же файла, вывести значения полей в консоль.*/
import java.io.*;

public class Computer implements java.io.Serializable {

        public int memory;
        public String processor;

        public Computer(int memory, String processor)
        {
            this.memory = memory;
            this.processor = processor;
        }

            public static void main(String[] args)
        {
            Computer comp = new Computer(8, "Intel Core i5");
            String filename = "file.txt";

            try
            {
                FileOutputStream file = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(file);

                out.writeObject(comp);
                out.close();
                file.close();

                System.out.println("Object serialized");
            }
            catch(IOException ex)
            {
                System.out.println("IOException is caught");
            }
            Computer comp1= null;

            // Deserialization
            try
            {
                // Reading the object from a file
                FileInputStream file = new FileInputStream(filename);
                ObjectInputStream in = new ObjectInputStream(file);


                comp1 = (Computer)in.readObject();

                in.close();
                file.close();

                System.out.println("Object deserialized ");
                System.out.println("memory = " + comp1.memory);
                System.out.println("processor = " + comp1.processor);
            }

            catch(IOException ex)
            {
                System.out.println("IOException is caught");
            }

            catch(ClassNotFoundException ex)
            {
                System.out.println("ClassNotFoundException is caught");
            }

        }
    }

