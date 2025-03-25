class Weapon {
    int id;
    String weaponName;
    String type;
    String emailId;
    String origin;
    String caliber;

    Weapon() {
        this(101);
        System.out.println("No argument constructor");
    }

    Weapon(int id) {
        this("AK-47", "Firearm", "Russia", "7.62mm");
        this.id = id;
        System.out.println("One argument constructor that is id");
    }

    Weapon(String weaponName, String type, String origin, String caliber) {
        this("weapon@arsenal.com");
        this.weaponName = weaponName;
        this.type = type;
        this.origin = origin;
        this.caliber = caliber;
        System.out.println("Four argument constructor that is weapon name, type, origin, and caliber");
    }

    Weapon(String emailId) {
        this.emailId = emailId;
        System.out.println("One argument constructor that is emailId");
    }

    public void display() {
        System.out.println("***************************************");
        System.out.println("Weapon ID: " + this.id);
        System.out.println("Weapon Name: " + this.weaponName);
        System.out.println("Type: " + this.type);
        System.out.println("Email ID: " + this.emailId);
        System.out.println("Origin: " + this.origin);
        System.out.println("Caliber: " + this.caliber);
        System.out.println("\n***********************************");
    }
}
