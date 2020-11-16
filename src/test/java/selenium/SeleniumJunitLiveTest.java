package selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SeleniumJunitLiveTest {
  private static SeleniumExample seleniumExample;
  private String expectedTitle = "About Baeldung | Baeldung";
  
  @BeforeAll
  public static void setUp() {
      seleniumExample = new SeleniumExample();
  }
 /* @AfterAll
  public static void tearDown() {
     // seleniumExample.closeWindow();
  }*/
  @Test
  public void whenAboutBaeldungIsLoaded_thenAboutEugenIsMentionedOnPage() {
      seleniumExample.getAboutBaeldungPage();
      String actualTitle = seleniumExample.getTitle();
   
      assertNotNull(actualTitle);
      assertEquals(expectedTitle, actualTitle);
      assertTrue(seleniumExample.isAuthorInformationAvailable());
  }
}
