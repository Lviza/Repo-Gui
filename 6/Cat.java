
class Cat extends Animal {

    Cat(String name, int runLength, int swimLength) {
        super(name, runLength, swimLength);
    }

    Cat(String name, int runLength) {
        super(name, runLength, 0);
    }

    @Override
    public String swim(int distance) {
        return name + " could not swim ";
    }
}