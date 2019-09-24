package org.fasttrackit;

public class RecreationalActivity {
    private String name;
    private double time;
    private String place;

    public RecreationalActivity(String name) {
        this.name = name;
    }

    public RecreationalActivity() {

    }

    public String getName() {
       return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "RecreationalActivity{" +
                "name='" + name + '\'' +
                '}';
    }
}
