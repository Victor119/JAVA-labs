import java.nio.file.Path;

public interface Movie {
    public void setMovieNameAndPath(String name,Path path);
    public void setMovieYear(String name,String year);
    public void setMovieRating(String name,String rating);
    public void setMovieAuthor(String name,String author);
}
