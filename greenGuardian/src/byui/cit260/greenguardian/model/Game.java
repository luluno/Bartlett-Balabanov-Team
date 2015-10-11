/*
 * Class File:
 *    Game
 * Author:
 *    Nicholas Balabanov
 * Summary:
 *    This file holds methods and variables that manipulates the game time.
 */
package byui.cit260.greenguardian.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Nicholas Balabanov
 */
public class Game implements Serializable
{
private int totalTime;
private float distance;
   /*
    * Declare the mutators get
    */
public int getTotalTime()
{
return totalTime;
}

public float getDistance()
{
return distance;
}

/*
* Declare the mutators set
*/

public void setTotalTime(int totalTime)
{
this.totalTime = totalTime;
}
public void setDistance (float distance)
{
this.distance = distance;
}


@Override
    public int hashCode() {
        int hash = 7;
      hash = 97 * hash + Objects.hashCode(this.totalTime);
      hash = 97 * hash + Objects.hashCode(this.distance);
      return hash;
    }
   
     @Override
    public String toString() {
        return "Game{" + "TotalTime=" + totalTime +"minutes"+ 
		", distance=" +distance+"miles" + "}";
    }
}