package hockeyfeminin;

import java.time.LocalDate;
import java.util.ArrayList;

public class VictoireMontreal {

    private ArrayList<Joueur> alignement;


    public VictoireMontreal ( ) {
        alignement  = new ArrayList<Joueur>();
        alignement.add( new Joueur("Laura Stacey", 13, 15, 16, "Avant", LocalDate.of(1994, 5,5)));
        alignement.add( new Joueur("Marie Philip Poulin", 29, 15, 22, "Avant", LocalDate.of(1991, 2,28)));
        alignement.add( new Joueur("Claire Dalton", 16, 9, 6, "Avant", LocalDate.of(1997, 1,9)));
        alignement.add( new Joueur("Catherine Dubois", 10, 6, 6, "Avant", LocalDate.of(1994, 3,5)));
        alignement.add( new Joueur("Erin Ambrose", 5, 3, 4,"Défense", LocalDate.of(1990, 3,12)));
        alignement.add( new Joueur("Catherine Daoust", 21, 1, 4, "Défense", LocalDate.of(1982, 2,13)));
        alignement.add( new Joueur("Amanda Boulier",6, 0, 10, "Défense", LocalDate.of(1986, 2,6)));
        alignement.add( new Joueur("Ann-Renée Desbiens", 32, 0, 0, "Gardien", LocalDate.of(1985, 9,15)));
    }

    public ArrayList<Joueur> getAlignement() {
        return alignement;
    }
    
    // 1A avec une boucle normale
    public Joueur getJoueur(String nomJoueur) {
        return null;
    }

    //1B avec un iterateur
    public Joueur getJoueurAvecIterateur (String nomJoueur){
        return null;
    }

    //1C avec une boucle for améliorée
    public Joueur getJoueurAvecBoucleForAmelioree (String nomJoueur){
        return null;
    }

    //1D avec un stream
    public Joueur getJoueurAvecStream (String nomJoueur){
        return null;
    }

    //1E somme des buts de l'équipe
    public int sommeDesButsAvecStream (){
        return 0;
    }

    //1F somme des buts par les défenseurs
    public int sommeDesButsDefenseursAvecStream (){
        return 0;
    }
}
