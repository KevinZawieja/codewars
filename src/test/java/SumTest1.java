import org.junit.jupiter.api.Test;
import static org.testng.AssertJUnit.assertEquals;


public class SumTest1 {

    Sum s = new Sum();

    @Test
    public void Test1()
    {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
    }

}