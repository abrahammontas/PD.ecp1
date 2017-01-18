package es.upm.miw.pd.visitor.figure;

import java.util.ArrayList;
import java.util.List;

import upm.jbb.IO;

public class Visitor {

    public static void main(String[] args) {
        VisitorArea visitorArea = new VisitorArea();
        VisitorNumberOfSides visitorNumberOfSides = new VisitorNumberOfSides();
        
        Circle circle = new Circle("Circle", 2);
        Square square = new Square("Square", 2);
        Triangle triangle = new Triangle("Triangle", 3, 4);
        
        List<Figure> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(square);
        figures.add(triangle);
        
        for(Figure figure : figures){
            figure.accept(visitorArea);
            figure.accept(visitorNumberOfSides);
        }
        
        FiguresManager figuresManager = new FiguresManager();
        figuresManager.add(circle);
        figuresManager.add(square);
        figuresManager.add(triangle);
        
        IO.getIO().println("Area from manager" + figuresManager.totalArea());
        IO.getIO().println("Area from visitor" + visitorArea.getArea());
        
        IO.getIO().println("Number from manager" + figuresManager.totalNumberOfSides());
        IO.getIO().println("Number from visitor" + visitorNumberOfSides.getNumberSides());
    }

}