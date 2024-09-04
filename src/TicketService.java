public class TicketService {
    private static Ticket[] tickets = new Ticket[10];
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

        tickets[0] = new Ticket("0001", "LargeHall", EventCode.CONCERT_101, 1700000000L, PromoStatus.PROMO, StadiumSector.A, 7.5, 50.0);
        tickets[1] = new Ticket("0002", "SmallHall", EventCode.CONCERT_202, 1700001000L, PromoStatus.NO_PROMO, StadiumSector.B, 7.1, 45.0);
        tickets[2] = new Ticket("0003", "SmallHall", EventCode.CONCERT_202, 1700005000L, PromoStatus.PROMO, StadiumSector.C, 7.4, 54.0);
        tickets[3] = new Ticket("0004", "LargeHall", EventCode.CONCERT_101, 1700008000L, PromoStatus.PROMO, StadiumSector.B, 7.1, 45.0);
        tickets[4] = new Ticket("0005", "SmallHall", EventCode.CONCERT_101, 1700001000L, PromoStatus.NO_PROMO, StadiumSector.B, 7.1, 45.0);
        tickets[5] = new Ticket("0006", "LargeHall", EventCode.CONCERT_202, 1700002000L, PromoStatus.NO_PROMO, StadiumSector.A, 7.5, 40.0);
        tickets[6] = new Ticket("0007", "SmallHall", EventCode.CONCERT_202, 1700005000L, PromoStatus.NO_PROMO, StadiumSector.C, 8.1, 45.0);
        tickets[7] = new Ticket("0008", "SmallHall", EventCode.CONCERT_101, 1700006000L, PromoStatus.PROMO, StadiumSector.B, 7.1, 45.0);
        tickets[8] = new Ticket("0009", "LargeHall", EventCode.CONCERT_202, 1700001000L, PromoStatus.NO_PROMO, StadiumSector.B, 7.1, 45.0);
        tickets[9] = new Ticket("0010", "SmallHall", EventCode.CONCERT_101, 1700009000L, PromoStatus.PROMO, StadiumSector.C, 7.2, 45.0);

    }
}
