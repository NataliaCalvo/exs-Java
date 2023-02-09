package com.natalia.Planets;

public class Planet {
    private static final Planet_type Planet_type = null;
    private String name = null;
    private int satellites = 0;
    private double mass = 0;
    private double volume = 0;
    private int diameter = 0;
    private int distance_Sun = 0;
    private boolean observable = false;



    private enum Planet_type {
        GAS, Earth, Small
    };
    private Planet_type type;
    
public Planet(String name, int satellites, double mass, double volume, int diameter, int distance_Sun,
            boolean observable) {
        this.name = name;
        this.satellites = satellites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.distance_Sun = distance_Sun;
        this.observable = observable;
        this.Planet_type = Planet_type;
    }

public void setName(String name) {
    this.name = name;
}

public void setSatellites(int satellites) {
    this.satellites = satellites;
}

public void setMass(double mass) {
    this.mass = mass;
}

public void setVolume(double volume) {
    this.volume = volume;
}

public void setDiameter(int diameter) {
    this.diameter = diameter;
}

public void setDistance_Sun(int distance_Sun) {
    this.distance_Sun = distance_Sun;
}

public void setObservable(boolean observable) {
    this.observable = observable;
}

public void setType(Planet_type type) {
    this.type = type;
}

public static Planet_type getPlanetType() {
    return Planet_type;
}

public String getName() {
    return name;
}

public int getSatellites() {
    return satellites;
}

public double getMass() {
    return mass;
}

public double getVolume() {
    return volume;
}

public int getDiameter() {
    return diameter;
}

public int getDistance_Sun() {
    return distance_Sun;
}

public boolean isObservable() {
    return observable;
}

public Planet_type getType() {
    return type;
}

public double density_of_Planet (double mass, double volume){
    return mass / volume;

}
public boolean distance_to_Sun (int distance_Sun) {
    float limit = (float) (149597870*3.4);
    if (distance_Sun > 149597870){
        return false;
     } else {
        return true;    
    }
public static void main(String args[]) {
    Planet p1 = newPlanet("Earth", 1,59736E24,1.08321E12,12742,150000000, Planet_type.EARTH, true);

}

    }
}




