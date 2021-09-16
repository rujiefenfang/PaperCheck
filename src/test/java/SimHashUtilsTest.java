import org.junit.Test;
import utils.SimHashUtils;

public class SimHashUtilsTest {

    @Test
    public void getHashTest(){
        System.out.println(SimHashUtils.getHash("我今天早上要去打码"));
        System.out.println(SimHashUtils.getHash("我今天早上不要去打码"));
    }
}
