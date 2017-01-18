package es.upm.miw.pd.visitor.figure;

public class Square extends Figure {

    private double side;

    public Square(String description, double side) {
        super(description);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double numberOfSides() {
        return 4;
    }
    
    public void accept(Visitor2 visitor) {
        visitor.visitFigureB(this);
    }

}
