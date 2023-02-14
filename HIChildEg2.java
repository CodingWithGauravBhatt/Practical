package Class;
class Avenger{
	void Hero() {
		System.out.println("We Are Avengers");
	}
}
class Ironman extends Avenger {
	void Mind() {
		System.out.println("I am Iron Man");
	}
}
class Hulk extends Avenger {
	void Power() {
		System.out.println("I am Hulk");
		}
}
class HulkBuster extends Avenger{
	void Genius() {
		System.out.println("I am Hulk Buster");
	}
}
public class HIChildEg2 {
public static void main(String[] args) {
	Hulk b = new Hulk();
	b.Hero();
	b.Power();
	Ironman c = new Ironman();
	c.Hero();
	c.Mind();
	HulkBuster d = new HulkBuster();
	d.Hero();
	d.Genius();
}
}
