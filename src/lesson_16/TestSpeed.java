package lesson_16;
/*1.	Сравнить скорость чтения и записи 5 МБ
    символов при использовании классов буфиризированого и не буфиризированого символьного ввода вывода.*/

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

    public class TestSpeed {
        private byte[] oneMB = new byte[1024 * 1024];

        public static void main(String[] args) throws IOException {
            new TestSpeed().execute(args);
        }

        private void execute(String[] args) throws IOException {
            long size = Long.parseLong(args[1]);
            testWriteSpeed(args[0], size);
            testReadSpeed(args[0], size);
        }

        private void testWriteSpeed(String filePath, long size) throws IOException {
            File file = new File(filePath);
            BufferedOutputStream writer = null;
            long start = System.currentTimeMillis();
            try {
                writer = new BufferedOutputStream(new FileOutputStream(file), 1024 * 1024);
                for (int i = 0; i < size; i++) {
                    writer.write(oneMB);
                }
                writer.flush();
            } finally {
                if (writer != null) {
                    writer.close();
                }
            }
            long period = System.currentTimeMillis() - start;
             System.out.println(period);
        }

        private void testReadSpeed(String filePath, long size) throws IOException {
            File file = new File(filePath);
            BufferedInputStream reader = null;
            long start = System.currentTimeMillis();
            try {
                reader = new BufferedInputStream(new FileInputStream(file), 1024 * 1024);
                for (int i = 0; i < size; i++) {
                    reader.read(oneMB);
                }
            } finally {
                if (reader != null) {
                    reader.close();
                }
            }
            long period = System.currentTimeMillis() - start;
            System.out.println(period);
        }

        private double calculateSpeed(long size, long period) {
            double seconds = ((double) period) / 1000L;
            double speed = ((double) size) / seconds;
            return speed;
        }
}
