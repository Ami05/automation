package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	//@Before()
	@Before("@SmokeTest")
	public void beforeEveryScenario(){
		System.out.println("Before every scenario");
	}
	
	@After("@SmokeTest")
	public void afterEveryScenario(){
		System.out.println("After every scenario");
	}

}
