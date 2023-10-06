package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {

	@Test(priority=1)
	public void test_search2() {
		
		System.out.println("Search Test Passed....");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2)
	public void test_advSearch2() {
		
		System.out.println("Advanced search Test Passed....");
		Assert.assertTrue(true);
	}

}
