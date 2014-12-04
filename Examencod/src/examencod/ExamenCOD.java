package ExamenCOD;

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
    public static boolean metodoNuevo(int variable) {
        int j = 2;
        boolean aux = true;
        while ((aux) && (j != variable)) {
            if (variable % j == 0) {
                aux = false;
            }
            j++;
        }
        return aux;
    }
}
