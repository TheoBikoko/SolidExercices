package ex1;

//import static ex1.DetailShower.showEmpDetail;

class Client {
 
    public static void main(String[] args) {
        Employee robin = new Employee("Robin", "Smith", 7.5);
        Displayer displayer = new Displayer();
        Generator generator = new Generator();
        SeniorityChecker seniorityChecker = new SeniorityChecker();
        DetailShower detailShower = new DetailShower();
        detailShower.showEmpDetail(robin);

        System.out.println("\n*******\n");

        Employee kevin = new Employee("Kevin", "Proctor", 3.2);
        showEmpDetail(kevin);

    }

}
