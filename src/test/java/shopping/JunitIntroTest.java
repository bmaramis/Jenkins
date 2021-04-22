package shopping;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitIntroTest {

	@Test
	public void learningTestAnnotation () {
		System.out.println("Test1");
	}
	
	@Test
	public void learningTestAnnotation2 () {
		System.out.println("Test2");
	}

	@Test
	public void learningTestAnnotation3 () {
	System.out.println("Test3");	
	}
	@Before
	public void beforeAnnotation () {
	System.out.println("Create connection!!");
	}
	@After
	public  void afterAnnotation () {
		System.out.println("Close connection!!");
		
	}
@BeforeClass
public static void testBeforeclass () {
	System.out.println("-----------------");
	
}
@AfterClass
public static void testAfterClass () {
	System.out.println("---------------------");
}

}
