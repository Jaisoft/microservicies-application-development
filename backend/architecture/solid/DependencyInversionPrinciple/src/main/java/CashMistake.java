public class CashMistake {

    public void pay(Product product, PaymentType paymentType) {

        DatabaseMistake persistence = new DatabaseMistake();
        persistence.save(product, paymentType);

    }

}