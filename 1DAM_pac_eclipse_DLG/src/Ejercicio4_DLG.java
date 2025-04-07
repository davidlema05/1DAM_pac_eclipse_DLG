import java.util.*;
public class Ejercicio4_DLG {

	 public static void main(String[] args) {
	       
	        String[] ArrayNombres = new String[20];
	        int[] ArrayPuntuacion = new int[20];
	        
	        Scanner teclado = new Scanner(System.in);
	        Random random = new Random();
	        
	      
	        System.out.println("Introduce los nombres de los 20 equipos:");
	        for (int i = 0; i < 20; i++) {
	            System.out.print("Introduce el nombre del equipo " + (i + 1) + ": ");
	            ArrayNombres[i] = teclado.nextLine();
	        }
	        
	        // Rellenar el array ArrayPuntuacion con puntuaciones aleatorias entre 35 y 100
	        for (int i = 0; i < 20; i++) {
	            ArrayPuntuacion[i] = random.nextInt(66) + 35; // Genera números entre 35 y 100
	        }
	        
	        // Encontrar el equipo ganador (el de mayor puntuación)
	        int maxPuntos = ArrayPuntuacion[0];
	        String equipoGanador = ArrayNombres[0];
	        for (int i = 1; i < 20; i++) {
	            if (ArrayPuntuacion[i] > maxPuntos) {
	                maxPuntos = ArrayPuntuacion[i];
	                equipoGanador = ArrayNombres[i];
	            }
	        }
	        
	        // Encontrar el equipo último clasificado (el de menor puntuación)
	        int minPuntos = ArrayPuntuacion[0];
	        String equipoUltimo = ArrayNombres[0];
	        for (int i = 1; i < 20; i++) {
	            if (ArrayPuntuacion[i] < minPuntos) {
	                minPuntos = ArrayPuntuacion[i];
	                equipoUltimo = ArrayNombres[i];
	            }
	        }
	        
	        // Calcular la puntuación media
	        int sumaPuntos = 0;
	        for (int i = 0; i < 20; i++) {
	            sumaPuntos += ArrayPuntuacion[i];
	        }
	        double puntuacionMedia = sumaPuntos / 20.0;
	        
	        // Mostrar los resultados
	        System.out.println("\nRESULTADOS:");
	        System.out.println("Equipo ganador: " + equipoGanador + " con " + maxPuntos + " puntos.");
	        System.out.println("Equipo último clasificado: " + equipoUltimo + " con " + minPuntos + " puntos.");
	        System.out.println("Puntuación media de los equipos: " + String.format("%.2f", puntuacionMedia));
	    }
	}
	
