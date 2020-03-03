package cct.objectorientedconstructs.s2018260;

import cct.objectorientedconstructs.interfaces.RoomInterface;

import java.text.DateFormatSymbols;
import java.util.*;

public class Room implements RoomInterface {

    // DateFormatSymbols in default Locale
    private static final DateFormatSymbols dfs = new DateFormatSymbols();
    private String type;
    private Double rate;
    private int id;
    private Map<String, boolean[]> availability = new HashMap<>();;

    public Room(){
        //Assign ID
        Random rand = new Random();
        this.id = rand.nextInt(1000);

        //Create months
        String[] months = dfs.getMonths();

        //Create days
        boolean[] days = new boolean[30];
        Arrays.fill(days, false);

        //Create Map
        for (String month: months) {
            availability.put(month, days);
        }
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getRate() {
        return this.rate;
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public Map<String, boolean[]> getAvailability() {
        return availability;
    }

    @Override
    public void setAvailability(Map<String, boolean[]> availability) {
        this.availability = availability;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public boolean isAvailable(String month, int day) {
        //Get array from the month given
        boolean[] days = availability.get(month);

        return days[day-1];
    }

    @Override
    public boolean book(String month, int day) {
        boolean roomAvailable = !availability.get(month)[day];

        if (roomAvailable){
            availability.get(month)[day-1] = true;
            return true;
        }
        return false;
    }
}
