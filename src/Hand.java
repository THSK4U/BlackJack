public class Hand extends Cartes {
    private static int i = 3;
    private static int ValeurMaintotal;
    private static int valeurmaintotal;

    public static int getValeurMaintotal() {
        return ValeurMaintotal;
    }

    public static void hand() {
        Cartes.cartes();

    }

    public static void AjouterCart() {
        PaquetCartes paquetCartes = new PaquetCartes();
        Carte randomCard = paquetCartes.getRandomCard();
        int randomcart = randomCard.getValeur();

        valeurmaintotal += randomcart;
        ValeurMaintotal = getValeurmain()+ valeurmaintotal;

        System.out.println("La valeur totale de la main est : " + ValeurMaintotal);
        System.out.println(" carte " + i++ + " : " + randomCard.getForme() + " number " + randomcart);

        if (getValeurMaintotal() > 21){
            System.out.println("********Vous avez dépassé 21 :( *******");
        }else if (getValeurMaintotal() == 21){
            System.out.println("-------Mabrok-------");
        }
    }
}