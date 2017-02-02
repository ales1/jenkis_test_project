package info.ales.test;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by ales on 02/02/2017.
 */
public class JenkinsHelloTest {
    @Test
    public void test(){
        JenkinsHello sut=new JenkinsHello();
        assertTrue(sut.method(true));
        assertFalse(sut.method(false));

    }
}