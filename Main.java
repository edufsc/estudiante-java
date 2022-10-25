
public class Main {

	public static void main(String[] args) {
		
		// estudiante con constructor por defecto
		Estudiante estudiante1 = new Estudiante();
		estudiante1.mostrarInfo();

		// estudiante con constructor parametrizado
		Estudiante estudiante2 = new Estudiante(17, "(+34) 643 129 876");
		estudiante2.mostrarInfo();

		// estudiante con otro constructor parametrizado
		Estudiante estudiante3 = new Estudiante(18, "(+34) 222 444 333", 3, 30, 10);
		estudiante3.mostrarInfo();

		// agregamos una nueva nota
		estudiante3.agregarNuevaNota(9.0f);
		estudiante3.mostrarInfo();

		// obtenemos la edad con nuestro consultor
		int edadEstudiante3 = estudiante3.getEdad();

		System.out.printf("Edad estudiante3: %d", edadEstudiante3).println();

		// modificamos la edad con nuestro modificador
		estudiante3.setEdad(19);

		edadEstudiante3 = estudiante3.getEdad();

		System.out.printf("Edad estudiante3 actualizada: %d", edadEstudiante3).println();

		// creamos un estudiante con un método estático
		Estudiante edtudiante4 = Estudiante.crearEstudiante();

		System.out.println("Info del estudiante4:");
		edtudiante4.mostrarInfo();

	}

}
