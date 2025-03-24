package ex2;

public class ArtStudent extends Student{
    public ArtStudent(String name, String regNumber, double score, String department) {
        super(name, regNumber, score);
        this.department = department;
    }
}
