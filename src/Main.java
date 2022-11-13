public class Main {
    public static void main(String[] args) {

        Animal[]animals={new Shark("Shark"),new Turtle("Turtle"),new Eagle("Eagle")};
        for (Animal animal : animals) {
            if (animal instanceof Shark animal1){
                System.out.println(animal1);}
            else if (animal instanceof Turtle animal2) {
                System.out.println(animal2);}
            else if (animal instanceof Eagle animal3) {
                System.out.println(animal3);}
        }
        Shark[]sharks=new Shark[1];
        Turtle[]turtles=new Turtle[1];
        Eagle[]eagles=new Eagle[1];

        getClass(animals);
        instanceOf(animals);
    }
    public static void getClass(Animal[]animals){
        for (Animal animal : animals) {
            animal.canDoing();
            if (animal.getClass().equals(Shark.class)){
                System.out.println(((Shark) animal).attack());}
            else if (animal.getClass().equals(Turtle.class)) {
                System.out.println(((Turtle) animal).swim());}
            else if(animal.getClass().equals(Eagle.class)){
                System.out.println(((Eagle) animal).fly());
            }
        }
    }
    public static void instanceOf(Animal[]animals){
        for (Animal animal : animals) {
           if( animal instanceof Shark) {
            System.out.println(((Shark) animal).attack());}
           if (animal instanceof Turtle){
               System.out.println(((Turtle) animal).swim());}
           if (animal instanceof Eagle){
               System.out.println(((Eagle) animal).fly());}
        }
    }
}