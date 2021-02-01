package ru.geekbrains.shapes;

public class Triangle extends Shape{

  int a;
  int b;

  public Triangle(int a, int b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public double Area() {
    return (a * b) / 2;
  }

  @Override
  public void Print() {
    System.out.println("Площадь треугольника: " + Area());
  }
}
