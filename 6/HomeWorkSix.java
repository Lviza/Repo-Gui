/**
 * Java.Level 1. Homework #6
 *
 * @author Olga Ovchinnikova
 * @version 02/02/2022
 */

class HomeWorkSix {

    public static void main(String[] args) {
        IAnimal cat = new Cat("Murzik", 200);
        IAnimal dog = new Dog("Polcan", 500, 10);
        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal.run(100));
            System.out.println(animal.run(210));
            System.out.println(animal.run(450));
            System.out.println(animal.swim(8));
            System.out.println(animal.swim(12));
        }
    }
}





