
public class Ejercicio2_DLG {
	public static boolean procesoSeleccion() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        if (edad > 40) {
            System.out.println("No apto: edad mayor a 40.");
            return false;
        }

        System.out.print("Nombre: ");
        sc.nextLine(); // Limpiar buffer
        String nombre = sc.nextLine();

        System.out.print("Años trabajados: ");
        int anios = sc.nextInt();

        System.out.print("Sueldo bruto anual anterior: ");
        double sueldoAnterior = sc.nextDouble();

        if (sueldoAnterior > 30000) {
            System.out.println("No apto: sueldo anterior mayor a 30.000€.");
            return false;
        }

        double suma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Nómina " + i + ": ");
            suma += sc.nextDouble();
        }

        double media = suma / 5;
        System.out.println("Media de nóminas: " + media);

        if (media > 2500) {
            System.out.println("Sueldo sube 5% " + (media * 1.05));
        } else {
            System.out.println("Sueldo sube 10% " + (media * 1.10));
        }

        return true;
    }

    public static void main(String[] args) {
        procesoSeleccion(); 
    }
}

