package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculateArea() {
        return width * height;
    }

    int caclulatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
