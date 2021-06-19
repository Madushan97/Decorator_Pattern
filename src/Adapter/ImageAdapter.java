package Adapter;

public class ImageAdapter implements MoviePlayer{

    ImagePlayer imagePlayer = new ImagePlayer();

    @Override
    public void play() {
        imagePlayer.show();

    }
}
