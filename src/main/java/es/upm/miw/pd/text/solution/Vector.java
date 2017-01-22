package es.upm.miw.pd.text.solution;

public abstract class Vector {
    public abstract void add(Componente component);

    public abstract String dibujar(boolean toUpperCase);

    public abstract boolean isComposite();
}