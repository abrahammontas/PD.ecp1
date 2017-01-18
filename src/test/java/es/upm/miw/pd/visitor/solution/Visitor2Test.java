package es.upm.miw.pd.visitor.solution;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.visitor.figure.Figure;
import es.upm.miw.pd.visitor.figure.Circle;
import es.upm.miw.pd.visitor.figure.Square;
import es.upm.miw.pd.visitor.figure.Triangle;
import es.upm.miw.pd.visitor.figure.Visitor2;

public class Visitor2Test {
    private Collection<Figure> coleccion = new ArrayList<Figure>();

    @Before
    public void ini() {
        coleccion.add(new Circle(null, 0));
        coleccion.add(new Circle(null, 0));
        coleccion.add(new Square(null, 0));
        coleccion.add(new Circle(null, 0));
        coleccion.add(new Square(null, 0));
    }

    @Test
    public void testVisitorAs() {
        Visitor2 v2 = new Visitor2();
        for (Figure elemento : coleccion) {
            elemento.accept(v2);
        }
        assertEquals(3, v2.getAs());
    }

    @Test
    public void testVisitorBs() {
        Visitor2 v2 = new Visitor2();
        for (Figure elemento : coleccion) {
            elemento.accept(v2);
        }
        assertEquals(2, v2.getBs());
    }

}
