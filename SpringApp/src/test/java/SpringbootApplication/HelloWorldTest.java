package SpringbootApplication;

public class HelloWorldTest {

    public void testgetstring(){
        //here the output varies on the what profile is activated on that time., refer pom.xml file.
        System.out.println(System.getenv("TEST_HOST"));
    }

}
