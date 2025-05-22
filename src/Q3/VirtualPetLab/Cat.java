package Q3.VirtualPetLab;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomCatImg());
    }

    @Override
    public void feed() {
        setHunger(getHunger()+20);
        if (getHunger()<=0);
        {
            System.out.println("Hungry");
        }
        setEnergy(getEnergy()+10);
        if(getEnergy()<=10){
            System.out.println("Tired");
        }
        setHappiness(getHappiness()+5);
        if(getHappiness()<=5){
            System.out.println("sad boi");
        }
    }

    @Override
    public void play() {
        // TODO: Implement playing behavior for Cat
        setHappiness(getHappiness()+30);
        if(getHappiness()<=20){
            System.out.println("Sad boi");
        }
        setHunger(getHunger()-30);
        if(getHunger()<=0){
            System.out.println("YOU KILLED IT!!!");
        }
        setEnergy(getEnergy()-20);
        if(getEnergy()<=20){
            System.out.println("Too Hungry");
        }


    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Cat
        setEnergy(getEnergy()+50);
        if(getEnergy()>=100){
            System.out.println("well rested");
        }
        setHappiness(getHappiness()+5);
        if(getHappiness()>=100){
            System.out.println("Happy boi");
        }
        setHunger(getHunger()-10);
        if(getHunger()<=0){
            System.out.println("IT'S DEAD!!!");
        }
    }
}
