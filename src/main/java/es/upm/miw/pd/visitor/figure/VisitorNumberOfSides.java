package es.upm.miw.pd.visitor.figure;

public class VisitorNumberOfSides extends Visitor2{
private double numberSides;
    
    public VisitorNumberOfSides(){
        numberSides = 0;
    }

    @Override
    public void visitFigureA(Circle circle) {
        numberSides += circle.numberOfSides();
    }

    @Override
    public void visitFigureB(Square square) {
        numberSides += square.numberOfSides();
    }

    @Override
    public void visitFigureC(Triangle triangle) {
        numberSides += triangle.numberOfSides();
    }
    
    public double getNumberSides(){
        return numberSides;
    }

    }