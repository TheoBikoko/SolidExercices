package ex1;

public class Displayer {
    public void displayEmpDetail(Employee employee) {
        System.out.println("The employee name: " + employee.getLastName() + "," + employee.getFirstName());
        System.out.println("This employee has " + employee.getExperienceInYears() + " years of experience.");
    }
}
