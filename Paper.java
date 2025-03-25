class Paper {
    int id;
    String paperName;
    String type;
    String emailId;
    String origin;
    String thickness;

    Paper() {
        this(101);
        System.out.println("No argument constructor");
    }

    Paper(int id) {
        this("A4", "Printing", "India", "0.1mm");
        this.id = id;
        System.out.println("One argument constructor that is id");
    }

    Paper(String paperName, String type, String origin, String thickness) {
        this("paper@stationery.com");
        this.paperName = paperName;
        this.type = type;
        this.origin = origin;
        this.thickness = thickness;
        System.out.println("Four argument constructor that is paper name, type, origin, and thickness");
    }

    Paper(String emailId) {
        this.emailId = emailId;
        System.out.println("One argument constructor that is emailId");
    }

    public void display() {
        System.out.println("***************************************");
        System.out.println("Paper ID: " + this.id);
        System.out.println("Paper Name: " + this.paperName);
        System.out.println("Type: " + this.type);
        System.out.println("Email ID: " + this.emailId);
        System.out.println("Origin: " + this.origin);
        System.out.println("Thickness: " + this.thickness);
        System.out.println("\n ***********************************");
    }
}
