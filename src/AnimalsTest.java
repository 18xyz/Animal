
public class AnimalsTest {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.cry();
		Cat c = new Cat();
		c.marking();
		Lion l = new Lion();
		l.cry();
		l.marking();

		Animals animal = new Dog();
		Animals animal1 = new Cat();
		Animals animal2 = new Lion();

		Animals[] Ani = new Animals[3];
		Ani[0] = animal;
		Ani[1] = animal1;
		Ani[2] = animal2;

		Ani[0].cry();

		System.out.println(d);
		System.out.println(d.toString());
	}
}
