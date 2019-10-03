
public class Admin extends Persona {

	String Area;
	
	public void agendarcita() {
		System.out.println("Admin agendarcita method called");
	}
	public void registroentrada() {
		System.out.println("Admnin regristroentrada method called");
	}
	public void registrosalida() {
		System.out.println("Admin registrosalida methos callede");
	}
	
	public void setArea(String Area) {
		this.Area = Area;
	}
	public String getArea() {
		return Area;
	}
}


