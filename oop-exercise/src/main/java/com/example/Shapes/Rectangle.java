package com.example.Shapes;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2*(height+width);
    }

    @Override
    public String toString(){
        return String.format(
                "Shape: Rectangle\n" +
                        "\n" +
                        "Properties:\n" +
                        "Height = %.2f\n" +
                        "Width = %.2f\n" +
                        "\n" +
                        "Area = %.2f\n" +
                        "Perimeter = %.2f",height,width,getArea(),getPerimeter()
        );
    }

}
