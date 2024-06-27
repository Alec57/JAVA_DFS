package models;

import application.Fenetre;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Balle extends Sprite {

    protected int vitesseX = 10;
    protected int vitesseY = 10;
    protected int diametre = 50;
    private Barre barre;
    private ArrayList<Brique> listeBriques;
    private ArrayList<Sprite> listeSprites;

    public Balle(int x, int y, Color couleur, int diametre, Barre barre) {
        super(x, y, couleur);
        this.diametre = diametre;
        this.barre = barre;
    }

    public Balle(int x, int y, int vitesseX, int vitesseY, Barre barre) {
        super(x, y, Color.RED);
        this.vitesseX = vitesseX;
        this.vitesseY = vitesseY;
        this.barre = barre;
    }

    public Balle(int x, int y, Barre barre) {
        super(x, y, Color.RED);
        this.vitesseX = 5;
        this.vitesseY = 5;
        this.barre = barre;
    }

    public void setListeBriques(ArrayList<Brique> listeBriques) {
        this.listeBriques = listeBriques;
    }

    public void setListeSprites(ArrayList<Sprite> listeSprites) {
        this.listeSprites = listeSprites;
    }

    public void deplacement() {
        if (x > Fenetre.LARGEUR - diametre || x < 0) {
            vitesseX = -vitesseX;
        }

        if (y < 0) {
            vitesseY = -vitesseY;
        }

        java.awt.Rectangle rectBalle = new java.awt.Rectangle(x, y, diametre, diametre);
        java.awt.Rectangle rectBarre = barre.getBounds();

        if (rectBalle.intersects(rectBarre)) {
            vitesseY = -vitesseY;
            y = barre.getY() - diametre;
        }

        Iterator<Brique> it = listeBriques.iterator();
        while (it.hasNext()) {
            Brique brique = it.next();
            java.awt.Rectangle rectBrique = brique.getBounds();

            if (rectBalle.intersects(rectBrique)) {
                vitesseY = -vitesseY;
                it.remove();
                listeSprites.remove(brique);
                break;
            }
        }

        // Déplacement de la balle
        x += vitesseX;
        y += vitesseY;

        if (y > Fenetre.HAUTEUR - diametre) {
            // Par exemple, réinitialiser la position de la balle au centre
            x = Fenetre.LARGEUR / 2;
            y = Fenetre.HAUTEUR / 2;
        }
    }

    @Override
    public void dessiner(Graphics2D dessin) {
        dessin.setColor(couleur);
        dessin.fillOval(x, y, diametre, diametre);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getVitesseX() {
        return vitesseX;
    }

    public void setVitesseX(int vitesseX) {
        this.vitesseX = vitesseX;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVitesseY() {
        return vitesseY;
    }

    public void setVitesseY(int vitesseY) {
        this.vitesseY = vitesseY;
    }
}
