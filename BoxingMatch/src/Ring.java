public class Ring {
    private Boxer f1;
    private Boxer f2;
    private int minWeight;
    private int maxWeight;

    public Ring(Boxer f1, Boxer f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void start() {
        if (!checkWeight()) {
            System.out.println("The weights of the athletes do not match.");
            return;
        }

        Boxer firstFighter = chooseFirstFighter();

        while (f1.health > 0 && f2.health > 0) {
            System.out.println("****NEW ROUND****");
            f2.health = firstFighter.punch(f2);
            if (winner()) break;
            printScore();

            f1.health = firstFighter == f1 ? f2.punch(f1) : f1.punch(f2);
            if (winner()) break;
            printScore();
        }
        System.out.println("****END OF MATCH****");
    }

    private Boxer chooseFirstFighter() {
        return Math.random() < 0.5 ? f1 : f2;
    }

    private boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) &&
                (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    private boolean winner() {
        if (f1.health <= 0) {
            System.out.println("Winner is: " + f2.name);
            return true;
        } else if (f2.health <= 0) {
            System.out.println("Winner is: " + f1.name);
            return true;
        }
        return false;
    }

    private void printScore() {
        System.out.println();
        System.out.println(f1.name + " Remain health: " + f1.health);
        System.out.println(f2.name + " Remain health: " + f2.health);
        System.out.println();
    }
}
