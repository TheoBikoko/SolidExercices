package pt12.ex1;

class Client {
 
    public static void main(String[] args) {

        Employee robin = new Employee("Robin", "Smith", 7.5);
        showEmpDetail(robin);

        System.out.println("\n*******\n");

        Employee kevin = new Employee("Kevin", "Proctor", 3.2);
        showEmpDetail(kevin);

    }

    private static void showEmpDetail(Employee emp) {
        emp.displayEmpDetail();
        System.out.println("The employee id: " + emp.generateEmpId(emp.firstName));
        System.out.println("This employee is a " +
                emp.checkSeniority(emp.experienceInYears) +
                " employee.");
    }

}
