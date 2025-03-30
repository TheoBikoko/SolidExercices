package ex5;

public class MySqlDatabase  implements EmployeeSaver {

    @Override
    public void saveEmpIdInDatabase(String empId) {
        System.out.println("The id: " + empId + " is saved in the MySQL database.");
    }
}
