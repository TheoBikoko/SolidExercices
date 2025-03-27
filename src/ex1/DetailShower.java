package ex1;
import static ex1.SeniorityChecker.checkSeniority;
import static ex1.Generator.generateEmpId;


class DetailShower {
      void showEmpDetail(Employee emp) {
        System.out.println("The employee id: " + generateEmpId(emp.getFirstName()));
        System.out.println("This employee is a " +
                checkSeniority(emp.getExperienceInYears()) +
                " employee.");
    }
}
