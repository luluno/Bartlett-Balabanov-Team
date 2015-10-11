/*
 * Class File:
 *    Map
 * Author:
 *    Nicholas Balabanov
 * Summary:
 *    This file is respond to work on with distance and with the actual maps
 *   representation. This class also respond on to how it will display the Map
 *  on the screen for user.
 */
package byui.cit260.greenguardian.model;

//Import necessary classes and libraries
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Nicholas Balabanov
 */
public class Map implements Serializable {

   // Declare a class variables

   private int rowCount;
   private int columnCount;

   /*
    *Declare the mutators get
    */
   public int getrowCount() 
   {
      return rowCount;
   }

   public int getcolumnCount() 
   {
      return columnCount;
   }

   /*
    * Declare the mutators set
    */
   public void setrowCount(int rowCount) 
   {
      this.rowCount = rowCount;
   }

   public void setcolumnCount(int columnCount) 
   {
      this.columnCount = columnCount;
   }
   
   @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.columnCount);
        hash = 97 * hash + Objects.hashCode(this.rowCount);
        return hash;
    }
   
     @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + "}";
    }
}
