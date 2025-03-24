package ex2;

public class Student {
    String name;
    String regNumber;
    String department;
    double score;

    public Student(String name, String regNumber, double score) {
        this.name = name;
        this.regNumber = regNumber;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return ("Name: " + name + "\nReg Number: " + regNumber + "\nDept:" + department + "\nMarks:"
                + score + "\n*******");
    }

}
