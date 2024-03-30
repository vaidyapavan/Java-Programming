package Basic_java;

//Parent class
class Shape {
 protected double area;

 public void calculateArea() {
     System.out.println("Calculating area in Shape class");
 }

 public void displayArea() {
     System.out.println("Area: " + area);
 }
}

//Child class inheriting from Shape
class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public void calculateArea() {
     area = Math.PI * radius * radius;
 }
}

//Another child class inheriting from Shape
class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public void calculateArea() {
     area = length * width;
 }
}

public class Inheritance4{
 public static void main(String[] args) {
     Circle circle = new Circle(5);
     circle.calculateArea();
     circle.displayArea();

     Rectangle rectangle = new Rectangle(4, 6);
     rectangle.calculateArea();
     rectangle.displayArea();
 }
}
