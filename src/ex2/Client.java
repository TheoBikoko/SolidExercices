package ex2;

import java.util.ArrayList;
import java.util.List;

class Client {

    public static void main(String[] args) {
        List<Student> enrolledStudents = enrollStudents();

        System.out.println("===Results:===");
        for (Student student : enrolledStudents) {
            System.out.println(student);
        }

        System.out.println("===Distinctions:===");
        DistinctionDecider artDistinctionDecider = new ArtDistinctionDecider();
        DistinctionDecider scienceDistinctionDecider = new ScienceDistinctionDecider();

        for (Student student : enrolledStudents) {
            if (student instanceof ArtStudent){
                artDistinctionDecider.evaluateDistinction(student);
            } else if (student instanceof ScienceStudent) {
                scienceDistinctionDecider.evaluateDistinction(student);
            }
        }
    }

    private static List<Student> enrollStudents() {
        Student sam = new ScienceStudent("Sam", "R1", 81.5, "Chemistry");
        Student bob = new ScienceStudent("Bob", "R2", 82, "Physics");
        Student john = new ArtStudent("John", "R3", 90, "History");
        Student kate = new ArtStudent("Kate", "R4", 86.5, "Poetry");
        Student jason = new ScienceStudent("Jason", "R5", 31.5, "Chemistry");
        Student khabib = new ScienceStudent("Khabib", "R6", 62, "Physics");
        Student sogyo = new ArtStudent("Sogyo", "R7", 80, "History");
        Student zhang = new ArtStudent("Zhang", "R8", 41.5, "Poetry");

        List<Student> students = new ArrayList<>();
        students.add(sam);
        students.add(bob);
        students.add(john);
        students.add(kate);
        students.add(jason);
        students.add(khabib);
        students.add(sogyo);
        students.add(zhang);

        return students;
    }
}



