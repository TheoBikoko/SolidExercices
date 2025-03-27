package ex3;

import java.util.ArrayList;
import java.util.List;

class Client {

    public static void main(String[] args) {
        Printable printer = new AdvancedPrinter();
        Printable printer2 = new BasicPrinter();

        Faxable fax = new LanFax();
        Faxable fax2 = new EFax();

        List<Printable> printers = new ArrayList<>();
        printers.add(printer);
        printers.add(printer2);

        for (Printable device : printers) {
            device.printDocument();

            if (device instanceof AdvancedPrinter) {
                ((AdvancedPrinter) device).sendFax();
            }
        }

        List<Faxable> faxes = new ArrayList<>();
        faxes.add(fax);
        faxes.add(fax2);

        for (Faxable device : faxes) {
            device.faxType();
            if (device instanceof LanFax) {
                ((LanFax) device).sendFax();
            }
            else if(device instanceof EFax) {
                ((EFax) device).sendFax();
            }
        }

    }
}
