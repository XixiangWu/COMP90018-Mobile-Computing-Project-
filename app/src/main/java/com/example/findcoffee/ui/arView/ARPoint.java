package com.example.findcoffee.ui.arView;

/**
 * Created by: Xixiang Wu
 * Date:       1/11/20.
 * Email:      xixiangw@student.unimelb.edu.au
 */

import android.location.Location;

public class ARPoint {

    /**
     * This is the ARPoint class, used to save the most important data.
     * */

    Location location;
    String name;

    public ARPoint(String name, double lat, double lon, double altitude) {
        this.name = name;
        location = new Location("ARPoint");
        location.setLatitude(lat);
        location.setLongitude(lon);
        location.setAltitude(altitude);
    }

    /* Getter */
    public Location getLocation() {
        return location;
    }
    public String getName() {
        return name;
    }
}
