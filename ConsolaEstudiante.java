import java.util.Scanner;

public class ConsolaEstudiante {

	public static void main(String[] args) {

		// para leer del teclado
		Scanner keyboard = new Scanner(System.in);
		// variable para almacenar nuestro estudiante cuando lo creemos
		// al declararlo como null podemos comprobar que no tiene Estudiante antes de
		// utilizarlo
		Estudiante estudiante = null;

		// inicializamos menuSeleccionado a -1, ya que si no, valdría 0 por defecto
		int menuSeleccionado = -1;

		// do while, porque queremos que el menú se imprima como mínimo una vez, sin
		// importar la condición
		do {
			System.out.println("1. Crear estudiante");
			System.out.println("2. Ver estudiante");
			System.out.println("3. Agregar nota");
			System.out.println("4. Reiniciar notas");
			System.out.println("5. Mostrar notas");
			System.out.println("0. Salir\n");
			// con print en lugar de println hacemos que el cursor se quede en la misma
			// línea cuando pedimos datos por teclado
			System.out.print("Opción: ");
			menuSeleccionado = keyboard.nextInt();

			switch (menuSeleccionado) {
			// sali
			case 0:
				System.out.println("Saliendo...");
				break;
			// crear un nuevo estudiante pidiendo los datos por teclado
			case 1:
				System.out.println("Crear estudiante");
				estudiante = new Estudiante();
				System.out.print("Id del estudiante: ");
				int nuevoId = keyboard.nextInt();
				estudiante.setId(nuevoId);
				System.out.print("Edad del estudiante: ");
				int nuevaEdad = keyboard.nextInt();
				estudiante.setEdad(nuevaEdad);
				System.out.print("Teléfono del estudiante: ");
				String nuevoTelefono = keyboard.next();
				estudiante.setTelefono(nuevoTelefono);
				System.out.println("Estudiante creado con id: " + estudiante.getId());
				break;
			// mostrar info si estudiante es distinto de null
			case 2:
				if (estudiante != null) {
					System.out.println("Info del estudiante:");
					estudiante.mostrarInfo();
				} else {
					System.out.println("Todavía no hay estudiantes");
				}
				break;
			// añadir nota si estudiante es distinto de null
			case 3:
				System.out.print("Añadir nota: ");
				if (estudiante != null) {
					float nuevaNota = keyboard.nextFloat();
					estudiante.agregarNuevaNota(nuevaNota);
					System.out.println("Añadida nota");
				} else {
					System.out.println("Todavía no hay estudiantes");
				}
				break;
			// reiniciar notas si estudiante es distinto de null
			case 4:
				System.out.println("Reiniciar notas");
				if (estudiante != null) {
					estudiante.reiniciarNotas();
					System.out.println("Notas del estudiante reiniciadas...");
				} else {
					System.out.println("Todavía no hay estudiantes");
				}
				break;
			// mostrar lista de notas si estudiante es distinto de null (no estaba en los
			// ejercicios propuestos)
			case 5:
				if (estudiante != null) {
					estudiante.mostrarNotas();
				}
				break;
			default:
				System.out.println("Opción desconocida...");
				break;
			}

		} while (menuSeleccionado != 0);
	}

}
