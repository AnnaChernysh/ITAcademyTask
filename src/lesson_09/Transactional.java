package lesson_09;

import java.awt.*;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.List;
import java.util.stream.Nodes;

/*Задание Аннотации. Реализовать аннотацию Transaction и анализатор данной транзакции.
        Смысл данной аннотации заключается в том, что если метод помечен данной аннотацией,
        значит он вызывается в рамках транзакции.
        В рамках транзакции - когда выводится на консоль два сообщения:
        “Transaction is started”; “Transaction is ended”.*/

public class Task_05 {

  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)

  public @interface Transactional {
      public String name();
      public String value();

    public void transactionalMethod(){
    }


public class BankService{

   private String userName;
   private String id;
   private int transValue;
   private String transaction;

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public int getTransValue() {
        return transValue;
    }

    public void setTransValue(int transValue) {
        this.transValue = transValue;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Transactional(name="userName", value ="sum" );

    public void startTransaction(){
        System.out.println("Transaction is started");}
}
    public void endTransaction(){
        System.out.println("Transaction is ended");}
}

    @Transactional
public void getMoney(String userName, String value) throws Exception {

