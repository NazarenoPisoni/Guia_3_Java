package models;

public class Figura {
    private String color;

    public Figura() {
    }

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void calcularArea(){};
    public void calcularPerimetro(){};
}
