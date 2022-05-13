package refactoring.actividad1;

import java.util.Scanner;

public class DrinkMachine {
    
    public void start() {
        System.out.println("Bienvenido al dispensador de bebidas. Selecciona una opción: ");
        System.out.println("1. Cafe");
        System.out.println("2. Zumos");
        elegirOpcion();
    }


    /**
     * 
     */
    private void elegirOpcion() {
        try (Scanner sc = new Scanner(System.in)) {
            int option = sc.nextInt();
            if (option == 1) {
                prepararCafe(sc);
            } else if (option == 2) {
                prepararZumo(sc);
            }
        }
    }


    /**
     * @param sc
     */
    private void prepararZumo(Scanner sc) {
        System.out.println("Que tipo de zumo quieres?");
        System.out.println("1. Piña");
        System.out.println("2. Naranja");
        System.out.println("3. Melocoton");
        int zumo = sc.nextInt();

        int azucar = seleccionarAzucar(sc);

        prepararZumo(zumo, azucar);
    }


    /**
     * @param sc
     */
    private void prepararCafe(Scanner sc) {
        System.out.println("Que tipo de cafe quieres?");
        System.out.println("1. Café con leche");
        System.out.println("2. Solo");
        int leche = 0;
        int option2 = sc.nextInt();
        if (option2 == 1) {
            leche = seleccionarLeche(sc);
        }
        int azucar = seleccionarAzucar(sc);
        prepararCafe(leche, azucar);
    }


    /**
     * @param sc
     * @return
     */
    private int seleccionarAzucar(Scanner sc) {
        System.out.println("Desea azucar?");
        System.out.println("1. No");
        System.out.println("2. Poco");
        System.out.println("3. Medio");
        System.out.println("4. Mucha");
        return sc.nextInt();
    }


    /**
     * @param sc
     * @return
     */
    private int seleccionarLeche(Scanner sc) {
        System.out.println("Cuanta leche quiere en el cafe?");
        System.out.println("1. Poca");
        System.out.println("2. Media");
        System.out.println("3. Mucha");
        return sc.nextInt();
    }
    
    
    public void prepararZumo(int zumo, int azucar) {
        // NO IMPLEMENTAR

    }

    public void prepararCafe(int leche, int azucar) {
        // NO IMPLEMENTAR
    }

}