package models;

public class Circulo2 extends Figura{
    private double radio;

    public Circulo2() {
    }

    public Circulo2(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }


    @Override
    public String toString() {
        return "Circulo { " +
                "Color = " + getColor() +
                ", Radio = " + radio +
                ", Area = " + calcularArea() +
                ", Perímetro = " + calcularPerimetro() +
                '}';
    }
}
