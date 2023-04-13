package models;

public class Cilindro extends Circulo{
    private double altura = 1.0;

    public Cilindro() {
    }

    public Cilindro(double altura, double radio, String color) {
        super(radio, color);
        this.altura = altura;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVolumen(){
        return Math.PI * altura * Math.pow(getRadio(), 2);
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "Radio= " + getRadio() +
                ", Altura= " + altura +
                ", Area= " + getArea() +
                ", Volumen= " + getVolumen() +
                '}';
    }

    @Override
    public double getArea(){
        return Math.PI * getRadio() * altura + 2 * Math.PI * Math.pow(getRadio(), 2);
    }
}
