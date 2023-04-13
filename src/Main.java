import models.*;

public class Main {
    public static void main(String[] args) {

        Cilindro c1 = new Cilindro(14.5, 4.5, "Verde");
        System.out.println(c1.toString());

        Circulo cir1 = new Circulo(5.5, "Azul");
        System.out.println(cir1.toString());

        Persona est1 = new Estudiante("35658391", "José", "Rosales", "jose@gmail.com",
                "Luro 4393", 2021, 8000, "Tecnicatura en Programación");
        Persona est2 = new Estudiante("33758272", "Eduardo", "Gonzalez", "eduardo@gmail.com",
                "Buenos Aires 2948", 2022, 8000, "Tecnicatura en Programación");

        Persona est3 = new Estudiante("32748237", "Florencia", "Rodriguez", "florencia@gmail.com",
                "Rivadavia 3943", 2023, 8000, "Tecnicatura en Programación");

        Persona est4 = new Estudiante("28456784", "Roberto", "López", "roberto@gmail.com",
                "Cordoba 2849", 2020, 8000, "Tecnicatura en Programación");

        Persona personal1 = new Staff("31758393", "Oscar", "Gonzalez", "oscar@gmail.com", "Saavedra 3764"
            , 135000, "Noche");
        Persona personal2 = new Staff("27494722", "Estela", "Morales", "estela@gmail.com", "Saavedra 3764"
                , 155000, "Mañana");
        Persona personal3 = new Staff("10575923", "Ricardo", "Caruso", "ricardo@gmail.com", "Saavedra 3764"
                , 220000, "Tarde");
        Persona personal4 = new Staff("29403839", "Nicolás", "Gómez", "nico@gmail.com", "Rivadavia 2224"
                , 180000, "Mañana");

        Persona [] personas = new Persona[8];
        personas[0] = est1;
        personas[1] = est2;
        personas[2] = est3;
        personas[3] = est4;
        personas[4] = personal1;
        personas[5] = personal2;
        personas[6] = personal3;
        personas[7] = personal4;

        Integer cantEstudiantes = 0;
        Integer cantStaff = 0;

        for(int i=0; i<personas.length; i++){
            if(personas[i] instanceof Estudiante){
                cantEstudiantes++;
            }
            else{
                cantStaff++;
            }
        }

        System.out.println("La cantidad de Estudiantes es: " + cantEstudiantes);
        System.out.println("La cantidad de Miembros del Staff es: " + cantStaff);

        double totalCuotas = 0;

        for(int i=0; i<personas.length; i++){
            if(personas[i] instanceof Estudiante){
                totalCuotas += ((Estudiante) personas[i]).getCuota();
            }
        }

        System.out.println("El total de Cuotas abonadas por los estudiantes es de $" + totalCuotas);
    }
}