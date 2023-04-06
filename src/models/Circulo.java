package models;

public class Circulo {
    private double radio;
    private String color;

    public Circulo() {
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }


    public double getArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "Radio=" + radio +
                ", Color='" + color + '\'' +
                ", Area='" + getArea() + '\'' +
                '}';
    }
}
