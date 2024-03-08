package corregido;

class ArchivoEditable extends Archivo {

    public ArchivoEditable(String contenido) {
        super(contenido);
    }

    public void editar(String nuevoContenido) {
        this.contenido = nuevoContenido;
    }

    public void guardar() {
        System.out.println("Archivo guardado");
    }
}
