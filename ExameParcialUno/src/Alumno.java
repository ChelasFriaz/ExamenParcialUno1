
public class Alumno extends Persona {

	public String Carrera1;
	public String Ciclo;
	
	public void asistir() {
		System.out.println ("Alumno asistir method called");
	}
	public void tomarnota() {
		System.out.println ("Alumno tomarnota method called");
	}
	
	public void setCarrera1(String Carrera1) {
		this.Carrera1 = Carrera1;
	}
	
	public void setCiclo(String Ciclo) {
		this.Ciclo = Ciclo;
	}
	
	public String getCarrera1(){
		return Carrera1;
	}
	public String getCiclo() {
		return Ciclo;
	}
}
