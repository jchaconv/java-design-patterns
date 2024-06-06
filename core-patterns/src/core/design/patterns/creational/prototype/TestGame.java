package core.design.patterns.creational.prototype;

public class TestGame {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setName("Dota2");
		game1.setMembership(new Membership());
		
		//It's possible to create an instance of an object from another object that is created yet
		Game game2 = game1.clone();
		
		System.out.println(game1);
		System.out.println(game2);
		
		//Shows another memory reference for Membership object
		Game game3 = new Game(game1);
		System.out.println(game3);
		

	}

}
