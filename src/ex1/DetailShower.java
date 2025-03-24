package ex1;

public class DetailShower {
    static void showEmpDetail(Employee emp) {
        System.out.println("The employee id: " + emp.generateEmpId(emp.firstName));
        System.out.println("This employee is a " +
                emp.checkSeniority(emp.experienceInYears) +
                " employee.");
    }
}
