public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Cat", 10, "Fish","meows", "House", false);
        Animal bear = new Animal("Bear", 600, "Berry","roars", "Forest", false);
        Animal toucan = new Animal("Toucan", 1, "Froot Loop","says follow your nose", "Jungle", false);

        Animal[] myZoo = new Animal[]{cat, bear, toucan};

        for (int i = 0; i < myZoo.length; i++) {
            if (!myZoo[i].getIsEndangered()) {
                System.out.println("I am a " + myZoo[i].getSpecies() + ", I weigh " + myZoo[i].getMaxWeight() + " lbs, I live in a " +
                        myZoo[i].getHabitat() + ", and I am not endangered.");
            } else {
                System.out.println("I am a " + myZoo[i].getSpecies() + ", I weigh " + myZoo[i].getMaxWeight() + " lbs, I live in a " +
                        myZoo[i].getHabitat() + ", and I am endangered.");
            }

            System.out.println("The "+myZoo[i].getSpecies()+" eats a tasty "+ myZoo[i].feedAnimal() +"!");
            System.out.println("Then, the " +myZoo[i].getSpecies()+" "+myZoo[i].animalSound()+"!");
            System.out.println("");
        }
    }
}