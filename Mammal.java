public class Mammal implements Animal{
	private int swag;
	public Mammal(){
		swag = 0;
	}
	public int getAge(){
		return 5 + this.swag;
	}
	public void setAge(int age){

	}
	public int getSize(){
		return 10;
	}
	public void setSize(int size){
		this.setSwag(42);
	}
	public void sleep(){

	}
	public void hunt(){

	}
	public void drink(){
		this.setSwag(this.getSwag()+1);
	}
	public void run(){

	}
	public void fight(Animal other){

	}
	public int compareTo(Animal other){
		return 1;
	}
	private int getSwag(){
		return this.swag;
	}
	private void setSwag(int swag) {
		this.swag = swag;
	}
}