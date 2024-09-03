public class Ticket {
    // Variables
    String id; // ID (max 4 digits and/or chars)
    String concertHall; // Concert hall (max 10 chars)
    EventCode eventCode; // Event code (enum with fixed values)
    long time; // Unix timestamp
    PromoStatus isPromo; // Promo status (enum with PROMO/NO_PROMO)
    StadiumSector stadiumSector; // Stadium sector (enum from A to C)
    double maxBackpackWeight; // Max allowed backpack weight in kg
    double price; // Ticket price
    long creationTime; // Ticket creation time

    // Full constructor with validations
    public Ticket(String id, String concertHall, EventCode eventCode, long time, PromoStatus isPromo,
                  StadiumSector stadiumSector, double maxBackpackWeight, double price) {
        if (id.length() > 4) throw new IllegalArgumentException("ID cannot exceed 4 characters.");
        if (concertHall.length() > 10) throw new IllegalArgumentException("Concert hall cannot exceed 10 characters.");

        this.id = id;
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.maxBackpackWeight = maxBackpackWeight;
        this.price = price;
        this.creationTime = System.currentTimeMillis() / 1000L; // Creation time
    }

    // Limited constructor with validations
    public Ticket(String concertHall, EventCode eventCode, long time) {
        if (concertHall.length() > 10) throw new IllegalArgumentException("Concert hall cannot exceed 10 characters.");

        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        this.creationTime = System.currentTimeMillis() / 1000L; // Creation time
    }

    // Default constructor
    public Ticket() {
        this.creationTime = System.currentTimeMillis() / 1000L; // Creation time
    }

    // Override toString method to provide a string representation of the Ticket
    @Override
    public String toString() {
        return "Ticket [ID=" + id +
                ", Concert Hall=" + concertHall +
                ", Event Code=" + (eventCode != null ? eventCode.getCode() : "N/A") +
                ", Time=" + time +
                ", Promo Status=" + isPromo +
                ", Stadium Sector=" + stadiumSector +
                ", Max Backpack Weight=" + maxBackpackWeight + "kg" +
                ", Price=" + price +
                ", Creation Time=" + creationTime + "]";
    }
}
