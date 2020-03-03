package cct.objectorientedconstructs.interfaces;

import java.util.Map;

/**
 *
 * This is one of the interfaces you need to implement
 *
 * @author ONE of you needs to take responsibility for this, whoever it is, put your student number here 2018260
 */
public interface RoomInterface {
	/**
	 * Return the type of room this is.
	 * 
	 * @return 	the type of room. This is defined as a String
	 */
	public String getType();
	
	/**
	 * Setter method to set the type of room.
	 * 
	 * @param type		Type of room: Double, Single, Penthouse
	 */
	public void setType(String type);
	
	/**
	 * Return the rate of the room. 
	 * 
	 * @return		the amount of the room
	 */
	public double getRate();
	
	/**
	 * Set the rate for the room.
	 * 
	 * @param rate
	 */
	public void setRate(double rate);
	
	/**
	 * Return a Map of the room's availability.
	 * 
	 * @return
	 */
	public Map<String, boolean[]> getAvailability();
	
	/**
	 * Set the full availability for the room. 
	 * 
	 * @param availability
	 */
	public void setAvailability(Map<String, boolean[]> availability);
	
	/**
	 * Return the id of the room
	 * 
	 * @return
	 */
	public int getId();
	
	/**
	 * Return whether or not the room is available on the given month and day. Month is 
	 * a String, day is an int within the limits of the number of days in a given month
	 * 
	 * @param month		Month being checked
	 * @param day		Day being checked
	 * @return			true or false if it is available or not
	 */
	public boolean isAvailable(String month, int day);	
	
	/**
	 * Book a room on the given month and day. To book a room its availability is changed
	 * to false on the given month and day. This should return true or false if this change is 
	 * successfully made
	 * 
	 * @param month		Month to book for @link Month
	 * @param day		day to book for 
	 * @return			true or false if the booking is completed
	 */
	public boolean book(String month, int day);
}
