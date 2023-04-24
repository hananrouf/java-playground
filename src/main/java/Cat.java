public class Cat extends Animal {
    //Constructor
    public Cat(String name, int age) {
        super(name, age);
    }


   /*
   //Setter
   public void setName(String name)
   {
       this.name = name;
   }


   //getter
   public String getName()
   {
       return name;
   }


    */


    @Override
    public void play()
    {
        System.out.println("CAT " + name + " jumps on the table");
    }
    @Override
    public void play(Toy toy)
    {
        System.out.println("CAT " + name + " is playing with the " + toy);
    }
}

