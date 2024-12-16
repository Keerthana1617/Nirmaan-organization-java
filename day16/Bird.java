package Day13;

public class Bird implements IAnimal {

			@Override
			
			public void move()
			{
				System.out.println("The bird fly in a sky");
			}
			
			@Override
		 public void speak()
			{
				System.out.println("The bird says: Chip hip!");
			}

		 public static void main(String args[]) {
		 Bird b=new Bird();
		 b.move();
		 b.speak();
		 System.out.println(IAnimal.isMammal("Bird"));
		 System.out.println(IAnimal.name);

		}
		}



