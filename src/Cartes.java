public class Cartes {

    public static void cartes() {
        PaquetCartes paquetCartes = new PaquetCartes();
        paquetCartes.shuffleCards();
        Carte randomCard1 = paquetCartes.getRandomCard();
        Carte randomCard2 = paquetCartes.getRandomCard();
        System.out.println(" carte 1 : " + randomCard1.getForme() + " number " + randomCard1.getValeur());
        System.out.println(" carte 2 : " + randomCard2.getForme() + " number " + randomCard2.getValeur());

    }
    }