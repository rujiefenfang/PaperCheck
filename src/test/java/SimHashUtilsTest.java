import org.junit.Test;
import utils.SimHashUtils;
import utils.TxtUtils;

public class SimHashUtilsTest {

    @Test
    public void getHashTest(){
        System.out.println(SimHashUtils.getHash("我今天早上要去打码"));
        System.out.println(SimHashUtils.getHash("我今天早上不要去打码"));
    }
    @Test
    public void getSimHashTest(){
        String filePath1 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本\\orig.txt";
        String filePath2 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本\\orig_0.8_add.txt";
        String txtString1 = TxtUtils.getTxtString(filePath1);
        String txtString2 = TxtUtils.getTxtString(filePath2);
        String simHash1 = SimHashUtils.getSimHash(txtString1);
        String simHash2 = SimHashUtils.getSimHash(txtString2);
        System.out.println(simHash1);
        System.out.println(simHash2);
    }
}
