import java.nio.file.Path;

public interface Song {
    public void setSongNameAndPath(String name, Path path);
    public void setSongYear(String name,String year);
    public void setSongRating(String name,String rating);
    public void setSongAuthor(String name,String author);

}
