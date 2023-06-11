public class AssistantOnShift{
	
	private int time;
	private String status;
	private boolean timeSlot;
	private String email;

	public AssistantOnShift(){
		this.timeSlot = timeSlot;
		this.time = time;
	}

	public AssistantOnShift(boolean timeSlot, int time){
		this.timeSlot = timeSlot;
		this.time = time;
	}

	public boolean getTimeSlot(){
		return timeSlot;
	}

	public String getStatus(){
		int available;
		String status = "";
		boolean timeSlot;
		timeSlot = getTimeSlot();
		if(timeSlot == true){
			status = "BUSY";
		}else{
			status = "FREE";
		}
		return status;
	}

	public String getEmployeeEmail(){
		String email = "";
		Assistant assistant = new Assistant();
		email = assistant.getEmail();
		return email;
	}

	public String toString(){
		return "| " + time + " | " + status + " | " + email + " |";
	}
}