import java.awt.Image;
import java.io.File;

public class Request {
	private Image photo;
	private boolean requestStatus;
	private int cont;
	private Group group;
	private User user;
	
	public Request(Image photo, Group group, User user) {
		this.photo = photo;
		requestStatus = false;
		cont = 0;
		this.group = group;
		this.user = user;
	}
	
	public static void sendRequest(Request request) {
		group.addRequest(request);
	}
	
	public void generatePose() {
		//genera una pose random
	}
	
	public void notification() {
		//notifica a los usuarios del grupo
		//notifica al usuario si ha sido admitido en el grupo
	}
	
	public void loquesea(int numMembers) {
		cont++;
		if(cont == numMembers/2) {
			requestStatus = true;
			group.joinGroup(user);
		}
	}
}