public class Animal {
    private String species;
    private String food;
    private int maxWeight;
    private String habitat;
    private boolean isEndangered;
    private String sound;




    //Step 1: Creation of default constructor
    public Animal(){

    }
    //Step 2: Creation of parameterized constructor
    public Animal(String species, int maxWeight, String food, String sound, String habitat, boolean isEndangered){
        this.species = species;
        this.maxWeight = maxWeight;
        this.habitat = habitat;
        this.isEndangered = isEndangered;
        this.food = food;
        this.sound = sound;
    }

    //Setters and Getters
    //Setters
    public void setEndangered(boolean isEndangered){
        this.isEndangered = isEndangered;
    }
    public void setSpecies(String species){
        this.species = species;
    }
    public void setMaxWeight(int maxWeight){
        this.maxWeight = maxWeight;
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    //Getters
    public String getSpecies(){
        return species;
    }
    public int getMaxWeight(){
        return maxWeight;
    }
    public String getHabitat(){
        return habitat;
    }
    public boolean getIsEndangered(){
        return isEndangered;
    }

    public String feedAnimal(){
        return food;
    }

    public String animalSound(){
        return sound;
    }


    //toString() Override method
    public String toString(){
        return species + " " + maxWeight + " " + habitat + " " + isEndangered;
    }



















}


