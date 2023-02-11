import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students  = new ArrayList<Student>();
        students.add(new Student("1", "D", 11, "Math", "HA", 9f));
        students.add(new Student("2", "C", 11, "English", "DN", 9f));
        students.add(new Student("3", "A", 11, "Physics", "Hue", 9f));
        students.add(new Student("4", "B", 12, "History", "HA", 9f));
        students.add(new Student("5", "M", 12, "History", "HA", 8f));
        students.add(new Student("6", "N", 12, "Math", "HA", 8f));
    }
}