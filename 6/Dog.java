
class Dog extends Animal {
    Dog(String name, int runLength, int swimLength) {
        super(name, runLength, swimLength);
    }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}