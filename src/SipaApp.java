import java.util.Scanner;

public class SipaApp {

    // Variables globales de configuración (Persisten durante la ejecución)
    private String nombreAgricultor = "No registrado";
    private String nombreFinca = "No registrada";

    // Variables globales para almacenar el último cálculo realizado
    private String ultimoProducto = "Ninguno";
    private double ultimoSubtotal = 0.0;
    private double ultimosImpuestos = 0.0;
    private double ultimoFlete = 0.0;
    private double ultimaUtilidadNeta = 0.0;
    private boolean seCalculoProyeccion = false;

    void main() {

        var scanner = new Scanner(System.in);
        var opcion = 0;

        System.out.println("=== Bienvenido al sistema Sipa ===");

        while (opcion != 5) {
            mostrarMenuPrincipal();
            opcion = leerEnteroValidado(scanner, "Seleccione una opción (1-5): ", 1, 5);

            switch (opcion) {
                case 1 -> registrarCosecha(scanner);
                case 2 -> mostrarGlosario(scanner);
                case 3 -> simularPuntoEquilibrio(scanner);
                case 4 -> configurarPerfil(scanner);
                case 5 -> generarReporteYSalir();
            }
        }

        scanner.close();
    }
     // --- Menu Principal ---
    private void mostrarMenuPrincipal() {
        System.out.println("""
            
            --- MENÚ PRINCIPAL ---
            1. Registrar Cosecha (Cálculo de Proyección)
            2. Glosario de Términos (Análisis de Viabilidad)
            3. Simulador de Punto de Equilibrio
            4. Configuración (Datos del Agricultor)
            5. Generar Reporte y Salir
            """);
    }

    // Regitrar Cosecha
    private void registrarCosecha(Scanner scanner) {
    
    }

    // Glosario de Terminos
    private void mostrarGlosario(Scanner scanner) {
       
    }

    // Simular Punto de equilibrio
    private void simularPuntoEquilibrio(Scanner scanner) {
      
    }

    // Configurar Perfil
    private void configurarPerfil(Scanner scanner) {
        System.out.println("\n--- CONFIGURACIÓN DE PERFIL ---");
        System.out.print("Ingrese el nombre del agricultor: ");
        nombreAgricultor = scanner.nextLine().trim();

        System.out.print("Ingrese el nombre de la finca: ");
        nombreFinca = scanner.nextLine().trim();

        System.out.println("¡Datos guardados con éxito!");
    }

    // Generar reporte y salir
    private void generarReporteYSalir() {
    
        
    }

   

    
    // Validar los valores enteros dentro de un rango [min, max]
    private int leerEnteroValidado(Scanner scanner, String mensaje, int min, int max) {
        int valor = -1;
        do {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                valor = scanner.nextInt();
                if (valor < min || valor > max) {
                    System.out.printf("[ERROR] Ingrese una opción entre %d y %d.%n", min, max);
                }
            } else {
                System.out.println("[ERROR] Valor inválida. Ingrese un número entero.");
                scanner.next(); // Limpia valor incorrecto
            }
            scanner.nextLine(); // Limpieza de buffer
        } while (valor < min || valor > max);
        return valor;
    }
}