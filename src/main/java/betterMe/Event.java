package betterMe;
import java.time.*;

public class Event {
	public String eventName ;
    public int eventId;
    public LocalDate eventdate;
    public String venue;
    public LocalTime time;
    public String info;
    public String content;
    
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public LocalDate getEventdate() {
		return eventdate;
	}
	public void setEventdate(LocalDate eventdate) {
		this.eventdate = eventdate;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

    
}
