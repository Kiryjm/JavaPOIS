
package Lab3;

import java.util.Scanner;

public class Song {
    
   private String title;
   private float length;

   // Constructors
   
    public Song(String title, float length) 
    {
        this.title = title;
        this.length = length;
    }
    
    public Song() 
    {
        this.title = "unknown artist";
        this.length = 0;
    }

    //getter, setter methods
    
    public String getTitle() 
    {
        return title;
    }

    public float getLength() 
    {
        return length;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public void setLength(float length) 
    {
        this.length = length;
    }

    public void inputData() 
    {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input song title");
        title = scanner.nextLine();
        System.out.println("Input song length");
        length = scanner.nextFloat();
    
    }
    
    public void outputData() 
    {
    
        System.out.println("Song title and length: " + title +", "+ length);
    
    }
    
    public static void sortSongsTitles (Song song1, Song song2) 
    {
        Song[] songs = new Song[2];
        if (song1.getTitle().compareTo(song2.getTitle()) >= 0) {

            songs[0] = song2;
            songs[1] = song1;
            
        } else {

            songs[0] = song1;
            songs[1] = song2;
           
        }
        for (Song song: songs) {
        
            song.outputData();
        
        }
   
    }
    
}


