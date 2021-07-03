package testPacakage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTestngClass {
  @Test
  public void test9() {
	  	  System.out.println("I am in test9");
  }
  
  @Test(priority=2)
  public void test2() {
	  System.out.println("I am in test2");
	  int x = 5/0;
	  System.out.println("This step will not execute");
  }
  
  @Test(priority=2)
  public void abcd() {
	  	  System.out.println("I am in test3");
	  	  //Assert.fail("failllllllllllllllllllllllllllllllllllllllllllllll");
  }
  
}
