import java.util.Scanner;

public class OperazioniMatematiche {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un numero N1: ");
        int numeroN = scanner.nextInt();

        System.out.println("inserisci un numero N: ");
        int numeroN2 = scanner.nextInt();

        System.out.println("la somma è uguale a: "+ somma(numeroN, numeroN2));
        System.out.println("la sottrazione è uguale a: "+ sottrazioni(numeroN, numeroN2));
        System.out.println("la moltiplicazione è uguale a: "+ moltiplicazione(numeroN, numeroN2));

        scanner.close();
    }

    public static int somma(int parametro1, int parametro2) {
        return parametro1 + parametro2;
    }

    public static int sottrazioni(int parametro1, int parametro2) {
        return parametro1 - parametro2;
    }

    public static int moltiplicazione(int parametro1, int parametro2) {
        return parametro1 * parametro2;
    }

}
