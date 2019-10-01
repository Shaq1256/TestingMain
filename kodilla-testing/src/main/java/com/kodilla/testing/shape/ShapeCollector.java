package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> figuresCollection = new ArrayList<>();

    public ArrayList<Shape> getFiguresCollection() {
        return figuresCollection;
    }

    public void addFigure(Shape shape) {
        figuresCollection.add(shape);
    }
    public void removeFigure(Shape shape){
        figuresCollection.remove(shape);
    }
    public Shape getFigure(int n){
        return figuresCollection.get(n);
    }
    public void showFigures() {

    }
}
