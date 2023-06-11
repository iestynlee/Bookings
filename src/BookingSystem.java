public class BookingSystem{
	
	private BookableRoom[] bookableroom;
	private AssistantOnShift[] assistantonshift;
	private Booking[] booking;
	private int interval;

	//Constructor
	public BookingSystem(){
		this.bookableroom = bookableroom;
		this.assistantonshift = assistantonshift;
		this.booking = booking;
	}

	public int getTimeInterval(){
		int interval = 60;
		return interval;
	}
}