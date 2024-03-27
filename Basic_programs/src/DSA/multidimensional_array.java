package DSA;

import java.util.*;

class Student implements Comparable<Student> {
    int ID;
    String Name;
    double CGPA;

    public Student(int ID, String Name, double CGPA) {
        this.ID = ID;
        this.Name = Name;
        this.CGPA = CGPA;
    }

    @Override
    public int compareTo(Student other) {
        // Sort by CGPA in descending order
        if (this.CGPA != other.CGPA) {
            return Double.compare(other.CGPA, this.CGPA);
        } else if (!this.Name.equals(other.Name)) {
            return this.Name.compareTo(other.Name);
        } else {
            return Integer.compare(this.ID, other.ID);
        }
    }
}

public class multidimensional_array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        List<Student> students = new ArrayList<>();

        // Consume newline character after reading integer
        s.nextLine();

        // Read student information
        for(int i = 0; i < N; i++) {
            int ID = s.nextInt();
            String Name = s.next();
            double CGPA = s.nextDouble();
            students.add(new Student(ID, Name, CGPA));

            // Consume newline character after reading CGPA
            s.nextLine();
        }

        // Sort students based on CGPA (descending order)
        Collections.sort(students);

        // Print first name of each student
        for (Student student : students) {
            System.out.println(student.Name);
        }
    }
}

