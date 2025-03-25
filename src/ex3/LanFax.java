package ex3;

class LanFax implements Faxable, Sendable {
    @Override
    public void faxType() {
        System.out.println("Using lan fax to send the fax.");

    }

    @Override
    public void sendFax() {
        System.out.println("The lan fax is sending the fax.");
    }
}
