
public class Ejercicio1_DLG {
    public static boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado, double salarioOficinistas,
                                           int numeroOficinistas, boolean proyectosTerminados, double presupuestoEmpresa) {

        // 1. Verificar si los proyectos han terminado
        if (!proyectosTerminados) {
            System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados.");
            return false;
        }

        // 2. Calcular el gasto total en personal
        double gastoTotal = salarioJefe + salarioEncargado + (salarioOficinistas * numeroOficinistas);

        if (gastoTotal > 20000) {
            System.out.println("No ha pasado la auditoría ya que el gasto en personal es de " + gastoTotal +
                    " euros y excede el límite mensual de 20.000 euros.");
            return false;
        }

        // 3. Verificar si el presupuesto es adecuado
        if (presupuestoEmpresa > 100000) {
            System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de " +
                    presupuestoEmpresa + " euros excede el límite establecido en 100.000 euros.");
            return false;
        }

        // 4. Todo ha salido bien
        System.out.println("¡Enhorabuena! Ha pasado la auditoría, nos vemos el año que viene.");
        return true;
    }

    // Método main para probarlo
    public static void main(String[] args) {
        // Ejemplo de prueba
        boolean resultado = auditoriaEmpresa(
                5000,       // salario jefe
                3000,       // salario encargado
                1500,       // salario oficinista
                6,          // número de oficinistas
                true,       // proyectos terminados
                90000       // presupuesto empresa
        );

        System.out.println("¿Resultado de la auditoría?: " + (resultado ? "Apto" : "No Apto"));
    }
}
