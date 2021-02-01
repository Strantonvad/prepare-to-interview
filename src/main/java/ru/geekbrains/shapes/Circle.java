package ru.geekbrains.shapes;

public class Circle extends Shape{

  int radius;

  public Circle(int r) {
    radius = r;
  }

  @Override
  public double Area() {
    return Math.PI * radius * radius;
  }

  @Override
  public void Print() {
    System.out.println("Площадь круга: " + Area());
  }
}
