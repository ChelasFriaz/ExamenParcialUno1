
public class Persona {

	public String name;
	public String apellido;
	public int age;
	public double estatura;
	public String sexo;
	
	public Persona(String name, String apellido
			, int age, double estatura, String sexo) {
		
		this.name = name;
		this.apellido = apellido;
		this.age = age;
		this.estatura = estatura;
		this.sexo = sexo;
	
	}
	    super(name, apellido , age, estatura, sexo);
	
		public void caminar() {
			System.out.println("Persona caminar method called");
		}
		public void hablar () {
			System.out.println("Persona hablar method called");
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		public void setEstatura(double estatura) {
			this.estatura = estatura;
		}
		
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		
		public String getName() {
			return name;
		}
		
		public String getApellido() {
			return apellido;
		}
		public int getAge() {
			return age;
		}
		public double getEstatura(){		
			return estatura;
		}
		public String getSexo() {
			return sexo;
		}
	}

