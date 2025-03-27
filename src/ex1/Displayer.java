package ex1;

class Displayer {
    void displayEmpDetail(Employee employee) {
        System.out.println("The employee name: " + employee.getLastName() + "," + employee.getFirstName());
        System.out.println("This employee has " + employee.getExperienceInYears() + " years of experience.");
    }
}
