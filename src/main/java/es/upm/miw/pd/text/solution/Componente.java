package es.upm.miw.pd.text.solution;

import java.util.ArrayList;
import java.util.List;

public abstract class Componente extends Vector {
    private List<Vector> list;

    public Componente() {
        list = new ArrayList<Vector>();
    }

    @Override
    public void add(Componente component) {
    }
    public List<Vector> getList() {
        return list;
    }

    public void setList(List<Vector> list) {
        this.list = list;
    }

    public boolean isComposite() {
        return true;
    }
}