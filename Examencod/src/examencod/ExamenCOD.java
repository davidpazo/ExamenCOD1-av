package ExamenCOD;

import java.util.Scanner;

public class ExamenCOD {

 
    public static void main(String[] args) {
                int numP = 11;
        if (metodoNuevo(numP)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }
        for (int x = 2; x < 1000; x++) {
            if (metodoNuevo(x)) {
                System.out.print(x + " ");
            }
        }
    }
    //Cambio de nombres de variables
    
    public static boolean metodoNuevo(int peritas) {
        int y = 2;
        boolean aux = true;
        while ((aux) && (y != peritas)) {
            if (peritas % y == 0) {
                aux = false;
            }
            y++;
        }
        return aux;
    }
}
