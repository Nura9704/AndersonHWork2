public class TicketService {
    public static void main(String[] args) {
        try {
            // Create an empty ticket
            Ticket emptyTicket = new Ticket();

            // Create a ticket with all parameters
            Ticket fullTicket = new Ticket("1234", "ConcertHall", EventCode.CONCERT_101, 1700000000L,
                    PromoStatus.PROMO, StadiumSector.B, 7.5, 50.0);

            // Create a ticket with limited parameters
            Ticket limitedTicket = new Ticket("SmallHall", EventCode.CONCERT_202, 1700001000L);

            // Print details of the tickets using toString method
            System.out.println("Empty Ticket: " + emptyTicket);
            System.out.println("Full Ticket: " + fullTicket);
            System.out.println("Limited Ticket: " + limitedTicket);
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating ticket: " + e.getMessage());
        }
    }
}
