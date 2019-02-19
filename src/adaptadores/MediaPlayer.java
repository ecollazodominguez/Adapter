package adaptadores;

/**
 * Esta interfaz simula un reproductor
 * @author ecollazodominguez
 */

//Servirá como principal para un adaptador
public interface MediaPlayer {
    
    /**
     * Reproduce un archivo del que recibe su nombre
     * @param filename nombre del archivo a reproducir
     */
//Este método se usará como principal en el adaptador
    void play(String filename);
    
}
