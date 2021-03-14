import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class School implements Comparable<School>{
    private String name;
    private List<Student> preferinte; //studentii pe care scoala ii prefera
    private int capacity;

    public School(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public int getCapacity(){
        return this.capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void setPreferinteStudents(List<Student> preferinte){
        this.preferinte = new ArrayList<>(preferinte);
    }

    public void printPreferinteSchool(){
        this.preferinte.forEach(System.out::println);
    }
    @Override
    public int compareTo(School anotherSchool){ //intoarce 1 daca scoala curenta are capacitate mai mare decat cea straina
        if(this.capacity > anotherSchool.getCapacity()){
            return 1;
        }
        else if ( this.capacity == anotherSchool.getCapacity()){
            return 0;
        }
        else {
            return -1;
        }
    }
}
