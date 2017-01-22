package es.upm.miw.pd.text.solution;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

    private static FactoriaCaracter factoria = null;

    private Map<Character, Componente> charMap;

    private FactoriaCaracter() {
        charMap = new HashMap<Character, Componente>();
    }

    public Componente get(char key) {
        if (charMap.containsKey(key)) {
            return charMap.get(key);
        } else {
            Componente c = new Caracter(key);
            charMap.put(key, c);
            return c;
        }
    }

    public static FactoriaCaracter getFactoria() {
        if (FactoriaCaracter.factoria == null) {
            FactoriaCaracter.factoria = new FactoriaCaracter();
        }
        return FactoriaCaracter.factoria;
    }
}