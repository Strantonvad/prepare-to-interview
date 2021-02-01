package ru.geekbrains.builder;

public class Main {
  public static void main(String[] args) {

    Person person = Person.newBuilder()
          .setFirstName("Ivan")
          .setAge(23)
          .build();

    System.out.println(person.getFirstName() + "\n" +person.getAge());
  }
}
