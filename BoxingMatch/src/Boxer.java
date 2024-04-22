public class Boxer {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Boxer(String name, int damage, int health, int weight,double dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
    }

    int punch (Boxer foe){
        System.out.println(this.name+" => "+foe.name+" -"+this.damage+" damage");
        if(foe.isDodge()){
            System.out.println(foe.name+" dodged the damage!");
            return foe.health;
        }
        if(foe.health-this.damage<0){
            return 0;
        }
        return  foe.health-this.damage;
    }
    boolean isDodge(){
        double randomNumber = Math.random()*100;
        return randomNumber <= this.dodge;
    }

}
