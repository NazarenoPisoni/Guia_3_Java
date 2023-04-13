package models;

public class Estudiante extends Persona{
    private Integer anioDeIngreso;
    private double cuota;
    private String carrera;

    public Estudiante() {
    }

    public Estudiante(String dni, String nombre, String apellido, String email,
                      String direccion, Integer anioDeIngreso, double cuota, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.anioDeIngreso = anioDeIngreso;
        this.cuota = cuota;
        this.carrera = carrera;
    }

    public Integer getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public void setAnioDeIngreso(Integer anioDeIngreso) {
        this.anioDeIngreso = anioDeIngreso;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "DNI = " + getDni() +
                "Nombre = " + getNombre() +
                "Apellido = " + getApellido() +
                "Email = " + getEmail() +
                "Direccion = " + getDireccion() +
                "Año de Ingreso = " + anioDeIngreso +
                ", cuota = " + cuota +
                ", carrera = " + carrera + '\'' +
                '}';
    }
}
