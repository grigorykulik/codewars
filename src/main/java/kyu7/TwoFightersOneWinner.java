package kyu7;

/**
 * Create a function that returns the name of the winner in a fight between two fighters.
 * Each fighter takes turns attacking the other and whoever kills the other first is victorious.
 * Death is defined as having health <= 0.Each fighter will be a Fighter object/instance.
 * See the Fighter class below in your chosen language. Both health and damagePerAttack
 * (damage_per_attack for python) will be integers larger than 0. You can mutate the Fighter objects.
 * Your function also receives a third argument, a string, with the name of the fighter that attacks first.
 */
public class TwoFightersOneWinner {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter first = fighter1.name.equals(firstAttacker) ? fighter1 : fighter2;
        Fighter second = (first == fighter1) ? fighter2 : fighter1;

        while(!(fighter1.health <= 0 || fighter2.health <= 0)) {
            second.health -= first.damagePerAttack;
            System.out.println(first.name + " attacking. " + second.name + " has " + second.health + "health");
            if (second.health < 0) break;

            first.health -= second.damagePerAttack;
            System.out.println(second.name + " attacking. " + first.name + " has " + first.health + "health");
            if (first.health < 0) break;
        }

        return (first.health > second.health) ? first.name : second.name;
    }


    public static class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

    public static void main(String[] args) {
        declareWinner(
                new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4),
                "Lew");
    }
}


