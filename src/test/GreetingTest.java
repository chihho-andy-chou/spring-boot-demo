import hello.Greeting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
public class GreetingTest {

    @Test
	public void whenGreeted_thenReturnMessage() {
	    // given
	    Greeting greet = new Greeting(1, "Hye there");
	 
	    // then
	    assertThat(greet.getContent())
	      .isNotEmpty();
	}
}