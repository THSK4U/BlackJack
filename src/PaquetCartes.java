import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PaquetCartes {
    private List<Carte> cartes;

    public PaquetCartes() {
        cartes = new ArrayList<>();
        for (String forme : new String[]{"carreau", "coure", "pique", "trefle"}) {
            for (String valeur : new String[]{"1", "2", "3", "4","5", "6", "7", "8","9", "10"}) {
                cartes.add(new Carte(forme, valeur));
            }
        }
    }

    public void shuffleCards() {
        Collections.shuffle(cartes, new Random());
    }

    public Carte getRandomCard() {
        int randomIndex = new Random().nextInt(cartes.size());
        return cartes.get(randomIndex);
    }
}

class Carte {
    private String forme;
    private String valeur;

    public Carte(String forme, String valeur) {
        this.forme = forme;
        this.valeur = valeur;
    }

    public String getForme() {
        return forme;
    }

    public String getValeur() {
        return valeur;
    }
}
