package Models;

public class MyFavorite {

    public void includes(Audio audio){
        if (audio.getClassification() >= 9) {
            System.out.println(audio.getTitle() + " It is considered an absolute success"
            + " preferred by everyone at the moment" );
        }else{
            System.out.println(audio.getTitle() + " It's an excellent option to listen to later");
        }
    }
}