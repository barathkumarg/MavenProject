import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

	@Test
	public void testGethello() {
		HelloWorld obj = new HelloWorld();
		assert("helloworld".equals(obj.gethello()));
		
	}

}
