public class Assistant {

	//private String fname;
	//private String sname;
	private String fullname;
	private String email;

	//public Assistant(String fname, String sname, String email) {
	//This is the constructor for the Assistant
	public Assistant(){
		this.fullname = fullname;
		this.email = email;
	}


	public Assistant(String fullname, String email) {
		//this.fname = fname;
		//this.sname = sname;
		this.fullname = fullname;
		this.email = email;
	}
	/* Was used for first and second name
	public String getFname() {
		return fname;
	}

	public String getSname() {
		return sname;
	}
	*/

	//Gets the fullname
	public String getFullName(){
		return fullname;
	}

	//Gets the Email address but checks if its valid
	public String getEmail() {
		String valid = "Not Valid";
        if(endsWith(email)){
        	return email;
        }
        else{
        	return valid;
        }
    }

    // For setting the mail
    public void setEmail(String email) {
        this.email = email;
    }

    //Checks if it ends with @uok.ac.uk
    private boolean endsWith(String email){
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

    /* Was using this to add first and last name
    public String getFullName(){
    	String fullName = "";
    	if(notEmpty(fname)){
    		fullName = addToName(fullName, fname);
    	}
    	if(notEmpty(sname)){
    		fullName = addToName(fullName, sname);
    	}
    	return fullName;
    }

    private boolean notEmpty(String x){
    	return x != null && !x.isEmpty();
    }

    private String addToName(String fullName, String xName){
    	return fullName + xName + " ";
    }*/

    // To string method
    public String toString(){
    	return "| " + fullname + " | " + email + " |";
    }
}