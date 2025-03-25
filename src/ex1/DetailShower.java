package ex1;

public class DetailShower {
     void showEmpDetail(Employee emp) {
        System.out.println("The employee id: " + emp.getEmpId());
        System.out.println("This employee is a " +
                emp.checkSeniority(emp.experienceInYears) +
                " employee.");
    }
}
