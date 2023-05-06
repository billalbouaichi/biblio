
package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Sanction {

    private final IntegerProperty id_sanction ;
    private final StringProperty duréeRetard ;
    private final StringProperty duréeSanction ;

    public Sanction(int id_sanction, String duréeRetard, String duréeSanction) {
        this.id_sanction = new SimpleIntegerProperty(id_sanction);
        this.duréeRetard = new SimpleStringProperty(duréeRetard);
        this.duréeSanction = new SimpleStringProperty(duréeSanction);
    }
    
    
    
    public int getId_sanction() {
        return id_sanction.get();
    }

    public void setId_sanction(int value) {
        id_sanction.set(value);
    }

    public IntegerProperty id_sanctionProperty() {
        return id_sanction;
    }
    

    public String getDuréeRetard() {
        return duréeRetard.get();
    }

    public void setDuréeRetard(String value) {
        duréeRetard.set(value);
    }

    public StringProperty duréeRetardProperty() {
        return duréeRetard;
    }
    

    public String getDuréeSanction() {
        return duréeSanction.get();
    }

    public void setDuréeSanction(String value) {
        duréeSanction.set(value);
    }

    public StringProperty duréeSanctionProperty() {
        return duréeSanction;
    }
    
    
}
