package Adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer() ;
        audioPlayer.play("mp3","em cua ngay hom qua.mp3");
        audioPlayer.play("mp4", "con mua ngnag qua.mp4");
        audioPlayer.play("vlc","lactroi.vlc");
    }
}
