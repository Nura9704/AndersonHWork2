public class Ticket {
    // Variables
    String id;
    String concertHall;
    EventCode eventCode;
    long time;
    PromoStatus isPromo;
    StadiumSector stadiumSector;
    double maxBackpackWeight;
    double price;
    long creationTime;

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
        this.creationTime = System.currentTimeMillis() / 1000L;
    }

    public Ticket(String concertHall, EventCode eventCode, long time) {
        if (concertHall.length() > 10) throw new IllegalArgumentException("Concert hall cannot exceed 10 characters.");

        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        this.creationTime = System.currentTimeMillis() / 1000L;
    }

    public Ticket() {
        this.creationTime = System.currentTimeMillis() / 1000L;
    }

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
