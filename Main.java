// Parent class
class Wonders7 {
    void display() {
        System.out.println("Displaying information about the Seven Wonders of the World and their locations:");
    }
}

// 7 Subclasses representing the 7 Wonders
class TajMahal extends Wonders7 {
    @Override
    void display() {
        System.out.println("1. Taj Mahal - Location: Agra, India");
    }
}

class GreatWallOfChina extends Wonders7 {
    @Override
    void display() {
        System.out.println("2. Great Wall of China - Location: China");
    }
}

class Petra extends Wonders7 {
    @Override
    void display() {
        System.out.println("3. Petra - Location: Ma'an, Jordan");
    }
}

class Colosseum extends Wonders7 {
    @Override
    void display() {
        System.out.println("4. Colosseum - Location: Rome, Italy");
    }
}

class ChichenItza extends Wonders7 {
    @Override
    void display() {
        System.out.println("5. Chichen Itza - Location: Yucatán, Mexico");
    }
}

class MachuPicchu extends Wonders7 {
    @Override
    void display() {
        System.out.println("6. Machu Picchu - Location: Cuzco Region, Peru");
    }
}

class ChristTheRedeemer extends Wonders7 {
    @Override
    void display() {
        System.out.println("7. Christ the Redeemer - Location: Rio de Janeiro, Brazil");
    }
}

// Main class to demonstrate polymorphism
public class Main {
    public static void main(String[] args) {
        // Creating array of parent type referencing child objects (Polymorphism)
        Wonders7[] wonders = {
            new TajMahal(),
            new GreatWallOfChina(),
            new Petra(),
            new Colosseum(),
            new ChichenItza(),
            new MachuPicchu(),
            new ChristTheRedeemer()
        };

        // Calling display method polymorphically
        for (Wonders7 wonder : wonders) {
            wonder.display();
        }
    }
}
