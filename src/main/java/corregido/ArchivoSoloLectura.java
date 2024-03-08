package corregido;

class ArchivoSoloLectura extends Archivo {

    public ArchivoSoloLectura(String contenido) {
        super(contenido);
    }

    public void leer(){
        System.out.println(contenido);
    }
}
