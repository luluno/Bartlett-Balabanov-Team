/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.greenguardian.model;

import java.util.Objects;
import java.io.Serializable;
/**
 *
 * @author Joe
 */
public class Location implements Serializable {
    

// class instance variables
   private String row;
   private String column;
   private String amountRemaining;

    public Location() {
    }

   
   
    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(String amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.row);
        hash = 97 * hash + Objects.hashCode(this.column);
        hash = 97 * hash + Objects.hashCode(this.amountRemaining);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", amountRemaining=" + amountRemaining + '}';
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        if (!Objects.equals(this.amountRemaining, other.amountRemaining)) {
            return false;
        }
        return true;
    }
   
   
   
}
