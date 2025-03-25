class Metal {
    int id;
    String metalName;
    String category;
    String emailId;
    String origin;
    String purity;

    Metal() {
        this(101);
        System.out.println("No argument constructor");
    }

    Metal(int id) {
        this("Gold", "Precious", "Africa", "99.99%");
        this.id = id;
        System.out.println("One argument constructor that is id");
    }

    Metal(String metalName, String category, String origin, String purity) {
        this("gold@metals.com");
        this.metalName = metalName;
        this.category = category;
        this.origin = origin;
        this.purity = purity;
        System.out.println("Four argument constructor that is metal name, category, origin, and purity");
    }

    Metal(String emailId) {
        this.emailId = emailId;
        System.out.println("One argument constructor that is emailId");
    }

    public void display() {
        System.out.println("***************************************");
        System.out.println("Metal ID: " + this.id);
        System.out.println("Metal Name: " + this.metalName);
        System.out.println("Category: " + this.category);
        System.out.println("Email ID: " + this.emailId);
        System.out.println("Origin: " + this.origin);
        System.out.println("Purity: " + this.purity);
        System.out.println("\n ***********************************");
    }
}