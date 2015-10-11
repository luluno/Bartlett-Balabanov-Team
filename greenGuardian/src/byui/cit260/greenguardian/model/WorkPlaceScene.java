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
public class WorkPlaceScene implements Serializable {
    private String description;
    private double travelTime;
    private String workPlace;

    public WorkPlaceScene() {
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.description);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 11 * hash + Objects.hashCode(this.workPlace);
        return hash;
    }

    @Override
    public String toString() {
        return "WorkPlaceScene{" + "description=" + description + ", travelTime=" + travelTime + ", workPlace=" + workPlace + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WorkPlaceScene other = (WorkPlaceScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.workPlace, other.workPlace)) {
            return false;
        }
        return true;
    }
     
}
