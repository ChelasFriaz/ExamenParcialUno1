
public class Docente extends Persona {

	public String Carrera;
	public String Departamento;
	public String Nivel;
	
	public void calificar() {
		System.out.println("Docente calificar method called");
	}
	public void rega�ar() {
		System.out.println("Docente rega�ar method called");
	}
	public void setCarrera (String Carrera) {
		this.Carrera = Carrera;
	}
	public void setDepartamento (String Departamento) {
		this.Departamento = Departamento;
	}
	public void setNivel (String Nivel) {
		this.Nivel = Nivel;
	}
	public String getCarrera() {
		return Carrera;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public String getNivel() {
		return Nivel;
	}
	
}
