package ex1;

class Client {
    public static void main(String[] args) {
        Employee robin = new Employee("Robin", "Smith", 7.5);
        Displayer displayer = new Displayer();
        DetailShower detailShower = new DetailShower();

        displayer.displayEmpDetail(robin);
        detailShower.showEmpDetail(robin);
        System.out.println("\n*******\n");

        Employee kevin = new Employee("Kevin", "Proctor", 3.2);
        displayer.displayEmpDetail(kevin);
        detailShower.showEmpDetail(kevin);
    }
}
