

public class DotaUnderlords_Champion {

    public static void main(String[] args) {


        BestAllianceCombination(CreateHeroes());

    }

    public static Hero[] CreateHeroes() {



        Hero arcWarden = new Hero();
        arcWarden.name = arcWarden;

        Hero batrider = new Hero();
        batrider.name = batrider;
        batrider.troll = true;
        batrider.knight = true;

        // Indsæt helte ind her.

        Hero legionCommander = new Hero();
        legionCommander.name = legionCommander;
        legionCommander.champion = true;
        legionCommander.human = true;

        Hero Heroes[] = {arcWarden, batrider , };

        return Heroes;

    }



    public static void BestAllianceCombination(Hero[] Heroes) {

        int activeAlliances = 0;
        Hero combination[] = new Hero[9];
        int arrayLength = Heroes.length;


// loop start

        for (int i = 1; i <= arrayLength; i++) {

            int alliances = 0;

            if (alliances > activeAlliances) {
                combination[0] = Heroes[arrayLength - 1];
                /*combination[1] = ;
                combination[2] = ;
                combination[3] = ;
                combination[4] = ;
                combination[5] = ;
                combination[6] = ;
                combination[7] = ;
                combination[8] = ;
                combination[9] = ;*/

            }

        }

// loop slut

        // After the loop it prints the best combination
        PrintHeroCombination(combination);

    }

    public static void PrintHeroCombination(Hero[] combination) {

        for (int i = 0; i <= combination.length; i++) {

            // Prints the name of the different heroes
            System.out.println(combination[i].name);

        }

    }

}

class Hero {

    Hero name;
    Boolean assassin = false;
    Boolean bloodBound = false;
    Boolean brawny = false;
    Boolean brute = false;
    Boolean champion = false;
    Boolean deadeye = false;
    Boolean demon = false;
    Boolean demonHunter = false;
    Boolean dragon = false;
    Boolean druid = false;
    Boolean elusive = false;
    Boolean fallen = false;
    Boolean healer = false;
    Boolean heartless = false;
    Boolean human = false;
    Boolean hunter = false;
    Boolean insect = false;
    Boolean inventor = false;
    Boolean knight = false;
    Boolean mage = false;
    Boolean magus = false;
    Boolean poisoner = false;
    Boolean primordial = false;
    Boolean rouge = false;
    Boolean savage = false;
    Boolean scaled = false;
    Boolean scrappy = false;
    Boolean shaman = false;
    Boolean spirit = false;
    Boolean summoner = false;
    Boolean swordsman = false;
    Boolean troll = false;
    Boolean vigilant = false;
    Boolean woid = false;
    Boolean warlocks = false;
    Boolean warrior = false;

}