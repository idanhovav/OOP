public class Reptile implements Animal{
	private int age;
	private int size;
	private int health;
	private String name;
	private boolean isAlive;

	public Reptile(int size, String name){
		super();
		this.age = 0;
		this.size = size;
		this.health = 100;
		this.name = name;
		isAlive = true;
	}
	public void sleep() {

	}
	public void hunt() {

	}
	public void drink() {

	}
	public void run() {

	}
	public void die(){
		System.out.println(this.getName() + " has died from fights.");
	}
	private boolean isAlive(){
		return (this.getHealth() > 0);
	}
	public void fight(Animal other) {
		int cmp = compareTo(other);
		if(cmp > 0) {
			System.out.println(getName() + " won the fight!");
		}
		else {
			this.setHealth(getHealth()+cmp);
			if(isAlive()){
				this.die();
			}
		}
	}
	public int compareTo(Animal other) {
		return this.getSize() - other.getSize();
	}

	public int getAge() {
		return this.age;
	}	
	public int getSize() {
		return this.size;
	}	
	public int getHealth() {
		return this.health;
	}	
	public String getName() {
		return this.name;
	}	
	public void setAge(int age) {
		this.age = age;		
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void setName(String name) {
		this.name = name;
	}
}