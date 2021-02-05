package ru.geekbrains.shapes;

public class Rectangle extends Shape {

  int a;
  int b;

  public Rectangle(int a, int b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public double Area() {
    return a * b;
  }

  @Override
  public void Print() {
    System.out.println("Площадь прямоугольника: " + Area());
  }
}
