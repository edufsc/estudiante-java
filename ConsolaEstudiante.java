import java.util.Scanner;

public class ConsolaEstudiante {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Estudiante estudiante = null;
		int menuSeleccionado = -1;

		do {
			System.out.println("1. Crear estudiante");
			System.out.println("2. Ver estudiante");
			System.out.println("3. Agregar nota");
			System.out.println("4. Reiniciar notas");
			System.out.println("5. Mostrar notas");
			System.out.println("0. Salir\n");
			System.out.print("Opción: ");
			menuSeleccionado = keyboard.nextInt();

			switch (menuSeleccionado) {
			case 0:
				System.out.println("Saliendo...");
				break;
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
			case 2:
				if (estudiante != null) {
					System.out.println("Info del estudiante:");
					estudiante.mostrarInfo();
				} else {
					System.out.println("Todavía no hay estudiantes");
				}
				break;
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
			case 4:
				System.out.println("Reiniciar notas");
				if (estudiante != null) {
					estudiante.reiniciarNotas();
					System.out.println("Notas del estudiante reiniciadas...");
				} else {
					System.out.println("Todavía no hay estudiantes");
				}
				break;
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
