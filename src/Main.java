import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Jouer 2.Sold");
        int s = scan.nextInt();
        switch (s) {
            case 1:
                Croupier.HitStand();
                break;
            case 2:
                System.out.println("soon...");
                break;
            default:
                System.out.println("Choix invalide.");
                break;
        }
    }
}