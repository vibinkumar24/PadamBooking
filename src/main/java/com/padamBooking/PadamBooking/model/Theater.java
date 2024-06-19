package com.padamBooking.PadamBooking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "theater")
public class Theater {
    @Id
    int theaterId;
    String theaterName;
    String theaterLocation;
    int totalScreens;

    public Theater(int theaterId, String theaterName, String theaterLocation, int totalScreens) {
        this.theaterId = theaterId;
        this.theaterName = theaterName;
        this.theaterLocation = theaterLocation;
        this.totalScreens = totalScreens;
    }

    public Theater() {
    }

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getTheaterLocation() {
        return theaterLocation;
    }

    public void setTheaterLocation(String theaterLocation) {
        this.theaterLocation = theaterLocation;
    }

    public int getTotalScreens() {
        return totalScreens;
    }

    public void setTotalScreens(int totalScreens) {
        this.totalScreens = totalScreens;
    }

}
