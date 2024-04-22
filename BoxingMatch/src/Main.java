
public class Main {
    public static void main(String[] args) {

        Boxer mike = new Boxer("Mike Tyson",16,40,95,50);
        Boxer rocky = new Boxer("Rocky Marciano",10,100,95,20);

        Ring match = new Ring(mike,rocky,90,120);
        match.start();

    }
}