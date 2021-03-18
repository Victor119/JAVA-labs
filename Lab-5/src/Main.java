import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.Buffer;
import java.nio.file.*;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) throws IOException {

        Path songPath = FileSystems.getDefault().getPath("song.txt");
        Path moviePath = FileSystems.getDefault().getPath("movie.txt");
        Path catalog2Path = FileSystems.getDefault().getPath("catalog2.txt");
        Catalog catalog = new Catalog("CatalogA") ;

       /* catalog.setSongNameAndPath("songA",songPath);
        catalog.setSongYear("songA","1999");
        catalog.setSongRating("songA","5Stars");
        catalog.setSongAuthor("songA","Mikel");
*/
        /*catalog.setMovieNameAndPath("movieA",moviePath);
        catalog.setMovieYear("movieA","1989");
        catalog.setMovieRating("movieA","5Stars");
        catalog.setMovieAuthor("movieA","J.K. Rowling");*/

        catalog.addSong("song","songA",songPath,"1999","5Stars","Mikel");
        try  {
            if(catalog.getSongType().equals("song")){
                System.out.println("Valid song");
                    try {
                        Paths.get(String.valueOf(songPath));
                        System.out.println("valid path");
                        try
                        {
                            int t = catalog.getSongYear();
                            System.out.println("valid year");
                        } catch (NumberFormatException ex)
                        {
                            System.out.println("invalid year");
                        }
                    }catch (InvalidPathException ex) {
                        System.out.println("Invalid path");
                    }
            }
        }catch (IllegalArgumentException err){
                System.out.println("Argument invalid");
            }

        catalog.addMovie("movie","movieA",moviePath,"1989","5Stars","J.K. Rowling");
        try  {
            if(catalog.getMovieType().equals("movie")){
                System.out.println("Valid movie");
                try {
                    Paths.get(String.valueOf(moviePath));
                    System.out.println("valid path");
                    try
                    {
                        int t = catalog.getMovieYear();
                        System.out.println("valid year");
                    } catch (NumberFormatException ex)
                    {
                        System.out.println("invalid year");
                    }
                }catch (InvalidPathException ex) {
                    System.out.println("Invalid path");
                }
            }
        }catch (IllegalArgumentException err){
            System.out.println("Argument invalid");
        }
        catalog.list();
        catalog.play("song","In the end",catalog2Path,"2000","5Stars","Linking Park");
        catalog.save();
        catalog.load();

        try (BufferedWriter songFile = Files.newBufferedWriter(songPath);
             BufferedWriter movieFile = Files.newBufferedWriter(moviePath)){
            System.out.println("We can write in songFile and movieFile");
        }catch (IOException e){
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
