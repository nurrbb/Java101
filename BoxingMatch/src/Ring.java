public class Ring {
    Boxer f1;
    Boxer f2;
    int minWeight;
    int maxWeight;

    Ring(Boxer f1, Boxer f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public void start() {
        if (checkWeight()) {
            if (firstFighter() == f1) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("****NEW ROUND****");
                    this.f2.health = f1.punch(this.f2);
                    if (winner()) {
                        break;
                    }
                    this.f1.health = f2.punch(this.f1);
                    if (winner()) {
                        break;
                    }
                    System.out.println(this.f1.name+"Health: "+this.f1.health);
                    System.out.println(this.f2.name+"Health: "+this.f2.health);

                }
            } else {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("****NEW ROUND****");
                    this.f1.health = f2.punch(this.f1);
                    if (winner()) {
                        break;
                    }
                    this.f2.health = f1.punch(this.f2);
                    if (winner()) {
                        break;
                    }
                    System.out.println(this.f1.name+"Health: "+this.f1.health);
                    System.out.println(this.f2.name+"Health: "+this.f2.health);
                }
            }

        } else {
            System.out.println("The weights of the athletes do not match.");
        }
    }

    public Boxer firstFighter() {
        if (Math.random() < 0.5) {
            return f1;
        } else {
            return f2;
        }
    }

    boolean checkWeight() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    public boolean winner() {
        if (f1.health == 0) {
            System.out.println("Winner is: " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Winner is " + f1.name);
        }
        return false;
    }

    public void printScore() {
        System.out.println("***");
        System.out.println(f1.name + "Remain health: " + f1.health);
        System.out.println(f2.name + "Remain health: " + f2.health);
    }
}
