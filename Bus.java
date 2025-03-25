class Bus {
    int number;
    String route;
    String company;
    int capacity;
    double ticketPrice;
    boolean isAC;
    
    Bus() {
        this("City Express", "Majestic to Whitefield");
    }

    Bus(String company, String route) {
        this(102);
        this.company = company;
        this.route = route;
    }
    
    Bus(int number) {
        this(50, true);
        this.number = number;
    }
    
    Bus(int capacity, boolean isAC) {
        this(30.0);
        this.capacity = capacity;
        this.isAC = isAC;
    }
    
    Bus(double ticketPrice) {
        this("KSRTC");
        this.ticketPrice = ticketPrice;
    }
    
    Bus(String company) {
        this(5001L);
        this.company = company;
    }
    
    Bus(long id) {
        System.out.println("Bus ID: " + id);
    }
    
    void displayDetails() {
        System.out.println("Number: " + number);
        System.out.println("Route: " + route);
        System.out.println("Company: " + company);
        System.out.println("Capacity: " + capacity);
        System.out.println("Fare: " + ticketPrice);
        System.out.println("AC: " + isAC);
    }
}