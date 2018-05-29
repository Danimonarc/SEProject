import java.util.Date;
import java.awt.Image;
import java.awt.List;
import java.time.LocalTime;

public class User {
	private String name, surname;
	private Date dateOfBirth;
	private Image photo;
	private int strikes;
	private static final int MAX_STRIKES = 3;
	private double rating;
	
	public List<Group> search(LocalTime hour, String origin, String destination){
		//QUEEEEEEERY
		for(Group aux : ListGroups){
			if(hour.equals(aux.hour) && origin.equals(aux.origin) && destination.equals(aux.destination)){
				FilteredGroups.add(aux);
			}
		}
	}
	
	public void createRequest(Image signPhoto, Group group, User me){
		Request request = new Request(signPhoto, group, me);
		group.addRequest(request);
	}
	
	public void createMessage(String text){
		Message msg = new Message(text);
	}
	
	public void createGroup(LocalTime hour, String origin, String destination, User me){
		Group g = new Group(hour, origin, destination, me);
	}
	
	public void reportUser(User user, String report){
		// Query for users
		for(User aux : UsersList){
			if(aux.equals(user)){
				user.strikes++;
				if(user.strikes == MAX_STRIKES){
					ListOfBannedUsers.add(user);
					System.out.println("This user has been banned.");
				} else {
					System.out.println("Thanks for reporting this user, we will take care of him.");
				}
			}
		}
	}
	
	public void ReportArea(String s){
		//query para las zonas
		for(Point aux : ListaZonasConflictivas){
			if(s.equals(aux)){
				System.out.println("The area was also reported by other users. Thanks for making the app safier!");
			} else {
				ListaZonasConflictivas.add(s);
				System.out.println("Thanks for reporting this area, we will take care of it.");
			}
		}
	}
	
	public void rateUser(User user, int rate){
		if(rate>=0 && rate<=5){
			//Calcular media mediante query y updatear rate;
			
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
}
