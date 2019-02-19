package adaptadores;

/**
 * Esta interfaz simula un reproductor
 * @author ecollazodominguez
 */
//Esta será la interfaz que se adaptará.
public interface MediaPackage {

    /**
     * Reproduce un archivo del que recibe su nombre
     * @param filename nombre del archivo a reproducir
     */
//Este método se usará para la adaptación.   
    void playFile(String filename);
}
