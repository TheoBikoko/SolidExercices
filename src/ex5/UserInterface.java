package ex5;

class UserInterface {
EmployeeSaver employeeSaver;

    public UserInterface(EmployeeSaver employeeSaver) {
        this.employeeSaver = employeeSaver;
    }

    public void saveEmployeeId(String empId) {
        employeeSaver.saveEmpIdInDatabase(empId);
    }

}
