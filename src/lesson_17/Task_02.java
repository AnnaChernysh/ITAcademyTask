package lesson_17;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;

//Дан список строк. Найти количество уникальных строк длиной более 8 символов.
public class Task_02 {
    public static void main(String[] args) {

    List<String> stringList = Arrays.asList("wonderful", "beautiful", "cool", "incredible", "good");
    long count = stringList
            .stream()
            .filter(s -> s.length() > 8)
            .distinct()
            .count();
    System.out.println(count);
}
}
