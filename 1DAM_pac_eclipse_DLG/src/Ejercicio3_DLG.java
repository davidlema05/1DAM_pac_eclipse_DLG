import java.util.*;

public class Ejercicio3_DLG{

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos iniciales del usuario
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Introduce tu peso (kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Introduce tu altura (cm): ");
        double altura = scanner.nextDouble();
        
        System.out.print("Introduce tu sexo (M/F): ");
        char sexo = scanner.next().charAt(0);
        
        System.out.print("Introduce tu velocidad inicial (km/h): ");
        double velocidadInicial = scanner.nextDouble();
        
        System.out.print("Introduce tu distancia inicial (km): ");
        double distanciaInicial = scanner.nextDouble();
        
        System.out.print("Introduce tus calorías quemadas iniciales: ");
        double caloriasQuemadasIniciales = scanner.nextDouble();
        
        // Calcular el índice de masa corporal (IMC)
        double alturaEnMetros = altura / 100;
        double imc = peso / (alturaEnMetros * alturaEnMetros);
        
        // Inicializar variables para las estadísticas del entrenamiento
        double totalVelocidad = 0;
        double totalDistancia = 0;
        double totalCalorias = 0;
        double maxDistancia = 0;
        double maxCalorias = 0;
        
        // Bucle para registrar las 10 sesiones de entrenamiento
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nSesion " + i + ":");
            System.out.print("Introduce la velocidad en esta sesión (km/h): ");
            double velocidad = scanner.nextDouble();
            
            System.out.print("Introduce la distancia recorrida en esta sesión (km): ");
            double distancia = scanner.nextDouble();
            
            System.out.print("Introduce las calorías quemadas en esta sesión: ");
            double calorias = scanner.nextDouble();
            
            // Acumulamos las estadísticas
            totalVelocidad += velocidad;
            totalDistancia += distancia;
            totalCalorias += calorias;
            
            // Calculamos la máxima distancia y calorías quemadas
            if (distancia > maxDistancia) {
                maxDistancia = distancia;
            }
            if (calorias > maxCalorias) {
                maxCalorias = calorias;
            }
        }
        
        // Calculamos las medias
        double mediaVelocidad = totalVelocidad / 10;
        double mediaDistancia = totalDistancia / 10;
        double mediaCalorias = totalCalorias / 10;

        // Imprimir la ficha de seguimiento
        System.out.println("\nHola " + nombre + ", te presentamos la ficha de seguimiento de entrenamiento:");
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Sexo: " + sexo);
        System.out.println("Índice de masa corporal: " + imc);
        System.out.println("La media del entrenamiento en 10 sesiones es:");
        System.out.println("Velocidad: " + mediaVelocidad + " km/h");
        System.out.println("Distancia recorrida: " + mediaDistancia + " km");
        System.out.println("Calorías quemadas: " + mediaCalorias + " kcal");
        System.out.println("Máxima distancia recorrida: " + maxDistancia + " km");
        System.out.println("Máximo número de calorías quemadas en una sesión: " + maxCalorias + " kcal");

        // Verificar si el usuario ha superado las medias iniciales
        if (mediaVelocidad > velocidadInicial) {
            System.out.println("\n¡Enhorabuena! Has superado tu velocidad media inicial.");
        }
        if (mediaDistancia > distanciaInicial) {
            System.out.println("¡Enhorabuena! Has superado tu distancia media inicial.");
        }
        if (mediaCalorias > caloriasQuemadasIniciales) {
            System.out.println("¡Enhorabuena! Has superado tus calorías quemadas medias iniciales.");
        }
     
    }
}
