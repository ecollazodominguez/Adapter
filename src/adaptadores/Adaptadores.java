package adaptadores;

/**
 *
 * @author ecollazodominguez
 */
public class Adaptadores {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // instanciamos un objeto MP3 de tipo MediaPlayer
        MediaPlayer player = new MP3();
        player.play("file.mp3");
        // usando el mismo objeto instanciamos un adaptador para MP4
        player = new FormatAdapter(new MP4());
        player.play("file.mp4");
        // usando el mismo objeto instanciamos un adaptador para VLC
        player = new FormatAdapter(new VLC());
        player.play("file.avi");
    }

    /* Clase adaptador para adaptar MediaPackage a MediaPlayer
    * implementamos la interface principal que usaremos
    */
    private static class FormatAdapter implements MediaPlayer {
        //Instanciamos un objeto de la interface que queremos adaptar.
        private MediaPackage media;
        //Constructor que recibe un objeto tipo MediaPackage para usar
        public FormatAdapter(MediaPackage m) {
            media = m;
        }
        //Override del método play de MediaPlayer
        @Override
        public void play(String filename) {
            System.out.print("Using Adapter --> ");
            //Al tener un objeto Adaptador y contener un objeto de MediaPackage
            //usamos el método de esa interfaz dentro del método
            media.playFile(filename);
        }
    }
}
