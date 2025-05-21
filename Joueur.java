package hockeyfeminin;

import java.time.LocalDate;

public class Joueur {
    private String nom;
    private int numero;
    private int nbButs;
    private int nbPasses;
    private String position;
    private LocalDate dateNaissance;

    public Joueur ( String nom, int numero, int nbButs, int nbPasses, String position, LocalDate dateNaissance) {
        this.nom = nom;
        this.numero = numero;
        this.nbButs = nbButs;
        this.nbPasses = nbPasses;
        this.position = position;
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNbButs() {
        return nbButs;
    }

    public void setNbButs(int nbButs) {
        this.nbButs = nbButs;
    }

    public int getNbPasses() {
        return nbPasses;
    }

    public void setNbPasses(int nbPasses) {
        this.nbPasses = nbPasses;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
