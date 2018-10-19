import hello;


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