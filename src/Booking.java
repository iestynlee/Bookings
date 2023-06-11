public class Booking {

	//Local Variables
	private String time;
	private String status;
	private String email;
	private String code;
	private String studentemail;
	private String free;
	private String available;

	//Constructor
	public Booking(String studentemail){
		this.studentemail = studentemail;
	}

	//Setters and Getters
	public String getStudentEmail(){
		String valid = "Not Valid";
        if(endsWith(email)){
        	return email;
        }
        else{
        	return valid;
        }
	}

	// Checking end of email
	private boolean endsWith(String studentemail){
    	boolean result = true;
    	String str = email;
    	if(str.endsWith("@uok.ac.uk")){
    		result = true;
    	}
    	else{
    		result = false;
    	}
    	return result;
    }

    public String status(){
		String status = "";
		BookableRoom bookroom = new BookableRoom();
		available = bookroom.getStatus();
		AssistantOnShift assistant = new AssistantOnShift();
		free = assistant.getStatus();
		if(free == "FREE" && available == "AVAILABLE"){
			status = "SCHEDULED";
		}else{
			status = "COMPLETED";
		}
		return status;
    }

    public String toString(){
    	return "| " + time + " | " + status + " | " + email + " | " + code + " | " + studentemail + " |";
    }

}