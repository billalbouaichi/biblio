/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;


public class Emprunt {
    private final IntegerProperty id_emprunt ;
    private final ObjectProperty<LocalDate> date_emprunt ;
    private final BooleanProperty prolongation ; 
    private final ObjectProperty<LocalDate> date_restitution; 
    
    public Emprunt(int id,LocalDate date_emprunt,Boolean prolongation,LocalDate date_restitution) {
        this.id_emprunt=new SimpleIntegerProperty(id);
        this.date_emprunt=new SimpleObjectProperty<>(date_emprunt);
        this.prolongation=new SimpleBooleanProperty(prolongation);
        this.date_restitution= new SimpleObjectProperty<>(date_restitution);
    }
     public int getId_emprunt() {
        return id_emprunt.get();
    }

    public void setId_emprunt(int value) {
        id_emprunt.set(value);
    }

    public IntegerProperty id_empruntProperty() {
        return id_emprunt;
    }
    

    public LocalDate getDate_emprunt() {
        return date_emprunt.get();
    }

    public void setDate_emprunt(LocalDate value) {
        date_emprunt.set(value);
    }

    public ObjectProperty date_empruntProperty() {
        return date_emprunt;
    }
   

    public boolean isProlongation() {
        return prolongation.get();
    }

    public void setProlongation(boolean value) {
        prolongation.set(value);
    }

    public BooleanProperty prolongationProperty() {
        return prolongation;
    }
    

    public LocalDate getDate_restitution() {
        return date_restitution.get();
    }

    public void setDate_restitution(LocalDate value) {
        date_restitution.set(value);
    }

    public ObjectProperty date_restitutionProperty() {
        return date_restitution;
    }
    
   
    
}
