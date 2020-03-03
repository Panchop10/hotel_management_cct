package cct.objectorientedconstructs.interfaces;

/**
 *
 * This is one of the interfaces you need to implement
 *
 * @author ONE of you needs to take responsibility for this, whoever it is, put your student number here
 */
public interface HotelManagementSystemInterface {
	
	/**
	 * This method returns a String representing a calendar for 
	 * a specific month. This calendar should put each week on
	 * a new line. If there is no availability on a particular
	 * day in any room then you should put a * beside the date.
	 * 
	 * This method should not print out directly, it returns
	 * a string to be called in the main method.
	 * 
	 * @param month of which the calendar wants to be known
	 * @param hotel from with the calendar 
	 * @return
	 */
	public String getCalendar(String month, HotelInterface hotel);	
	
	/**
	 * This method reads in from  a given text file to get the 
	 * details of this hotel and sets up the hotel rooms, 
	 * how many rooms there are and what type each is. 
	 * 
	 * You may assume that the structure of this file is 
	 * always the same. It is called after the hotel itself, 
	 * the first line is the rate the name of the hotel, the second 
	 * is rate and the number of single rooms, the third is 
	 * the rate and the number of double rooms and the 
	 * fourth is the rate and the number of 
	 * penthouse rooms.
	 * 
	 * @return an instance of the hotel class, which should 
	 * 		   implement the HotelInterface 
	 */
	public HotelInterface setupHotel(String file);
	
}
