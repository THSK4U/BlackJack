import java.util.Scanner;

public class Croupier {
    public static void HitStand() {
        Hand.hand();
        while (Hand.getValeurMaintotal()<21) {
            Scanner scan = new Scanner(System.in);
            System.out.println("1.hit ou 2.stand");
            int s = scan.nextInt();
            switch (s) {
                case 1:
                    BlackJack.JoueurTour();
                    break;
                case 2:
                   BlackJack.CroupierTour();
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }

    }
}