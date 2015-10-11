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

/**
 *
 * @author Joe
 */
public class GreenGuardian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     Player playerOne = new Player ();
     
     playerOne.setName("Lucia B");
     playerOne.setBestTime(7.00);
     playerOne.setCoordinates("(2,9)");
     playerOne.setEffectiveness("Above average");
     
     String playerInfo = playerOne.toString();
     System.out.println(playerInfo);
    
        City cityInfo = new City ();
    
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
     
            Location locationInfo = new Location ();
     
            locationInfo.setRow("5");
            locationInfo.setColumn("9");
            locationInfo.setAmountRemaining("3");
    
            String locationInformation = locationInfo.toString();
            System.out.println(locationInformation);
    
                WorkPlaceScene WorkPlaceSceneInfo = new WorkPlaceScene ();
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