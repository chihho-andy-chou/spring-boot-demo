import junit.framework.TestCase;
import hello;

@RunWith(SpringRunner.class)
public class GreetingTest extends TestCase {

    public GreetingTest(String name) {
            super( name );
    }

    @Test
	public void whenGreeted_thenReturnMessage() {
	    // given
	    Greeting greet = new Greetibng(1, "Hye there");
	 
	    // then
	    assertThat(greet.getContent())
	      .isNotEmpty();
	}
}