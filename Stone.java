class Stone {
    int weight;
    String type;
    String color;
    String origin;
    double hardness;
    boolean isPrecious;

    Stone() {
        this("Granite", "Grey");
        System.out.println("Default constructor is invoked");
    }

    Stone(String type, String color) {
        this(50);
        System.out.println("String type and String color constructor invoked");
        this.type = type;
        this.color = color;
    }

    Stone(int weight) {
        this(7.5);
        System.out.println("int weight constructor invoked");
        this.weight = weight;
    }

    Stone(double hardness) {
        this(true);
        System.out.println("double hardness constructor invoked");
        this.hardness = hardness;
    }

    Stone(boolean isPrecious) {
        this("India");
        System.out.println("boolean isPrecious constructor invoked");
        this.isPrecious = isPrecious;
    }

    Stone(String origin) {
        this(1001L);
        System.out.println("String origin constructor invoked");
        this.origin = origin;
    }

    Stone(long id) {
        System.out.println("long id constructor invoked");
    }

    void displayDetails() {
        System.out.println("Weight: " + weight);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Origin: " + origin);
        System.out.println("Hardness: " + hardness);
        System.out.println("Is Precious: " + isPrecious);
    }
}