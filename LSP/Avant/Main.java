package LSP.Avant;

public class Main {
    public static void main(String[] args) {

        Rectangle rect = new Square();

        System.out.println("--- Test de substitution LSP ---");


        rect.setWidth(10);
        rect.setHeight(5);

        int aireCalculee = rect.getArea();

        System.out.println("Largeur finale (w) : " + rect.w);
        System.out.println("Hauteur finale (h) : " + rect.h);
        System.out.println("Aire calculee : " + aireCalculee);


    }
}