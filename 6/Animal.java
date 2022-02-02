
abstract class Animal implements IAnimal {
    protected String name;
    protected int runLength;
    protected int swimLength;

    Animal(String name, int runLength, int swimLength) {
        this.name = name;
        this.runLength = runLength;
        this.swimLength = swimLength;
    }

    @Override
    public String run(int distance) {
        if (distance > runLength) {
            return name + " did not run " + distance;
        } else {
            return name + " ran well " + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > swimLength) {
            return name + " did not swim " + distance;
        } else {
            return name + " swim well " + distance;
        }
    }

    @Override
    public String toString() {
        return name + ", runLength " + runLength + ", swimLength " + swimLength;
    }
}