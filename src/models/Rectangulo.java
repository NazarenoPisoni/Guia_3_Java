package models;

public class Rectangulo extends Figura{
    private double base;
    private double altura;


    public Rectangulo() {
    }

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo { " +
                "Color = " + getColor() +
                ", Base = " + base +
                ", Altura = " + altura +
                ", Area = " + calcularArea() +
                ", Perimetro = " + calcularPerimetro() +
                '}';
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }

    @Override
    public double calcularPerimetro(){
        return (base * 2) + (altura * 2);
    }
}
