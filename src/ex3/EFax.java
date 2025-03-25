package ex3;

class EFax implements Faxable, Sendable {
    @Override
    public void faxType() {
        System.out.println("Using internet fax(efax) to send the fax.");
    }

    @Override
    public void sendFax() {
        System.out.println("The electronic fax is sending the fax.");
    }
}
