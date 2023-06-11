public class Room {

	//Local Variables
	private String code;
	private int capacity;
	private String oldCode;

	//Constructors
	public Room(){
		this.code = code;
		this.capacity = capacity;
	}

	public Room(String code, int capacity){
		this.code = code;
		this.capacity = capacity;
	}
	/*
	setCode(String c){
		oldCode = code;
		code = c;
	}*/

	//Getters and Setters
	public String getCode(){
		if(true){
			return code;
		}
		else{
			return "invalid code";
		}
	}

	public int getCapacity(){
		if(isValid(capacity)){
			return capacity;
		} else{
			return 0;
		}
	}

	private String getOldCode(){
		return oldCode;
	}

	private boolean isUnique(String code){
		boolean result = true;
		/*if(getOldCode() == getCode()){
			result = true;
		}
		else{
			result = false;
		}*/
		return result;
	}

	private boolean isValid(int capacity){
		boolean result = true;
		if(capacity > 0){
			result = true;
		}
		else{
			result = false;
		}
		return result;
	}

	public String toString(){
		return "| " + code + " | capacity: " + capacity + " |";
	}
}