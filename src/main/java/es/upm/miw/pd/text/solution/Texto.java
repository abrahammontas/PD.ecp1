package es.upm.miw.pd.text.solution;

public class Texto extends Componente {

    @Override
    public void add(Componente component) {
        if (component.isComposite()) {
            this.getList().add(component);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public String dibujar(boolean toUppercase) {
        String result = "";
        for (Vector component : this.getList()) {
            result = result + component.dibujar(toUppercase);
        }
        result = result + "---o---\n";
        return result;
    }

}