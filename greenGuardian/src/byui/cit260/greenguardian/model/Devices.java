/*
 * Class File:
 *    Devices
 * Author:
 *    Nicholas Balabanov
 * Summary:
 *    This file holds all information about all Devices that would be involved in the game.
 */
package byui.cit260.greenguardian.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Nicholas Balabanov
 */
public class Devices implements Serializable
{
    // Declare a class 
   private int toolType;
   private String description;
   private float effectivness;
   private float space;
   private float cost;
   
   public Devices ()
   {}
   /*
    *Declare the mutators get
    */
   public int getToolType()
   {
      return toolType;
   }
   
   public String getDescription()
   {
      return description;
   }

   public float getEffectivness() 
   {
      return effectivness;
   }
      
   public float getSpace() 
   {
      return space;
   }

   public float getCost() 
   {
      return cost;
   }
   
   /*
    * Declare the mutators set
    */
   public void setToolType( int toolType)
   {
      this.toolType = toolType;
   }
   
   public void setDescription(String description)
   {
      this.description = description;
   }

   public void setEffectivness(float effectivness) 
   {
      this.effectivness = effectivness;
   }
      
   public void setSpace(float space) 
   {
      this.space = space;
   }
   
   public void setCost(float cost) 
   {
      this.cost = cost;
   }
   
   @Override
    public int hashCode() {
        int hash = 7;
      hash = 97 * hash + Objects.hashCode(this.toolType);
      hash = 97 * hash + Objects.hashCode(this.effectivness);
      hash = 97 * hash + Objects.hashCode(this.space);
      hash = 97 * hash + Objects.hashCode(this.cost);
      hash = 97 * hash + Objects.hashCode(this.description);
      return hash;
    }
   
     @Override
    public String toString() {
        return "Devices{" + "toolType=" + toolType + 
		", effectivness=" + effectivness+"%"+
		", space=" + space +
		", cost="+ cost + "$" +
		", description=" +description+ "}";
    }
}