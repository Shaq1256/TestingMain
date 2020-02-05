package com.kodilla.testing.shape;

public class Square implements Shape {
    String shapeName;
    Integer field;

    public Square(String shapeName, Integer field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public String getShapeName() {
        return shapeName;
    }

    public Integer getField() {
        return field;
    }
}
