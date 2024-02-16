import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Jouer");
        int s = scan.nextInt();
        switch (s) {
            case 1:
                Personne.HitStand();
                break;
            case 2:
                System.out.println("dsf");
                break;
            default:
                break;
        }
    }
}