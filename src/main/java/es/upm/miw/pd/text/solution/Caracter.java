package es.upm.miw.pd.text.solution;

public class Caracter extends Componente {
    private char c;

    public Caracter(char c) {
        this.c = c;
    }

    @Override
    public String dibujar(boolean toUppercase) {
        if (toUppercase) {
            return "" + Character.toUpperCase(c);
        }
        return "" + c;
    }

    @Override
    public boolean isComposite() {
        return false;
    }

}