interface Playable {
    void play();
}

class Veena implements Playable {
    public void play() {
        System.out.println("Playing Veena");
    }
}

class Saxophone implements Playable {
    public void play() {
        System.out.println("Playing Saxophone");
    }
}

public class Test {
    public static void main(String[] args) {

        // Create Veena object and call play()
        Veena veena = new Veena();
        veena.play();

        // Create Saxophone object and call play()
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // Using interface reference
        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}