package ex4;

class GuestUserPayment extends Payment {
    String name;

    public GuestUserPayment() {
        this.name = "guest";
    }

    @Override
    public void newPayment() {
        System.out.println("Processing " + name + "'s current payment request.");
    }
}