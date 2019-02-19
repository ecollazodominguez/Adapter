package adaptadores;
/**
 * Clase que implementa de MediaPackage, reproduce archivos MP4
 * @author ecollazodominguez
 */
public class MP4 implements MediaPackage {

    @Override
    public void playFile(String filename) {
        System.out.println("Playing MP4 File " + filename);
    }
    
}
