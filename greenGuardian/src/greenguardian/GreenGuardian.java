/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greenguardian;

import byui.cit260.greenguardian.model.City;
import byui.cit260.greenguardian.model.ExploreCityScene;
import byui.cit260.greenguardian.model.Location;
import byui.cit260.greenguardian.model.Player;
import byui.cit260.greenguardian.model.WorkPlaceScene;
import byui.cit260.greenguardian.model.Map;
import byui.cit260.greenguardian.model.Transportation;
import byui.cit260.greenguardian.model.Items;
import byui.cit260.greenguardian.model.Devices;
import byui.cit260.greenguardian.model.Game;

/**
 *
 * @author Joe
 */
public class GreenGuardian {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {

      Player playerOne = new Player();

      playerOne.setName("Lucia B");
      playerOne.setBestTime(7.00);
      playerOne.setCoordinates("(2,9)");
      playerOne.setEffectiveness("Above average");

      String playerInfo = playerOne.toString();
      System.out.println(playerInfo);
      //Displaying Map class
      Map mapfirst = new Map();
      mapfirst.setrowCount(2);
      mapfirst.setcolumnCount(3);

      String mapscoordinates = mapfirst.toString();
      System.out.println(mapscoordinates);

      Transportation car = new Transportation();
      car.setType(1);
      car.setMaxWeight(1850);
      car.setammountLoaded(2);
      car.setLoadedWeight(200);
      car.setCost(20000);
      car.setDescription("The car that you are using is the best car ever, It's brand named Opel Combo");
      String carInfo = car.toString();
      System.out.println(carInfo);
      
      Items item = new Items();
      item.setName("News Paper");
      item.setDescription("News Paper is very commonly known item "
	      + "that transport the news to every person, who has desire about that");
      item.setMaterial(2);
      item.setWeight(25);
      item.setCost(25);
      item.setRecycleable(true);
      String ItemInfo = item.toString();
      System.out.println(ItemInfo);
      
      Devices device = new Devices();
      device.setToolType(1);
      device.setEffectivness((float) 33.33);
      device.setSpace((float) 0.28);
      device.setDescription("This is very unique device that you can use to find more items and materials");
      device.setCost((float) 33.99);
      String deviceInfo = device.toString();
      System.out.println(deviceInfo);
      
      Game game = new Game();
      game.setTotalTime(600);
      game.setDistance((float) 325.26);
      String gameInfo = game.toString();
      System.out.println(gameInfo);
      
      
      City cityInfo = new City();
      cityInfo.setDescription("Tokyo is the largest and dirties city in the world.");
      cityInfo.setCoordinates("(8,0)");
      cityInfo.setNumberPeople("37833000");
      cityInfo.setNumberNeighborhoods("21");
      cityInfo.setNumberParks("42");
      cityInfo.setNumberSchools("30");
      cityInfo.setNumberDowntownsquare("45");
      cityInfo.setPollutionLevel("100%");

      String cityInformation = cityInfo.toString();
      System.out.println(cityInformation);

      Location locationInfo = new Location();

      locationInfo.setRow("5");
      locationInfo.setColumn("9");
      locationInfo.setAmountRemaining("3");

      String locationInformation = locationInfo.toString();
      System.out.println(locationInformation);

      WorkPlaceScene WorkPlaceSceneInfo = new WorkPlaceScene();
      WorkPlaceSceneInfo.setDescription("You will have opportunities to clean, recycle and help the pollution level in Tokyo.");
      WorkPlaceSceneInfo.setTravelTime(55);
      WorkPlaceSceneInfo.setWorkPlace("Would you like to collect trash at the park, neighborhood, school or downtownsquare?");

      String WorkPlaceSceneInformation = WorkPlaceSceneInfo.toString();
      System.out.println(WorkPlaceSceneInformation);

      ExploreCityScene ExploreCitySceneInfo = new ExploreCityScene();
      ExploreCitySceneInfo.setDescription("You will have the opportunity to explore and preview the city before working on it.");
      ExploreCitySceneInfo.setTravelTime(2);

      String ExploreCitySceneInformation = ExploreCitySceneInfo.toString();
      System.out.println(ExploreCitySceneInformation);
   }
}
