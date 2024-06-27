package models;

import application.Fenetre;

import java.awt.*;

public class Barre extends Rectangle {
    private static final int VITESSE = 10; // Vitesse de déplacement de la barre

    public Barre(int x, int y, int largeur, int hauteur, Color couleur) {
        super(x, y, largeur, hauteur, couleur);
    }

    public Barre() {
        super(250 - 75, 600, 150, 20, Color.BLUE);
    }

    public void deplacerGauche() {
        if (x > 0) {
            x -= VITESSE;
        }
    }

    public void deplacerDroite() {
        if (x < Fenetre.LARGEUR - largeur) {
            x += VITESSE;
        }
    }
}
