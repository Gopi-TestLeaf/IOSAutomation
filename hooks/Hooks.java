package hooks;


import io.cucumber.java.Before;
import wrappers.WrapperMethods;

public class Hooks extends WrapperMethods{

	@Before
	public void be() {
		launchApp("iOS");
	}
}
