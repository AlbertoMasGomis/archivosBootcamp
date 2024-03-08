package archivos;

class Archivo {
    protected String contenido;

    public Archivo(String contenido) {
        this.contenido = contenido;
    }

    public void guardar() {
        System.out.println("Archivo guardado con contenido: " + contenido);
    }
}
