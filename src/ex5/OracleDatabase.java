package ex5;

public class OracleDatabase implements EmployeeSaver {

    @Override
    public void saveEmpIdInDatabase(String empId) {
        System.out.println("The id: " + empId + " is saved in the Oracle database.");
    }
}
