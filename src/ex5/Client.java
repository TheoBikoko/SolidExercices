package ex5;

class Client {

    public static void main(String[] args) {
        EmployeeSaver dbOracle = new OracleDatabase();
        EmployeeSaver dbMySql = new MySqlDatabase();
        UserInterface userInterface = new UserInterface(dbOracle);
        UserInterface userInterface1 = new UserInterface(dbMySql);
        userInterface.saveEmployeeId("E001");
        userInterface1.saveEmployeeId("E001");

    }

}
