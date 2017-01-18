package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEjecutable {
    public static void main(String[] args) {
        NaturalNumberManager naturalNumberFactory= new NaturalNumberManager();
        naturalNumberFactory.setNaturalNumberCreator(new NaturalNumberCreatorEs());
        System.out.println(naturalNumberFactory.getNaturalNumber().getTextValue());;
    }
}
