package Q3.VirtualPetLab;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomDogImg());
    }

    @Override
    public void feed() {
        // TODO: Implement feeding behavior for Dog
        setHunger(getHunger()+20);
        if (getHunger() >=100){
            System.out.println("Dog Stuffed!! ૮₍ ˃ ⤙ ˂ ₎ა");
        }
        setHappiness(getHappiness()+5);
        if (getHappiness()>=100){
            System.out.println("Dog is supper happy!! ໒( ̿❍ ᴥ ̿❍)ʋ");
        }
        setEnergy(getEnergy()+20);
        if (getEnergy()>=100){
            System.out.println("Dog: *weeeeee!!!*   ( ˶ˆᗜˆ˵ ) ");
        }
    }

    @Override
    public void play() {
        // TODO: Implement playing behavior for Dog
        setHappiness(getHappiness()+30);
        if(getHappiness()<20){
            System.out.println("Dogo Espresso Depresso  (˃̣̣̥ᯅ˂̣̣̥) .·°");
        }
        setHunger(getHunger()-5);
        if(getHunger()<=0){
            System.out.println("Dog has Died!! ૮(˶ㅠ︿ㅠ)ა");
        }
        setEnergy(getEnergy()-15);
        if (getEnergy()<= 0){
            System.out.println("Dog tired ᶻz(-‸ -。)");
        }
    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Dog
        setEnergy(getEnergy()+100);
        if (getEnergy() > 100){
            setEnergy(100);
        }
        setHunger(getHunger()-5);
        if(getHunger()<=0){
            System.out.println("Dog has Died!! ૮(˶ㅠ︿ㅠ)ა");
        }
        setHappiness(getHappiness()+20);
        if(getHappiness()<20){
            System.out.println("Dogo Espresso Depresso  (˃̣̣̥ᯅ˂̣̣̥) .·°");
        }

    }
}
