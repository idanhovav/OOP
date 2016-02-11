public class DrunkLizard extends Reptile{
	public DrunkLizard(int size, String name){
		//Drunk lizards are drunk so they start out at 90 health
		super(size, name);
		this.setHealth(90);
		name = name  + " the lizard, drunkenly";
	}
}