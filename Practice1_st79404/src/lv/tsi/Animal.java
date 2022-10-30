package lv.tsi;

 interface Animal {
    public void sound();
}

interface Domestic {
    public void printName();
}

interface Wild {
    public void printSize();
}

class Cat implements Animal, Domestic {
    public void printName() {
        System.out.println("Cat's name is Charlie");
    }
    public void sound() {
        System.out.println("Meow");
    }
}

class Dog implements Animal, Domestic {
    public void printName() {
        System.out.println("Dog's name is Willy");
    }
    public void sound() {
        System.out.println("Bark");
    }
}

class Fox implements Animal, Wild {
    public void printSize() {
        System.out.println("Fox's size is Small-Medium");
    }
    public void sound() {
        System.out.println("Wa-pow");
    }
}

class Main {
    public static void main(String[] args) {
        class Animals{}
        Cat catObj = new Cat();
        catObj.printName();
        catObj.sound();
        Dog dogObj = new Dog();
        dogObj.printName();
        dogObj.sound();
        Fox foxObj = new Fox();
        foxObj.printSize();
        foxObj.sound();
    }
}
