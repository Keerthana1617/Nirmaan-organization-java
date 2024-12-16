package Day13;

   public class Dog1 implements IAnimal {

			@Override
			
			public void move()
			{
				System.out.println("The Dog run on four Legs!");
			}
			
			@Override
		 public void speak()
			{
				System.out.println("The Dod say:Woof Woof!");
			}

		 public static void main(String args[]) {
		 Dog1 D=new Dog1();
		 D.move();
		 D.speak();
		 System.out.println(IAnimal.isMammal("Dog"));
		 System.out.println(IAnimal.name);

		}
		}

