package corregido;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)  {

        ArchivoEditable miArchivoEditable = new ArchivoEditable("Soy un archivo editable");
        System.out.println("Introduce un nuevo texto para editar el archivo: ");
        String nuevoTexto = sc.nextLine();
        miArchivoEditable.editar(nuevoTexto);
        miArchivoEditable.guardar();

        ArchivoSoloLectura miArchivoSoloLectura = new ArchivoSoloLectura("Soy un archivo de solo lectura");
        miArchivoSoloLectura.leer();
    }

    private static Archivo obtenerArchivoDelUsuario() {
        return new ArchivoSoloLectura("Contenido del archivo de solo lectura.");
    }
}