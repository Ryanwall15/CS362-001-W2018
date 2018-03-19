
package finalprojectB;

import junit.framework.TestCase;

import java.net.URL;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {

   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);


   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   public void testManualTest()
   {
//You can use this function to implement your manual testing
      assertNotNull(urlVal);
      assertTrue(urlVal.isValid("http://www.google.com/")); //Valid URL
      assertTrue(urlVal.isValid("http://www.github.com"));
      //assertTrue(urlVal.isValidAuthority("www.google.com")); //Potential bug

      assertFalse(urlVal.isValid("234piojad;")); //Invalid URL
      //assertFalse(urlVal.isValid("htt://www.github.com"));

	   
   }
   
   
   public void testYourFirstPartition()
   {
	 //You can use this function to implement your First Partition testing

      assertTrue(urlVal.isValidScheme("h3p"));
      assertTrue(urlVal.isValidScheme("htp"));
      assertTrue(urlVal.isValidScheme("https"));
      assertTrue(urlVal.isValidScheme("http"));

      assertFalse(urlVal.isValidScheme("://"));
      assertFalse(urlVal.isValidScheme(":/"));

   }
   
   public void testYourSecondPartition(){
		 //You can use this function to implement your Second Partition testing

    assertFalse(urlVal.isValidAuthority(null));

    //There seems to be a bug with testing the authority
      //Says regualr expression expected but I'm giving it a valid authority
    //assertTrue(urlVal.isValidAuthority("https://www.google.com"));
    //assertFalse(urlVal.isValidAuthority("1.3.4.5"));
      // assertFalse(urlVal.isValidAuthority(""));

      //Path Testing
      assertTrue(urlVal.isValidPath(""));
      assertTrue(urlVal.isValidPath("/file"));
      assertFalse(urlVal.isValidPath(null));
      assertFalse(urlVal.isValidPath("/.."));

      //Query Testing
      assertTrue(urlVal.isValidQuery(""));
      assertTrue(urlVal.isValidQuery("a;lksdfj"));
      assertFalse(urlVal.isValidQuery("a b"));

   }
   //You need to create more test cases for your Partitions if you need to 
   
   public void testIsValid()
   {
	   //You can use this function for programming based testing

   }
   


}
