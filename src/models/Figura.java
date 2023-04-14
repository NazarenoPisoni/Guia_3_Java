package models;

public class Figura {
    private String color = "Negro";

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

    public double calcularArea(){
        return 0;
    };
    public double calcularPerimetro(){
        return 0;
    };
}
