package maps;
import collections.Student;
import java.util.HashMap;

public class StudentCreation {


    // Method to retrieve a Student object by first name from the HashMap
    public static Student getStudentByName(HashMap<String, Student> studentMap, String firstName) {
        return studentMap.get(firstName);
    }
}