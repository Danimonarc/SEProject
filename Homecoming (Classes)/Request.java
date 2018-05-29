import java.awt.Image;

public class Request {
	private Image photo;
	private boolean requestStatus;
	private int cont;
	private static Group group;
	private static User user;
	
	public Request(Image photo, Group group, User user) {
		this.photo = photo;
		requestStatus = false;
		cont = 0;
		Request.group = group;
		Request.user = user;
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
