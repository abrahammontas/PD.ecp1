package es.upm.miw.pd.visitor.figure;

public class VisitorArea extends Visitor2{
    
    private double area;
    
    public VisitorArea(){
        this.area = 0;
    }

    @Override
    public void visitFigureA(Circle circle) {
        area += circle.area();
    }

    @Override
    public void visitFigureB(Square square) {
        area += square.area();
    }

    @Override
    public void visitFigureC(Triangle triangle) {
        area += triangle.area();
    }
    
    public double getArea(){
        return this.area;
    }

}