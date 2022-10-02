package test;

import org.testng.annotations.Test;

public class CardTest extends BaseClass
{
	@Test(groups= {"sanity"} , enabled= true,description ="This will run CC class" )
	public void Card()
	{
	
		System.out.println("inside card class");
	}

}
