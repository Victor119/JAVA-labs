import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //List<Student> list = new LinkedList<>();
        //Set<School> schoolSet = new TreeSet<>();

       /* School school0 = new School("School0");
        School school1 = new School("School1");
        School school2 = new School("School2");*/

        Set<String> studentsNames5 = new HashSet<>(List.of("Student0", "Student1", "Student3"));
        Set<Student> list5 = studentsNames5.stream().map(Student::new).collect(Collectors.toSet());

        Set<String> studentsNames4 = new HashSet<>(List.of("Student0", "Student2", "Student1"));
        Set<Student> list4 = studentsNames4.stream().map(Student::new).collect(Collectors.toSet());

        Set<String> studentsNames3 = new HashSet<>(List.of("Student3", "Student0", "Student1", "Student2"));
        Set<Student> list3 = studentsNames3.stream().map(Student::new).collect(Collectors.toSet());

        List<String> studentsNames2 = new ArrayList<>(List.of("Student0", "Student1", "Student3"));
        List<Student> list2 = studentsNames2.stream().map(Student::new).collect(Collectors.toList());

        List<String> studentsNames1 = new ArrayList<>(List.of("Student0", "Student2", "Student1"));
        List<Student> list1 = studentsNames1.stream().map(Student::new).collect(Collectors.toList());

        List<String> studentsNames0 = new ArrayList<>(List.of("Student3", "Student0", "Student1", "Student2"));
        List<Student> list0 = studentsNames0.stream().map(Student::new).collect(Collectors.toList());

        List<String> schoolNames0 = new ArrayList<>(List.of("School0", "School1", "School2"));
        Set<School> schoolSet0 = schoolNames0.stream().map(School::new).collect(Collectors.toSet());

        List<String> schoolNames1 = new ArrayList<>(List.of("School0", "School1", "School2"));
        Set<School> schoolSet1 = schoolNames1.stream().map(School::new).collect(Collectors.toSet());

        List<String> schoolNames2 = new ArrayList<>(List.of("School0", "School1"));
        Set<School> schoolSet2 = schoolNames2.stream().map(School::new).collect(Collectors.toSet());

        List<String> schoolNames3 = new ArrayList<>(List.of("School0", "School2"));
        Set<School> schoolSet3 = schoolNames3.stream().map(School::new).collect(Collectors.toSet());

        List<String> schoolNames4 = new ArrayList<>(List.of("School0", "School1", "School2"));
        Set<School> schoolSet4 = schoolNames4.stream().map(School::new).collect(Collectors.toSet());

        List<String> schoolNames5 = new ArrayList<>(List.of("School0", "School1"));
        Set<School> schoolSet5 = schoolNames5.stream().map(School::new).collect(Collectors.toSet());

        List<String> schoolNames6 = new ArrayList<>(List.of("School0", "School2"));
        Set<School> schoolSet6 = schoolNames6.stream().map(School::new).collect(Collectors.toSet());

        List<String> schoolNames7 = new ArrayList<>(List.of("School0", "School1", "School2"));
        Set<School> schoolSet7 = schoolNames7.stream().map(School::new).collect(Collectors.toSet());

        Map<Student, Set<School>> studentMap = new HashMap<>();
        Map<School, Set<Student>> schoolMap = new HashMap<>();

       /* Student student0 = new Student("Student0");
        Student student1 = new Student("Student1");
        Student student2 = new Student("Student2");
        Student student3 = new Student("Student3");*/

        //adaugam in list1 preferintele de studenti pentru school 0
  /*      List<Student> list0 = new ArrayList<>();

        list0.add(student3);
        list0.add(student0);
        list0.add(student1);
        list0.add(student2);*/
        //adaugam in schoolSet1 preferintele de scoli pentru student0
        /*Set<School> schoolSet0= new TreeSet<>();
        schoolSet0.add(school0);
        schoolSet0.add(school1);
        schoolSet0.add(school2);*/

        //Lista schools pentru studentMap
        /*List<School> schoolSet7 = new ArrayList<>();
        schoolSet7.add(school0);
        schoolSet7.add(school1);
        schoolSet7.add(school2);*/

        //Set studenti pentru schoolMap
       /* Set<Student> list3 = new HashSet<>();
        list3.add(student3);
        list3.add(student0);
        list3.add(student1);
        list3.add(student2);*/

        //school0.setPreferinteStudents(list0);
        //student0.setPreferinteSchools(schoolSet0);

        //adaugam in list preferintele de studenti pentru school1
        /*List<Student> list1 = new ArrayList<>();
        list1.add(student0);
        list1.add(student2);
        list1.add(student1);*/
        //adaugam in schoolSet preferintele de scoli pentru student1
        /*Set<School> schoolSet1 = new TreeSet<>();
        schoolSet1.add(school0);
        schoolSet1.add(school1);
        schoolSet1.add(school2);*/
        //Lista schools pentru studentMap
        /*List<School> schoolSet4 = new ArrayList<>();
        schoolSet4.add(school0);
        schoolSet4.add(school1);
        schoolSet4.add(school2);*/

        //Set studenti pentru schoolMap
       /* Set<Student> list4 = new HashSet<>();
        list4.add(student0);
        list4.add(student2);
        list4.add(student1);*/

        //school1.setPreferinteStudents(list1);
        //student1.setPreferinteSchools(schoolSet1);

        //adaugam in list preferintele de studenti pentru school2
        /*List<Student> list2 = new ArrayList<>();
        list2.add(student0);
        list2.add(student1);
        list2.add(student3);*/
        //adaugam in schoolSet preferintele de scoli pentru student2
        /*Set<School> schoolSet2 = new TreeSet<>();
        schoolSet2.add(school0);
        schoolSet2.add(school1);
*/
        //Lista schools pentru studentMap
        /*List<School> schoolSet5 = new ArrayList<>();
        schoolSet5.add(school0);
        schoolSet5.add(school1);*/


        //Set studenti pentru schoolMap
       /* Set<Student> list5 = new HashSet<>();
        list5.add(student0);
        list5.add(student1);
        list5.add(student3);*/

        //school2.setPreferinteStudents(list2);
        //student2.setPreferinteSchools(schoolSet2);

        //adaugam in schoolSet preferintele de scoli pentru student3
        /*Set<School> schoolSet3 = new TreeSet<>();
        schoolSet3.add(school0);
        schoolSet3.add(school2);*/
        //student3.setPreferinteSchools(schoolSet3);

        //Lista schools pentru studentMap
  /*      List<School> schoolSet6 = new ArrayList<>();
        schoolSet6.add(school0);
        schoolSet6.add(school2);*/

        List<String> studentsNames = new ArrayList<>(List.of( "Student0", "Student1", "Student2", "Student3"));
        List<Student> list = studentsNames.stream().map(Student::new).collect(Collectors.toList());

        /*list.add(student0);
        list.add(student1);
        list.add(student2);
        list.add(student3);*/
        List<Student> sortedList = list.stream().sorted(Comparator.comparing(Student::getCapacity)).collect(Collectors.toList());
        /*schoolSet.add(school0);
        schoolSet.add(school1);
        schoolSet.add(school2);*/
        List<String> schoolName = new ArrayList<>(List.of("School0", "School1", "School2"));
        Set<School> schoolSet = schoolName.stream().map(School::new).collect(Collectors.toSet());





        List<String> schoolNamee = new ArrayList<>(List.of("School0", "School1", "School2"));
        List<School> schoolSett = schoolNamee.stream().map(School::new).collect(Collectors.toList());
        List<School> schools = schoolSett;
        List<Set<Student>> students = List.of(list3, list4, list5);
        IntStream.range(0, schools.size()).forEach(pos -> schoolMap.put(schools.get(pos), students.get(pos)));

        /*schoolMap.put(school0, list3);
        schoolMap.put(school1, list4);
        schoolMap.put(school2, list5);*/
        for (Map.Entry<School, Set<Student>> i : schoolMap.entrySet()) {
            System.out.print(i.getKey().getName() + " : ( ");
            for(Student j : i.getValue()){
                System.out.print(j.getName() + " ");
            }
            System.out.println(")");
        }

        /*List<Set<School>> schools = List.of(schoolSet6, schoolSet7, schoolSet4, schoolSet5);
        IntStream.range(0, list0.size()).forEach(pos -> studentMap.put(list0.get(pos), schools.get(pos)));*/

        //a 2-a implementare
        Student student0 = new Student("Student0");
        Student student1 = new Student("Student1");
        Student student2 = new Student("Student2");
        Student student3 = new Student("Student3");

        studentMap.put(student0, schoolSet7);
        studentMap.put(student1, schoolSet4);
        studentMap.put(student2, schoolSet5);
        studentMap.put(student3, schoolSet6);
        for (Map.Entry<Student, Set<School>> i : studentMap.entrySet()) {
            System.out.print(i.getKey().getName() + " : ( ");
            for(School j : i.getValue()){
                System.out.print(j.getName() + " ");
            }
            System.out.println(")");
        }
    }
}
