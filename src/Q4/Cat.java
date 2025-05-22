package Q4;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomCatImg());
    }

    @Override
    public void feed() {
        // TODO: Implement feeding behavior for Cat
          setHunger(getHunger()-10);
          if (getHunger() < 0) {
            setHunger(0);
          setHappiness(getHappiness()+10);
          if (getHappiness() > 100) {
                setHappiness(100);
          setEnergy(getEnergy()+30);
          if (getEnergy() > 100) {
                setEnergy(100);
          }
                }


            }

    @Override
    public void play() {
        // TODO: Implement playing behavior for Cat
            setHappiness(getHappiness()+30);
            if (getHappiness() > 100) {
                setHappiness(100);
            }
            setHunger(getHunger()+5);
            if (getHunger() > 100) {
                setHunger(100);
            }
            setEnergy(getEnergy()-30);
            if (getEnergy() < 0) {
                setEnergy(0);
            }
        }

    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Cat
    }
}
