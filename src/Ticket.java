import java.time.Instant;

public class Ticket {
        private String id;
        private String concertHall;
        private int eventCode;
        private long time;
        private boolean isPromo;
        private char stadiumSector;
        private double maxBackpackWeight;
        private double price;
        private final long creationTime;

        public Ticket(String id, String concertHall, int eventCode, long time, boolean isPromo, char stadiumSector, double maxBackpackWeight, double price) {
            this.id = id;
            this.concertHall = concertHall;
            this.eventCode = eventCode;
            this.time = time;
            this.isPromo = isPromo;
            this.stadiumSector = stadiumSector;
            this.maxBackpackWeight = maxBackpackWeight;
            this.price = price;
            this.creationTime = Instant.now().getEpochSecond();  // Automatically detect and save creation time
        }


        public Ticket(String concertHall, int eventCode, long time) {
            this.concertHall = concertHall;
            this.eventCode = eventCode;
            this.time = time;
            this.creationTime = Instant.now().getEpochSecond();  // Automatically detect and save creation time
        }

        public Ticket() {
            this.creationTime = Instant.now().getEpochSecond();  // Automatically detect and save creation time
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getConcertHall() {
            return concertHall;
        }

        public void setConcertHall(String concertHall) {
            this.concertHall = concertHall;
        }

        public int getEventCode() {
            return eventCode;
        }

        public void setEventCode(int eventCode) {
            this.eventCode = eventCode;
        }

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public boolean isPromo() {
            return isPromo;
        }

        public void setPromo(boolean promo) {
            isPromo = promo;
        }

        public char getStadiumSector() {
            return stadiumSector;
        }

        public void setStadiumSector(char stadiumSector) {
            this.stadiumSector = stadiumSector;
        }

        public double getMaxBackpackWeight() {
            return maxBackpackWeight;
        }

        public void setMaxBackpackWeight(double maxBackpackWeight) {
            this.maxBackpackWeight = maxBackpackWeight;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public long getCreationTime() {
            return creationTime;
        }

    }

}
