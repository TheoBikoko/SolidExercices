package ex5;

class Client {

    public static void main(String[] args) {
        EmployeeSaver db = new OracleDatabase();
        UserInterface userInterface = new UserInterface(db);
        userInterface.saveEmployeeId("E001");

    }

}
