package archivos;

class ArchivoEditable extends Archivo {

    public ArchivoEditable(String contenido) {
        super(contenido);
    }

    public void editar(String nuevoContenido) {
        this.contenido = nuevoContenido;
    }
}
