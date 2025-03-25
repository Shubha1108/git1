class Metro {
    int id;
    String passengerName;
    String ticketType;
    String emailId;
    String station;
    String destination;

    Metro() {
        this(101);
        System.out.println("No argument constructor");
    }

    Metro(int id) {
        this("Rahul", "Monthly Pass", "Central Station", "Downtown");
        this.id = id;
        System.out.println("One argument constructor that is id");
    }

    Metro(String passengerName, String ticketType, String station, String destination) {
        this("rahul123@gmail.com");
        this.passengerName = passengerName;
        this.ticketType = ticketType;
        this.station = station;
        this.destination = destination;
        System.out.println("Four argument constructor that is passenger name, ticket type, station, and destination");
    }

    Metro(String emailId) {
        this.emailId = emailId;
        System.out.println("One argument constructor that is emailId");
    }

    public void display() {
        System.out.println("***************************************");
        System.out.println("Passenger ID: " + this.id);
        System.out.println("Passenger Name: " + this.passengerName);
        System.out.println("Ticket Type: " + this.ticketType);
        System.out.println("Email ID: " + this.emailId);
        System.out.println("Station: " + this.station);
        System.out.println("Destination: " + this.destination);
        System.out.println("\n ***********************************");
    }
}
