package aula2003;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat[] cats = new Cat[2];
		Animal[] animals = cats;
		animals[0] = new Dog();
	}

}
