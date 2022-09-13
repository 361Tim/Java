import java.util.Scanner;

public class quersumme4 {
    public static void main(String[] args) {
        int ziffernsumme = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl eingeben");
        int selecion = scanner.nextInt();
        while (ziffernsumme>9){
    ziffernsumme =+ selecion%10;
    selecion /= 10;
        }
        System.out.println(ziffernsumme);
    }
}
