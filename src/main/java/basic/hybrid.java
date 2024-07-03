package basic;
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}


class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

class GoldenRetriever extends Dog {
    void fetch() {
        System.out.println("GoldenRetriever is fetching");
    }
}

public class hybrid {
    public static void main(String[] args) {
        GoldenRetriever gr = new GoldenRetriever();
        gr.eat();
        gr.bark();
        gr.fetch();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}
