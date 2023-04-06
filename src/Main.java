import models.Cilindro;

public class Main {
    public static void main(String[] args) {

        Cilindro c1 = new Cilindro();
        System.out.println(c1.toString());

        Cilindro c2 = new Cilindro(6.5, 3.2, "Negro");
        System.out.println(c2.toString());
        System.out.println("Area del cilindro: " + c1.getArea());
        System.out.println("Volumen del cilindro: " + c1.getVolumen());
    }
}