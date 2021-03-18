import java.io.*;
import java.nio.file.Path;
import java.io.FileWriter;
import java.io.IOException;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.awt.Desktop;

import static java.awt.Desktop.Action.EDIT;
import static java.awt.Desktop.Action.PRINT;
import static java.awt.geom.Arc2D.OPEN;

public class Catalog implements Serializable,Song,Movie {
    private String name;
    private String songType;
    private int songYear;
    private String movieType;
    private int movieYear;
    private Map<String, Path> songAndPathMap;
    private Map<String, String> songAndYearMap;
    private Map<String, String> songAndRatingMap;
    private Map<String, String> songAndAuthorMap;
    private Map<String, Path> movieAndPathMap;
    private Map<String, String> movieAndYearMap;
    private Map<String, String> movieAndRatingMap;
    private Map<String, String> movieAndAuthorMap;
    private String movieName;
    private Path songPath;
    private Path moviePath;

    public Catalog(String name) {
        this.name = name;
        this.songAndPathMap = new HashMap<>();
        this.songAndYearMap = new HashMap<>();
        this.songAndRatingMap = new HashMap<>();
        this.songAndAuthorMap = new HashMap<>();
        this.movieAndPathMap = new HashMap<>();
        this.movieAndYearMap = new HashMap<>();
        this.movieAndRatingMap = new HashMap<>();
        this.movieAndAuthorMap = new HashMap<>();
    }


    @Override
    public void setSongNameAndPath(String name, Path path) {
        this.songAndPathMap.put(name, path);
        this.songPath = path;
    }

    @Override
    public void setSongYear(String name, String year) {
        this.songAndYearMap.put(name, year);
        this.songYear = Integer.parseInt(year);
    }

    @Override
    public void setSongRating(String name, String rating) {
        this.songAndRatingMap.put(name, rating);
    }

    @Override
    public void setSongAuthor(String name, String author) {
        this.songAndAuthorMap.put(name, author);
    }

    @Override
    public void setMovieNameAndPath(String name, Path path) {
        this.movieAndPathMap.put(name, path);
        this.moviePath = path;
    }

    @Override
    public void setMovieYear(String name, String year) {
        this.movieAndYearMap.put(name, year);
        this.movieYear = Integer.parseInt(year);
    }

    @Override
    public void setMovieRating(String name, String rating) {
        this.movieAndRatingMap.put(name, rating);
    }

    @Override
    public void setMovieAuthor(String name, String author) {
        this.movieAndAuthorMap.put(name, author);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getSongType(){return this.songType;}

    public String getMovieType(){return this.movieType;}

    public Path getSongPath(){return this.songPath;}

    public Path getMoviePath(){return this.moviePath;}

    public int getSongYear(){return this.songYear;}

    public int getMovieYear(){return this.movieYear;}

    public String[] printSong(){
        String[] list = new String[4];
        int k = 0;
        for (Map.Entry<String, Path> i : songAndPathMap.entrySet()) {
            // Create a stream to hold the output
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            // IMPORTANT: Save the old System.out!
            PrintStream old = System.out;
            // Tell Java to use your special stream
            System.setOut(ps);
            // Print some output: goes to your special stream
            System.out.println(i.getKey() + " " + i.getValue());
            System.out.flush();
            System.setOut(old);
            list[k] = baos.toString();
            k = k+1;
        }
        for (Map.Entry<String, String> i : songAndYearMap.entrySet()) {
            // Create a stream to hold the output
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            // IMPORTANT: Save the old System.out!
            PrintStream old = System.out;
            // Tell Java to use your special stream
            System.setOut(ps);
            System.out.println(i.getKey() + " " + i.getValue());
            System.out.flush();
            System.setOut(old);
            list[k] = baos.toString();
            k = k+1;
        }
        for (Map.Entry<String, String> i : songAndRatingMap.entrySet()) {
            // Create a stream to hold the output
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            // IMPORTANT: Save the old System.out!
            PrintStream old = System.out;
            // Tell Java to use your special stream
            System.setOut(ps);
            System.out.println(i.getKey() + " " + i.getValue());
            System.out.flush();
            System.setOut(old);
            list[k] = baos.toString();
            k = k+1;
        }
        for (Map.Entry<String, String> i : songAndAuthorMap.entrySet()) {
            // Create a stream to hold the output
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            // IMPORTANT: Save the old System.out!
            PrintStream old = System.out;
            // Tell Java to use your special stream
            System.setOut(ps);
            System.out.println(i.getKey() + " " + i.getValue());
            System.out.flush();
            System.setOut(old);
            list[k] = baos.toString();
            k = k+1;
        }

        return list;
    }

    public String[] printMovie(){
        String[] list = new String[4];
        int k = 0;
        for (Map.Entry<String, Path> i : movieAndPathMap.entrySet()) {
            // Create a stream to hold the output
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            // IMPORTANT: Save the old System.out!
            PrintStream old = System.out;
            // Tell Java to use your special stream
            System.setOut(ps);
            // Print some output: goes to your special stream
            System.out.println(i.getKey() + " " + i.getValue());
            System.out.flush();
            System.setOut(old);
            list[k] = baos.toString();
            k = k+1;
        }
        for (Map.Entry<String, String> i : movieAndYearMap.entrySet()) {
            // Create a stream to hold the output
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            // IMPORTANT: Save the old System.out!
            PrintStream old = System.out;
            // Tell Java to use your special stream
            System.setOut(ps);
            System.out.println(i.getKey() + " " + i.getValue());
            System.out.flush();
            System.setOut(old);
            list[k] = baos.toString();
            k = k+1;
        }
        for (Map.Entry<String, String> i : movieAndRatingMap.entrySet()) {
            // Create a stream to hold the output
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            // IMPORTANT: Save the old System.out!
            PrintStream old = System.out;
            // Tell Java to use your special stream
            System.setOut(ps);
            System.out.println(i.getKey() + " " + i.getValue());
            System.out.flush();
            System.setOut(old);
            list[k] = baos.toString();
            k = k+1;
        }
        for (Map.Entry<String, String> i : movieAndAuthorMap.entrySet()) {
            // Create a stream to hold the output
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            // IMPORTANT: Save the old System.out!
            PrintStream old = System.out;
            // Tell Java to use your special stream
            System.setOut(ps);
            System.out.println(i.getKey() + " " + i.getValue());
            System.out.flush();
            System.setOut(old);
            list[k] = baos.toString();
            k = k+1;
        }
        return list;
    }

    public String addSong(String songtype,String name,Path path,String year,String rating,String author){
        this.songType = songtype;
        setSongNameAndPath(name, path);
        setSongYear(name, year);
        setSongRating(name, rating);
        setSongAuthor(name, author);
        return songtype;
    }
    public String addMovie(String movietype,String name,Path path,String year,String rating,String author){
        this.movieType = movietype;
        setMovieNameAndPath(name, path);
        setMovieYear(name, year);
        setMovieRating(name, rating);
        setMovieAuthor(name, author);
        return movietype;
    }

    public void list() {
        //printeaza song si path
        for (Map.Entry<String, Path> i : songAndPathMap.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
        for (Map.Entry<String, String> i : songAndYearMap.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
        for (Map.Entry<String, String> i : songAndRatingMap.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
        for (Map.Entry<String, String> i : songAndAuthorMap.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
        for (Map.Entry<String, Path> i : movieAndPathMap.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
        for (Map.Entry<String, String> i : movieAndYearMap.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
        for (Map.Entry<String, String> i : movieAndRatingMap.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
        for (Map.Entry<String, String> i : movieAndAuthorMap.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }

    //Basically, the problem is that Java Desktop integration doesn't work well on Linux...
    public void play(String nameSM, String name, Path path,String year,String rating,String author) throws IOException{
        Catalog catalog2 = new Catalog("catalog2");
        Desktop desktop = Desktop.getDesktop();

        if(nameSM.equals("song")) {
            catalog2.addSong(nameSM,name,path,year,rating,author);
            try{
                //FileWriter myWriter = new FileWriter("/home/vikro31/catalog2.txt");
                FileWriter fileWriter = new FileWriter("/home/vikro31/catalog2.txt");
                PrintWriter printWriter = new PrintWriter(fileWriter);
                for(int i=0; i < catalog2.printSong().length; i++){
                    printWriter.print(catalog2.printSong()[i]);
                }
                printWriter.close();

            }catch (IOException e){
                System.out.println("An error occurred.");
            }
        }
        if(nameSM.equals("movie")){
            catalog2.addMovie(nameSM,name,path,year,rating,author);
            try{
                //FileWriter myWriter = new FileWriter("/home/vikro31/catalog2.txt");
                FileWriter fileWriter = new FileWriter("/home/vikro31/catalog2.txt");
                PrintWriter printWriter = new PrintWriter(fileWriter);
                for(int i=0; i < catalog2.printMovie().length; i++){
                    printWriter.print(catalog2.printMovie()[i]);
                }
                printWriter.close();
                desktop.open(new File("/home/vikro31/catalog2.txt"));
            }catch (IOException e){
                System.out.println("An error occurred.");
            }
        }
    }


    public void save() throws IOException {
        try (FileOutputStream catalogFile = new FileOutputStream("catalog2.txt")) {

            ObjectOutputStream os = new ObjectOutputStream(catalogFile);
            os.writeObject(this.songAndPathMap);
            os.writeObject(this.songAndYearMap);
            os.writeObject(this.songAndRatingMap);
            os.writeObject(this.songAndAuthorMap);
            os.writeObject(this.movieAndPathMap);
            os.writeObject(this.movieAndYearMap);
            os.writeObject(this.movieAndRatingMap);
            os.writeObject(this.movieAndAuthorMap);

            os.close();

        } catch (NotSerializableException e){
            System.out.println("Not serializable");
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } catch (IOException e) {
            System.out.println("Input/Output error");
        }
    }

    public void load() throws IOException{
        Desktop desktop = Desktop.getDesktop();
        desktop.open(new File("/home/vikro31/catalog2.txt"));
    }

}
