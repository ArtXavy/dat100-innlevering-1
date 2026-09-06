import java.util.Scanner;

public class TrinnSkatt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Skriv inn bruttoinntekt: ");
        int bruttoinntekt = sc.nextInt();
        
        int grense =  226100;
        
        int over = bruttoinntekt - grense;
        
        if ( over <=0) {
            System.out.println("Trinnskatt: 0kr");
        } else{
            double trinnskatt = 0.017 * over;
            System.out.println("Trinnskatt: " + trinnskatt + " kr");
        }
        
        sc.close();
    }
}