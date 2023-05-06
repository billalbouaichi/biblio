
package model;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Ouvrage {
    private final IntegerProperty id_ouvrage ;
    private final StringProperty isbn ;
    private final StringProperty titre ;
    private final StringProperty auteur ;
    private final StringProperty maisonEdition;
    private final IntegerProperty annéeEdition ;
    private final FloatProperty prix ;
    private final IntegerProperty nbExemplaires ;
    private final StringProperty discription; 

    
    public Ouvrage(int id,String isbn,String titre,String auteur,String maisonEdition,int annéeEdition,float prix, int nbExemplaires,String disc) {
    this.id_ouvrage= new SimpleIntegerProperty(id);
    this.isbn= new SimpleStringProperty(isbn);
    this.titre= new SimpleStringProperty(titre);
    this.auteur=new SimpleStringProperty(auteur);
    this.maisonEdition=new SimpleStringProperty(maisonEdition);
    this.annéeEdition=new SimpleIntegerProperty(annéeEdition);
    this.prix=new SimpleFloatProperty(prix);
    this.nbExemplaires=new SimpleIntegerProperty(nbExemplaires);
    this.discription= new SimpleStringProperty(disc);
    }
    

    public int getId_ouvrage() {
        return id_ouvrage.get();
    }

    public void setId_ouvrage(int value) {
        id_ouvrage.set(value);
    }

    public IntegerProperty id_ouvrageProperty() {
        return id_ouvrage;
    }
    

    public String getIsbn() {
        return isbn.get();
    }

    public void setIsbn(String value) {
        isbn.set(value);
    }

    public StringProperty isbnProperty() {
        return isbn;
    }
    

    public String getTitre() {
        return titre.get();
    }

    public void setTitre(String value) {
        titre.set(value);
    }

    public StringProperty titreProperty() {
        return titre;
    }
   

    public String getAuteur() {
        return auteur.get();
    }

    public void setAuteur(String value) {
        auteur.set(value);
    }

    public StringProperty auteurProperty() {
        return auteur;
    }
   

    public String getMaisonEdition() {
        return maisonEdition.get();
    }

    public void setMaisonEdition(String value) {
        maisonEdition.set(value);
    }

    public StringProperty maisonEditionProperty() {
        return maisonEdition;
    }

    public int getAnnéeEdition() {
        return annéeEdition.get();
    }

    public void setAnnéeEdition(int value) {
        annéeEdition.set(value);
    }

    public IntegerProperty annéeEditionProperty() {
        return annéeEdition;
    }
    
    public float getPrix() {
        return prix.get();
    }

    public void setPrix(float value) {
        prix.set(value);
    }

    public FloatProperty prixProperty() {
        return prix;
    }

    public int getNbExemplaires() {
        return nbExemplaires.get();
    }

    public void setNbExemplaires(int value) {
        nbExemplaires.set(value);
    }

    public IntegerProperty nbExemplairesProperty() {
        return nbExemplaires;
    }
    

    public String getDiscription() {
        return discription.get();
    }

    public void setDiscription(String value) {
        discription.set(value);
    }

    public StringProperty discriptionProperty() {
        return discription;
    }
    
    
}
