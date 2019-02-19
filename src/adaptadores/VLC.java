package adaptadores;

/**
 * Clase que implementa de MediaPackage, reproduce archivos VLC
 * @author ecollazodominguez
 */
public class VLC implements MediaPackage{

    @Override
    public void playFile(String filename) {
        System.out.println("Playing VLC File " + filename);
    }
    
}
