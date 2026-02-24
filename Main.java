public class Main {
   
    static class Estudiante {
        String nombre;
        int edad;
        int nota;

        public Estudiante(String nombre, int edad, int nota) {
            this.nombre = nombre;
            this.edad = edad;
            this.nota = nota;
        }
    }

    public static int contarPares(int[] arreglo, int indice) {

        if (indice == arreglo.length) {
            return 0;
        }

        int suma = (arreglo[indice] % 2 == 0) ? 1 : 0;

        return suma + contarPares(arreglo, indice + 1);
    }

    public static int contarNotasAltas(Estudiante[] estudiantes) {
        int contador = 0;

        for (Estudiante e : estudiantes) {
            if (e.nota >= 90) {
                contador++;
            }
        }
        return contador;
    }

    public static double promedioEdad(Estudiante[] estudiantes) {
        int suma = 0;

        for (Estudiante e : estudiantes) {
            suma += e.edad;
        }

        return (double) suma / estudiantes.length;
    }

    public static void main(String[] args) {

        Estudiante[] estudiantes = {
            new Estudiante("Ana", 23, 85),
            new Estudiante("Luis", 30, 90),
            new Estudiante("Marta", 22, 95),
            new Estudiante("Carlos", 25, 88)
        };

        int[] edades = new int[estudiantes.length];

        for (int i = 0; i < estudiantes.length; i++) {
            edades[i] = estudiantes[i].edad;
        }

        int pares = contarPares(edades, 0);
        System.out.println("Cantidad de edades pares: " + pares);

        int notasAltas = contarNotasAltas(estudiantes);
        System.out.println("Estudiantes con nota >= 90: " + notasAltas);

        double promedio = promedioEdad(estudiantes);
        System.out.println("Promedio de edad: " + promedio);
    }
}
