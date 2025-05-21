package hockeyfeminin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Collectors;

public class VictoireMontreal {

    private ArrayList<Joueur> alignement;

    public VictoireMontreal() {
        alignement = new ArrayList<Joueur>();
        alignement.add(new Joueur("Laura Stacey", 13, 15, 16, "Avant", java.time.LocalDate.of(1994, 5, 5)));
        alignement.add(new Joueur("Marie Philip Poulin", 29, 15, 22, "Avant", java.time.LocalDate.of(1991, 2, 28)));
        alignement.add(new Joueur("Claire Dalton", 16, 9, 6, "Avant", java.time.LocalDate.of(1997, 1, 9)));
        alignement.add(new Joueur("Catherine Dubois", 10, 6, 6, "Avant", java.time.LocalDate.of(1994, 3, 5)));
        alignement.add(new Joueur("Erin Ambrose", 5, 3, 4, "Défense", java.time.LocalDate.of(1990, 3, 12)));
        alignement.add(new Joueur("Catherine Daoust", 21, 1, 4, "Défense", java.time.LocalDate.of(1982, 2, 13)));
        alignement.add(new Joueur("Amanda Boulier", 6, 0, 10, "Défense", java.time.LocalDate.of(1986, 2, 6)));
        alignement.add(new Joueur("Ann-Renée Desbiens", 32, 0, 0, "Gardien", java.time.LocalDate.of(1985, 9, 15)));
    }

    public ArrayList<Joueur> getAlignement() {
        return alignement;
    }

    // 1A - Avec une boucle normale
    public Joueur getJoueur(String nomJoueur) {
        for (int i = 0; i < alignement.size(); i++) {
            if (alignement.get(i).getNom().equalsIgnoreCase(nomJoueur)) {
                return alignement.get(i);
            }
        }
        return null;
    }

    // 1B - Avec un iterateur
    public Joueur getJoueurAvecIterateur(String nomJoueur) {
        Iterator<Joueur> it = alignement.iterator();
        while (it.hasNext()) {
            Joueur joueur = it.next();
            if (joueur.getNom().equalsIgnoreCase(nomJoueur)) {
                return joueur;
            }
        }
        return null;
    }

    // 1C - Avec une boucle for améliorée
    public Joueur getJoueurAvecBoucleForAmelioree(String nomJoueur) {
        for (Joueur joueur : alignement) {
            if (joueur.getNom().equalsIgnoreCase(nomJoueur)) {
                return joueur;
            }
        }
        return null;
    }

    // 1D - Avec un stream
    public Joueur getJoueurAvecStream(String nomJoueur) {
        return alignement.stream()
                .filter(j -> j.getNom().equalsIgnoreCase(nomJoueur))
                .findFirst()
                .orElse(null);
    }

    // 1E - Somme des buts de l'équipe
    public int sommeDesButsAvecStream() {
        return alignement.stream()
                .mapToInt(Joueur::getNbButs)
                .sum();
    }

    // 1F - Somme des buts par les défenseurs
    public int sommeDesButsDefenseursAvecStream() {
        return alignement.stream()
                .filter(j -> j.getPosition().equalsIgnoreCase("Défense"))
                .mapToInt(Joueur::getNbButs)
                .sum();
    }
}
