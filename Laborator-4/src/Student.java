import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Student {
    private String name;
    private TreeSet<School> preferinte; //scolile la care prefera studentul
    private int capacity;

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public TreeSet<School> getPreferinte(){
        return this.preferinte;
    }
    public int getCapacity(){
        return this.capacity;
    }

    public void setPreferinteSchools(Set<School> preferinte) {
        this.preferinte = new TreeSet<>(preferinte);
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void printPreferinteStudent(){
        ArrayList<School> preferinte2 = new ArrayList<School>(this.preferinte);
        preferinte2.forEach(i -> System.out.println(i.getName()));
    }
}
