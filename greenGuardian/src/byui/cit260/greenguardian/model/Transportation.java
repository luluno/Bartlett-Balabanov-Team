/*
 * Class File:
 *    Transportation
 * Author:
 *    Nicholas Balabanov
 * Summary:
 *    This file holds all information about the transportation that would be involved in the game.
 */
package byui.cit260.greenguardian.model;

 //Import necessary classes and libraries
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Nicholas Balabanov
 */
public class Transportation implements Serializable {
 
   // Declare a class 
   private int type;
   private float maxWeight;
   private int ammountLoaded;
   private float loadedWeight;
   private float cost;
   private String description;

   /*
    *Declare the mutators get
    */
   public int getType()
   {
      return type;
   }
   public float getMaxWeight() 
   {
      return maxWeight;
   }

   public int getammountLoaded() 
   {
      return ammountLoaded;
   }
   
   public float getLoadedWeight() 
   {
      return loadedWeight;
   }
   public float getCost() 
   {
      return cost;
   }
   public String getDescription()
   {
      return description;
   }
   /*
    * Declare the mutators set
    */
   public void setType(int type)
   {
      this.type = type;
   }
   public void setMaxWeight(float maxWeight) 
   {
      this.maxWeight = maxWeight;
   }

   public void setammountLoaded(int ammountLoaded) 
   {
      this.ammountLoaded = ammountLoaded;
   }
   
   public void setLoadedWeight(float loadedWeight) 
   {
      this.loadedWeight = loadedWeight;
   }
   public void setCost(float cost) 
   {
      this.cost = cost;
   }
   public void setDescription(String description)
   {
      this.description = description;
   }
   @Override
    public int hashCode() {
        int hash = 7;
      hash = 97 * hash + Objects.hashCode(this.type);
      hash = 97 * hash + Objects.hashCode(this.maxWeight);
      hash = 97 * hash + Objects.hashCode(this.ammountLoaded);
      hash = 97 * hash + Objects.hashCode(this.loadedWeight);
      hash = 97 * hash + Objects.hashCode(this.cost);
      hash = 97 * hash + Objects.hashCode(this.description);
      return hash;
    }
   
     @Override
    public String toString() {
        return "Transportation{" + "Type=" + type + 
		", maxWeight=" + maxWeight +
		", ammountLoaded=" + ammountLoaded +
		", loadedweight="+ loadedWeight + 
		", cost=$"+ cost + 
		", description=" +description+ "}";
    }
 }
