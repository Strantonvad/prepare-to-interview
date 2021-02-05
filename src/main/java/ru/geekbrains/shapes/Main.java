package ru.geekbrains.shapes;

public class Main {
  public static void main(String[] args) {

    Shape[] shapes = new Shape[3];

    shapes[0] = new Circle(3);
    shapes[1] = new Rectangle(3, 5);
    shapes[2] = new Triangle(2, 1);

    for (Shape shape: shapes) {
      shape.Print();
    }

  }
}
