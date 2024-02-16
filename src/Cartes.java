public class Cartes {
private static int Valeurmain;

    public static void cartes() {
        PaquetCartes paquetCartes = new PaquetCartes();
        paquetCartes.shuffleCards();
        Carte randomCard1 = paquetCartes.getRandomCard();
        Carte randomCard2 = paquetCartes.getRandomCard();
        Valeurmain = randomCard1.getValeur() + randomCard2.getValeur();
        System.out.println("votre main =  " + Valeurmain);
        System.out.println(" carte 1 : " + randomCard1.getForme() + " number " + randomCard1.getValeur());
        System.out.println(" carte 2 : " + randomCard2.getForme() + " number " + randomCard2.getValeur());

    }
}