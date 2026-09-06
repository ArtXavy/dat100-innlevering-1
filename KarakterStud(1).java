import java.util.Scanner;

public class KarakterStud {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.print("Skriv inn poengsummen: ");
            int poengsum = sc.nextInt();
            
            while (poengsum < 0 || poengsum > 100) {
                System.out.println("Ugyldig poengsum, prøv igjen.");
                 poengsum = sc.nextInt();
            }
            if (poengsum >= 90 && poengsum <= 100) {
                System.out.println("Karakter: A");
            }
            else if (poengsum >= 80 && poengsum <= 89) {
                System.out.println("Karakter: B");
            }
            else if (poengsum >= 60 && poengsum <= 79) {
                System.out.println("Karakter: C");
            }
            else if (poengsum >= 50 && poengsum <= 59) {
                System.out.println("Karakter: D");
            }
            else if (poengsum >= 40 && poengsum <= 49) {
                System.out.println("Karakter: E");
            }
            else if (poengsum >= 0 && poengsum <= 39) {
                System.out.println("Karakter: F");
            }
        }

        sc.close();
    }
}