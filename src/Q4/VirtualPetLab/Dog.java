package VirtualPetLab;

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
    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Dog
    }
}
