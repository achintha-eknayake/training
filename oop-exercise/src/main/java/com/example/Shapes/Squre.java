package com.example.Shapes;

public class Squre extends Shape {

    private double length;

    public Squre(double lenght) {
        this.length = lenght;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * length;
    }

    @Override
    public String toString(){
        return String.format(
                "Shape: Squre\n" +
                        "\n" +
                        "Properties:\n" +
                        "Length = %.2f\n" +
                        "\n" +
                        "Area = %.2f\n" +
                        "Perimeter = %.2f",length,getArea(),getPerimeter()
        );
    }

}
