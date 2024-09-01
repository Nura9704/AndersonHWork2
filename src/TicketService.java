public class TicketService {
    public static void main(String[] args) {
        // Creating an empty ticket
        Ticket emptyTicket = new Ticket();

        // Creating a full ticket with all parameters
        Ticket fullTicket = new Ticket("1234", "HallA", 123, 1672531199L, true, 'A', 5.5, 150.00);

        // Creating a limited ticket (concert hall, event code, and time)
        Ticket limitedTicket = new Ticket("HallB", 456, 1672531199L);

        // Output ticket details to verify
        System.out.println("Empty Ticket Creation Time: " + emptyTicket.getCreationTime());
        System.out.println("Full Ticket: " + fullTicket.getConcertHall() + ", Event Code: " + fullTicket.getEventCode() + ", Time: " + fullTicket.getTime() + ", Price: " + fullTicket.getPrice());
        System.out.println("Limited Ticket: " + limitedTicket.getConcertHall() + ", Event Code: " + limitedTicket.getEventCode() + ", Time: " + limitedTicket.getTime());
    }
}
