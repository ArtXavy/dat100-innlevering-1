import java.util.Scanner;

public class Fakultet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Skriv inn n: ");
        int n = sc.nextInt();
        int fakultet = 1;
        
    for (int i = 1; i <= n; i++) {
    fakultet = fakultet * i; 
        } 
        System.out.println("n! = " + fakultet);
        
        sc.close();
    }
}