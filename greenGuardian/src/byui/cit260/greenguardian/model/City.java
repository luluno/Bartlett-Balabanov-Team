/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.greenguardian.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Joe
 */
public class City implements Serializable{
 
    private String description;
            private String coordinates;
                    private String numberPeople;
                            private String numberNeighborhoods;
                                    private String numberParks;
                                            private String numberSchools;
                                            private String numberDowntownsquare;
                                            private String pollutionLevel;

    public City() {
    }
                                           
                                         
                                            
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(String numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getNumberNeighborhoods() {
        return numberNeighborhoods;
    }

    public void setNumberNeighborhoods(String numberNeighborhoods) {
        this.numberNeighborhoods = numberNeighborhoods;
    }

    public String getNumberParks() {
        return numberParks;
    }

    public void setNumberParks(String numberParks) {
        this.numberParks = numberParks;
    }

    public String getNumberSchools() {
        return numberSchools;
    }

    public void setNumberSchools(String numberSchools) {
        this.numberSchools = numberSchools;
    }

    public String getNumberDowntownsquare() {
        return numberDowntownsquare;
    }

    public void setNumberDowntownsquare(String numberDowntownsquare) {
        this.numberDowntownsquare = numberDowntownsquare;
    }

    public String getPollutionLevel() {
        return pollutionLevel;
    }

    public void setPollutionLevel(String pollutionLevel) {
        this.pollutionLevel = pollutionLevel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.coordinates);
        hash = 97 * hash + Objects.hashCode(this.numberPeople);
        hash = 97 * hash + Objects.hashCode(this.numberNeighborhoods);
        hash = 97 * hash + Objects.hashCode(this.numberParks);
        hash = 97 * hash + Objects.hashCode(this.numberSchools);
        hash = 97 * hash + Objects.hashCode(this.numberDowntownsquare);
        hash = 97 * hash + Objects.hashCode(this.pollutionLevel);
        return hash;
    }

    @Override
    public String toString() {
        return "City{" + "description=" + description + ", coordinates=" + coordinates + ", numberPeople=" + numberPeople + ", numberNeighborhoods=" + numberNeighborhoods + ", numberParks=" + numberParks + ", numberSchools=" + numberSchools + ", numberDowntownsquare=" + numberDowntownsquare + ", pollutionLevel=" + pollutionLevel + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final City other = (City) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        if (!Objects.equals(this.numberPeople, other.numberPeople)) {
            return false;
        }
        if (!Objects.equals(this.numberNeighborhoods, other.numberNeighborhoods)) {
            return false;
        }
        if (!Objects.equals(this.numberParks, other.numberParks)) {
            return false;
        }
        if (!Objects.equals(this.numberSchools, other.numberSchools)) {
            return false;
        }
        if (!Objects.equals(this.numberDowntownsquare, other.numberDowntownsquare)) {
            return false;
        }
        if (!Objects.equals(this.pollutionLevel, other.pollutionLevel)) {
            return false;
        }
        return true;
    }   
    
}
