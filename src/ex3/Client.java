package pt12.ex3;

// import java.util.ArrayList;
// import java.util.List;


class Client {

    public static void main(String[] args) {
        Printer printer = new AdvancedPrinter();
        printer.printDocument();
        printer.sendFax();

        printer = new BasicPrinter();
        printer.printDocument();
        // printer.sendFax();//Will throw error

        /*
         * List<Printer> printers = new ArrayList<Printer>(); printers.add(new
         * AdvancedPrinter()); printers.add(new BasicPrinter());
         *
         * for (Printer device : printers) { device.printDocument(); //
         * device.sendFax(); // Will throw error } //
         * printers.forEach(Printer::printDocument);//ok
         *
         */

    }

}
