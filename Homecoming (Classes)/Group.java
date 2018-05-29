	import java.awt.Image;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Group {
	private LocalTime hour;
	private String place;
	private String destination;
	private List<User> members;
	private Image map;
	private List<Request> requests;
	
	private static final int MAX_MEMBERS = 20;
	
	public Group (LocalTime h, String p, String d, User creator) {
		hour = h;
		place = p;
		destination = d;
		members = new ArrayList<User>(MAX_MEMBERS);  
		members.add(creator);
		requests = new ArrayList><Request>(MAX_MEMBERS);
		
		//map= SACAR DE LA BASE DE DATOS
		
	}
	
	public void setHour (LocalTime newhour) {
		hour = newhour;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public LocalTime getHour() {
		return hour;
	}
	
	public void callPolice() {
	}
	
	public List<User> getMembers() {
		return members;
	}
	
	public void joinGroup (User newuser) {
		members.add(newuser);
	}
	
	public void leaveGroup (User olduser) {
		members.remove((members.indexOf(olduser)));
	}
	
	//PARA LA GUI: USAR PARA IMPRIMIR LOS MAPAS
	public Image getMap () {
		return map;
	}
	
	public void acceptRequest(Request request) {
		requests.loquesea(members.size());
	}
	
	public abstract void notification();
	
	public void addRequest (Request newrequest) {
		requests.add(newrequest);
	}
		
}
