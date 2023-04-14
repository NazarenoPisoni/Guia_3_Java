package models;

public class Cuadrado extends Rectangulo{

    public Cuadrado() {
    }

    public Cuadrado(String color, double base, double altura) {
        super(color, base, altura);
    }

    @Override
    public String toString() {
        return "Cuadrado { " +
                "Color = " + getColor() +
                ", Lado = " + getBase() +
                ", Area = " + calcularArea() +
                ", Perimetro = " + calcularPerimetro() +
                '}';
    }
}
