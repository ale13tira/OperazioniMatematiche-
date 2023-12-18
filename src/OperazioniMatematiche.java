import java.util.Scanner;

public class OperazioniMatematiche {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un numero N1: ");
        int numeroN = scanner.nextInt();

        System.out.println("inserisci un numero N: ");
        int numeroN2 = scanner.nextInt();

        System.out.println("la somma è uguale a: "+ somma(numeroN, numeroN2));

        scanner.close();
    }

    public static int somma(int parametro1, int parametro2) {
        return parametro1 + parametro2;
    }
}
