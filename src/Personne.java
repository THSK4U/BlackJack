import java.util.Scanner;

public class Personne {
    public static void HitStand() {
        Hand.hand();
        int n = 0;
        while (n<2) {
            Scanner scan = new Scanner(System.in);
            System.out.println("1.hit or 2.stand");
            int s = scan.nextInt();
            switch (s) {
                case 1:
                    Hand.AjouterCart();
                    n++;
                    break;
                case 2:
                    System.out.println("dsf");
                    break;
            }
        }
    }
}
