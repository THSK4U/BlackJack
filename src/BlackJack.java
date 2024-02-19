public class BlackJack {
    public static void CroupierTour() {
        int i = 0;
        while (Hand.getValeurmaintotalcro() < 17) {
            Hand.AjouterCartCroupir();
            i++;
        }
        DeterminerResultat();
    }
    public static void JoueurTour() {
        if (Hand.getValeurMaintotal() < 21) {
            Hand.AjouterCart();
        }else
        DeterminerResultat();
    }

    public static void DeterminerResultat() {
        System.out.println("votre main : "+Hand.getValeurMaintotal()+" || Croupier main : "+Hand.getValeurmaintotalcro());
        if (Hand.getValeurMaintotal() > Hand.getValeurmaintotalcro() && Hand.getValeurMaintotal()<21) {
            System.out.println("------- joueur a gagné -------");
        }
        else if (Hand.getValeurmaintotalcro() > Hand.getValeurMaintotal() && Hand.getValeurmaintotalcro()<21) {
            System.out.println("-------Croupier a gagné-------");
        }
       else if (Hand.getValeurmaintotalcro() == Hand.getValeurMaintotal()) {
            System.out.println("------ Match nul -----");
        }else if (Hand.getValeurmaintotalcro() > 21){
            System.out.println("********Croupier dépassé 21 XD *******");
            System.out.println("******** vous avez gagné *******");
        }else if (Hand.getValeurMaintotal() > 21){
            System.out.println("******** Vous avez dépassé 21 :( *******");
            System.out.println("******** Croupier gagné *******");
        }
    }
}

