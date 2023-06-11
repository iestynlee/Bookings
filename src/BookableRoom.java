import java.time.LocalDateTime; // Imports the LocalDateTime Class
import java.time.format.DateTimeFormatter; // Imports the DateTime Formatter
import java.util.*;

public class BookableRoom {

	private int occupancy;
	private String time;
	private String status;
	private String code;

	public BookableRoom(){
		this.occupancy = occupancy;
		this.time = time;
	}

	public BookableRoom(int occupancy, String time){
		this.occupancy = occupancy;
		this.time = time;
	}
	
	public int getOccupancy(){
		return occupancy;
	}

	public String getStatus(){
		int size;
		String status = "";
		Room room = new Room();
		size = room.getCapacity();  
		if(occupancy == 0){
			status = "EMPTY";
		}else if(size < occupancy){
			status = "AVAILABLE";
		}else{
			status = "FULL";
		}
		return status;
	}

	public String Code(){
		Room room = new Room();
		code = room.getCode();
		return code;
	}

	public String getTime(){
		return time;
	}

	public String toString(){
		return "| " + time + " | " + status + " | " + code + " | occupancy: " + occupancy + " |";
	}
}