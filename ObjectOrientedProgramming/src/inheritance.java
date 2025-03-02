public class inheritance {
    public static void main(String[] args) {
//        Fish f1 = new Fish();
//        f1.eat();
        dog dobby=new dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}
class mamals extends Animal{
    int legs;
    void walks(){
        System.out.println("walks");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Flying");
    }
}
class dog extends mamals{
    int dog1;
}