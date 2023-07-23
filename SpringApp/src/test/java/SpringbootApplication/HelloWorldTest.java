package SpringbootApplication;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void getstring(){
        //here the output varies on the what profile is activated on that time., refer pom.xml file.
        System.out.println(System.getenv("TEST_HOST"));
    }

}
