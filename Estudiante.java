
public class Estudiante {

	// atributos de clase
	private int id;
	private int edad;
	private String telefono;
	private int numeroDeNotas;
	private float sumaDeNotas;
	private float notaMedia;

	// constructor por defecto
	public Estudiante() {
		this.id = -1;
		this.edad = 0;
		this.telefono = "666 666 666";
		this.numeroDeNotas = 0;
		this.sumaDeNotas = 0;
		this.notaMedia = 0;
	}

	// constructor parametrizado
	public Estudiante(int edad, String telefono) {
		this.id = -1;
		this.edad = edad;
		this.telefono = telefono;
		this.numeroDeNotas = 0;
		this.sumaDeNotas = 0;
		this.notaMedia = 0;
	}

	// constructor parametrizado
	public Estudiante(int edad, String telefono, int numeroNotas, float sumaNotas, float notaMedia) {
		this.id = -1;
		this.edad = edad;
		this.telefono = telefono;
		this.numeroDeNotas = numeroNotas;
		this.sumaDeNotas = sumaNotas;
		this.notaMedia = notaMedia;
	}

	// consultores o getters
	public int getId() {
		return this.id;
	}

	public int getEdad() {
		return this.edad;
	}

	public String getTelefono() {
		return this.telefono;
	}
	
	// ... completar con el resto de consultores

	// modificadores o setters
	public void setId(int id) {
		this.id = id;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// ... completar con el resto de modificadores

	// mostrar info de estudiante por consola
	public void mostrarInfo() {
		System.out.println("Id: " + this.id);
		System.out.println("Edad: " + this.edad);
		System.out.println("Teléfono: " + this.telefono);
		System.out.println("Cantidad de notas: " + this.numeroDeNotas);
		System.out.println("Suma de notas: " + this.sumaDeNotas);
		System.out.println("Nota media: " + this.notaMedia + "\n");
	}

	// añade una nota al estudiante y actualiza los atributos
	public void agregarNuevaNota(float nota) {
		this.numeroDeNotas++;
		this.sumaDeNotas += nota;
		this.notaMedia = this.sumaDeNotas / this.numeroDeNotas;
	}

	// sobrecarga de agregarNuevaNota que permite reiniciar las notas antes
	public void agregarNuevaNota(float nota, boolean reiniciar) {
		if (reiniciar) {
			this.numeroDeNotas = 0;
			this.sumaDeNotas = 0;
			this.notaMedia = 0;
		}
		agregarNuevaNota(nota);
	}

	// método estático para crear un estudiante
	public static Estudiante crearEstudiante() {
		return new Estudiante();
	}

}
