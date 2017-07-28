import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeTest {
    @Test
    public void getSequenceTest1() throws Exception {
        Prime prime = new Prime();
        prime.getSequence(1);
    }

    @Test
    public void getSequenceTest2() throws Exception {
        Prime prime = new Prime();
        prime.getSequence(6);
    assertEquals(prime.getSequence(6), "6");
    }

}