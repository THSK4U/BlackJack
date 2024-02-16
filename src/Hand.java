public class Hand extends Cartes{
    public static void hand() {
        Cartes.cartes();
        PaquetCartes paquetCartes = new PaquetCartes();
    }

        public static void AjouterCart(){
            PaquetCartes paquetCartes = new PaquetCartes();
            Carte randomCard4 = paquetCartes.getRandomCard();
            Carte randomCard5 = paquetCartes.getRandomCard();
            int i=2;
            ++i;
            System.out.println(" carte "+i+" : " + randomCard4.getForme() + " number " + randomCard5.getValeur());
    }
    public static void CalculerValeurTotale(){
        Cartes cartes = new Cartes();
        int Valeurmaintotal = Valeurmain + randomCard4.getValeur();
    }
}

