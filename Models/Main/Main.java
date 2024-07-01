package Models.Main;
import Models.Music;
import Models.PodCast;
import Models.MyFavorite;

public class Main {
    public static void main(String[] args){

        Music myMusic = new Music();
        myMusic.setTitle("Forever"); 
        myMusic.setArtist("Kiss"); 

        for(int i = 0; i < 1000; i++){
            myMusic.reproduce();
        }

        for(int i = 0; i < 50; i++){
            myMusic.likes();
        }

        PodCast myPodCast = new PodCast();
        myPodCast.setTitle("Developing");
        myPodCast.setHost("Flôr");

        for(int i = 0; i < 5000; i++){
            myPodCast.reproduce();
        }

        for(int i = 0; i < 1000; i++){
            myPodCast.likes();
        }

        MyFavorite favorites = new MyFavorite();
        favorites.includes(myPodCast);
        favorites.includes(myMusic);

    }

}
