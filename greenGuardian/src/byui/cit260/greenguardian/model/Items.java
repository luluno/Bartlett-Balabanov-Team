/*
 * Class File:
 *    Items
 * Author:
 *    Nicholas Balabanov
 * Summary:
 *    This file holds all information about the Items that would be involved in the game.
 */
package byui.cit260.greenguardian.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Nicholas Balabanov
 */
public class Items implements Serializable
{
    // Declare a class 
   private String name;
   private String description;
   private int material;
   private float Weight;
   private boolean recycleable;
   private float cost;
   
  public Items () 
  {}

   /*
    *Declare the mutators get
    */
   public String getName()
   {
      return name;
   }
   
   public String getDescription()
   {
      return description;
   }

   public int getMaterial() 
   {
      return material;
   }
      
   public float getWeight() 
   {
      return Weight;
   }

   public boolean getRecycleable() 
   {
      return recycleable;
   }
   public float getCost() 
   {
      return cost;
   }
   
   /*
    * Declare the mutators set
    */
   public void setName( String name)
   {
      this.name = name;
   }
   
   public void setDescription(String description)
   {
      this.description = description;
   }

   public void setMaterial(int material) 
   {
      this.material = material;
   }
      
   public void setWeight(float Weight) 
   {
      this.Weight = Weight;
   }
   
      public void setRecycleable(boolean recycleable) 
   {
     this.recycleable = recycleable;
   }
   public void setCost(float cost) 
   {
      this.cost = cost;
   }
   
   private boolean isRecycleable (boolean recycleable)
   {
      
   if(!recycleable)
      return false;
   else
      return true;
   }
   
   @Override
    public int hashCode() {
        int hash = 7;
      hash = 97 * hash + Objects.hashCode(this.name);
      hash = 97 * hash + Objects.hashCode(this.Weight);
      hash = 97 * hash + Objects.hashCode(this.material);
      hash = 97 * hash + Objects.hashCode(this.cost);
      hash = 97 * hash + Objects.hashCode(this.description);
      return hash;
    }
   
     @Override
    public String toString() {
        return "Item{" + "Name=" + name + 
		", Weight=" + Weight +
		", material=" + material +
		", recylcleable="+ (isRecycleable(recycleable)? "Yes": "No") + 
		", cost="+ cost + " cents" +
		", description=" +description+ "}";
    }
}
