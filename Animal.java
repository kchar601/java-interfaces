public class Animal implements Rideable, Comparable<Animal>{
    private String animalType;
    private int speed;
    private boolean needSaddle;

    Animal(String animalType, int speed, boolean needSaddle)
    {
        this.animalType = animalType;
        this.speed = speed;
        this.needSaddle = needSaddle;
    }

    @Override
    public int getSpeed()
    {
        return this.speed;
    }

    @Override 
    public String getAnimal()
    {
        return animalType;
    }

    @Override 
    public boolean getNeedsSaddle()
    {
        return needSaddle;
    }

    @Override
    public int compareTo(Animal animal)
    {
        int compare = this.animalType.compareToIgnoreCase(animal.animalType);
        return compare;
    }

    @Override
    public String toString()
    {
        return "\n\nAnimal: " + animalType + "\n\tRiding speed: " + speed + " mph\n\tNeeds saddle: " + needSaddle;
    }
}
