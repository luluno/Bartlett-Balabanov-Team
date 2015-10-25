/*
 * Class File:
 *   MapsControl
 * Author:
 *    Nicholas Balabanov
 *   Lucia Bartlett
 * Summary:
 *    This file holds all the methods that requires to initialize and work with the map in the program.
 */
package byui.cit260.greenguardian.control;

/**
 *
 * @author Nicholas Balabanov and Lucia Bartlett
 */
 
public class MapControl {

   private static final float AVERAGE_HUMAN_SPEED = (float) 0.08333333;
   /*
    * Defines the structure of the cityCoordinates
    */
   
   /*
    * This part is implementing and calculating the time that requires for player to move between two
    * cities or locations.
    */

   public float calcTimeToMove(Coordinates playerCoordinates, Coordinates cityCoordinates) {
      byte length=0, width =0, side=0;
      float distance, time, speed = AVERAGE_HUMAN_SPEED;
      if (cityCoordinates.getRow() >= playerCoordinates.getRow()) {
	 length = (byte) (cityCoordinates.row - playerCoordinates.row);
      } else if (cityCoordinates.getRow() < playerCoordinates.getRow()) {
	 length = (byte) (playerCoordinates.row - cityCoordinates.row);
      }

      if (cityCoordinates.getColumn() >= playerCoordinates.getColumn()) {
	 width = (byte) (cityCoordinates.column - playerCoordinates.column);
      } else if (cityCoordinates.getColumn() < playerCoordinates.getColumn()) {
	 width = (byte) (playerCoordinates.column - cityCoordinates.column);
      }

      if (length == width) {
	 side = width = length;
	 distance = (float) (side * Math.sqrt(2));
      }
      else if (length == 0 && width == 0)
      {
      return 0;
      } else if (length == 0)
      {
      distance = width;
      }
      else if (width == 0)
      {
      distance = length;
      }
      else
	 distance = length * width;
      time = (distance * 20) / speed;
      
      time =Math.round(time);
      
      return time;
   }
   
    public class Coordinates {

      public Coordinates() {
	 this.row = 0;
	 this.column = 0;
      }
      /********************************
      *This is a Non-Default constructor
      ********************************/
      public Coordinates(byte row, byte column)
      {
	 setRow(row);
	 setColumn(column);
      }

      public byte getRow() {
	 return row;
      }

      public byte getColumn() {
	 return column;
      }

      public final void setRow(byte row) {
	 this.row = row;
      }

      public final void setColumn(byte column) {
	 this.column = column;
      }

      private byte row, column;

    }
}
