package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String shapeName;
    Integer field;

    public Triangle(String shapeName, Integer field) {
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
