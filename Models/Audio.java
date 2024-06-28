package Models;

public class Audio{
    private double duration; 
    private String title;
    private int totalReproduction; 
    private int totalLikes; 
    private double classification;
    
    public double getDuration(){
        return duration; 
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title; 
    }
    
    public int getTotalReproduction(){
        return totalReproduction; 
    }

    public int getTotalLikes(){
        return totalLikes; 
    }

    public double getClassification(){
        return classification; 
    }

    public void likes(){
        this.totalLikes++;
    }

    public void reproduce(){
        this.totalReproduction++;
    }
}