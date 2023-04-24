public class Main {
    public static void main(String[] args) {
        Cat coco = new Cat("coco", 14);
        Dog max = new Dog("max", 5, "Peng");
        Rabbit rabbit = new Rabbit("Snow ball", 5, "red");
        Toy robot = new Toy("curious George");


        Toy legoCar = new Toy("lego truck");


        Action[] animals = new Action[]{
                coco, max, rabbit, robot
        };


        for(Action friend : animals)
        {
            friend.play(legoCar);
        }
    }
}
