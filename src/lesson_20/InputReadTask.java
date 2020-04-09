package lesson_20;
/*Написать программу, бесконечно считывающую пользовательские числа из консоли.
        Эти числа представляют собой количество секунд.
        При каждом вводе числа, должна создаваться задача,
        которая засыпает на введённое число секунд и затем выводит "Я спал N секунд".
        Однако нужно сделать так, чтобы все задачи выполнялись в одном и
        том же потоке в порядке ввода.
        Т.е. в программе есть 2 потока: главный и поток для выполнения всех задач по очереди.
        При вводе -1 программа должна завершать свою работу.*/


import java.io.BufferedReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



import java.io.*;
import java.util.concurrent.*;



    public class InputReadTask implements Callable<String> {


        public String call() throws IOException {
            ExecutorService ex = Executors.newSingleThreadExecutor();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println("ConsoleInputReadTask run() called.");
            String input = String.valueOf(Integer.parseInt(br.readLine()));

            do {
                System.out.println("Type a number: ");
                try {
                    while (!br.ready()) {
                        Thread.sleep(Long.parseLong(br.readLine()));
                    }

                } catch (InterruptedException e) {
                    System.out.println("I was sleeping " + input + "seconds");
                }

                Future<String> result = ex.submit(InputReadTask);
                try {
                    input = result.get();
                } catch (ExecutionException | InterruptedException e) {
                    e.getCause().printStackTrace();
                }
                if (input == "-1") {
                    ex.shutdownNow();
                }
            }
