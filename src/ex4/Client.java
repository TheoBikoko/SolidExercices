package ex4;

class Client {

    public static void main(String[] args) {
        PaymentHelper helper = new PaymentHelper();

        // Instantiating two registered users
        Payment robinPayment = new RegisteredUserPayment("Robin");
        Payment jackPayment = new RegisteredUserPayment("Jack");

        // Adding the users to the helper
        helper.addUser(robinPayment);
        helper.addUser(jackPayment);

        Payment guestUser = new GuestUserPayment();
        helper.addUser(guestUser);

        // Processing the payments using 
        // the helper class.
        // You can see the problem now.
        helper.showPreviousPayments();
        helper.processNewPayments();

    }

}
