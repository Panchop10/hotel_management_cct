package cct.objectorientedconstructs.interfaces;

import java.util.List;


/**
 *
 * This is one of the interfaces you need to implement
 *
 * @author ONE of you needs to take responsibility for this, whoever it is, put your student number here
 */
public interface HotelInterface {
	
	/**
	 * Return the full list of rooms. 
	 * 
	 * @return		List of rooms
	 */
	public List<RoomInterface> getRooms();
	
	/**
	 * Helper method to set all the rooms with a list if we so wished
	 * 
	 * @param rooms	List of rooms
	 */
	public void setRooms(List<RoomInterface> rooms);
	
	/**
	 * Return the name of the hotel
	 * 
	 * @return
	 */
	public String getName();
	
	/**
	 * Set the name of the hotel.
	 * 
	 * @param name
	 */
	public void setName(String name);
	
	/**
	 * Check through all rooms in this hotel and see if there is continuous availability
	 * in any specific room. It is not enough to just have availability somewhere for the 
	 * length of stay, we need it to be in one specific room.
	 * 
	 * @param month				Month of proposed stay
	 * @param day				Day of start of proposed stay
	 * @param type				RoomType, what sort of room for the proposed stay
	 * @param lengthOfStay		how long is the proposed stay for
	 * @return					true or false is there availability for the proposed stay
	 */
	public boolean checkAvailability(String month, int day, String type, int lengthOfStay);

	/**
	 * Assuming there is availability, get the id of a room that fits that availability
	 * 
	 * @param month				Month of the proposed stay
	 * @param day				day of start of the proposed stay
	 * @param type				RoomType, what sort of room for the proposed stay
	 * @param lengthOfStay		how long is the proposed stay for
	 * @return					the id of a room that fits the bill
	 */
	public int getRoomAvailable(String month, int day, String type, int lengthOfStay);
	
	/**
	 * How many rooms are in the hotel
	 * 
	 * @return number of rooms
	 */
	public int getNumberOfRooms();
	
	/**
	 * Book a room for the proposed stay. It should be one room for the full stay. There is no need
	 * to consider how to book it so that a stay can roll over the end of a given month
	 * 
	 * @param month				Month of proposed stay
	 * @param day				Day of start of proposed stay
	 * @param type				RoomType for the proposed stay
	 * @param lengthOfStay		length of proposed stay
	 * @return					true or false has the room been booked
	 */
	public boolean bookRoom(String month, int day, String type, int lengthOfStay);
}
