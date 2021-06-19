package Adapter;

public class Main {
    public static void main(String[] args) {
        // to create a movie player
        //mp4, mp3
        MoviePlayer moviePlayer = new ImageAdapter();
        moviePlayer.play();
    }
}
