import static org.junit.Assert.*;
import org.junit.Test;

public class TestAll{

	@Test
	public void testTest(){
		Animal a = new DrunkLizard(3, "Jeff");
		Mammal m = new Mammal();
		a.fight(m);
		
	}

	public static void main(String[] args){
		jh61b.junit.TestRunner.runTests("all", TestAll.class);
	}
}