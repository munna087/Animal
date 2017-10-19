
public class Mammal extends Animal {
	public void canMove() {
		System.out.println("This is Mammal and they can move");
		Land l = new Land();
		l.canMove();
		Water w = new Water();
		w.canMove();
	}

}