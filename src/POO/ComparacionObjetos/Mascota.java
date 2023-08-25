public class Mascota implements Comparable<Mascota> {
    private String nombre;
    private int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Mascota otraMascota) {
        return Integer.compare(this.edad, otraMascota.edad);
    }

    @Override
    public String toString() {
        return nombre + " - " + edad + " años";
    }

    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Max", 3);
        Mascota mascota2 = new Mascota("Bella", 5);

        // Comparación utilizando el método compareTo
        if (mascota1.compareTo(mascota2) < 0) {
            System.out.println(mascota1 + " es más joven que " + mascota2);
        } else {
            System.out.println(mascota1 + " no es más joven que " + mascota2);
        }

        // Comparación utilizando el método equals
        if (mascota1.equals(mascota2)) {
            System.out.println(mascota1 + " tiene la misma edad que " + mascota2);
        } else {
            System.out.println(mascota1 + " no tiene la misma edad que " + mascota2);
        }
    }
}