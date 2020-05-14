import org.junit.Test;

import static org.junit.Assert.assertEquals;


class CustomerTest {
    @Test
    public void testRental() {
        Movie m = new Movie("Ready Player One", 10);
        Rental r = new Rental(m, 7);
        Customer c = new Customer("Tim");
        c.addRental(r);
        assertEquals(c.statement(), "Rental Record for Tim\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tReady Player One\t\t7\t0.0\n" +
                "Amount owed is 0.0\n" +
                "You earned 1 frequent renter points");
    }
}