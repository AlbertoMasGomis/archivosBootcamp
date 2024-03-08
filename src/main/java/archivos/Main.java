package archivos;

public class Main {
    public static void main(String[] args)  {
        Archivo miArchivo = obtenerArchivoDelUsuario();
        miArchivo.guardar();
    }

    private static Archivo obtenerArchivoDelUsuario() {
        return new ArchivoSoloLectura("Contenido del archivo de solo lectura.");
    }
}