class Animal {

     void sound() {
        System.out.println("Animal makes a sound");
    }
}

class dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats meat");
    }
}

public class cow extends Animal {

    @Override
    public void sound() {
        System.out.println("Cow moos");
    }

    public void eat() {
        System.out.println("Cow eats grass");
    }

    public static void main(String[] args) {

        dog myDog = new dog();
        cow myCow = new cow();

        myDog.sound();
        myDog.eat();

        myCow.sound();
        myCow.eat();
    }
}
 
