import org.junit.Test;
import utils.HammingUtils;
import utils.SimHashUtils;
import utils.TxtUtils;

public class HammingUtilsTest {

    @Test
    public void getSimilarityTest(){
        String filePath1 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本\\orig.txt";
        String filePath2 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本\\orig_0.8_del.txt";
        String txtString1 = TxtUtils.getTxtString(filePath1);
        String txtString2 = TxtUtils.getTxtString(filePath2);
        String simHash1 = SimHashUtils.getSimHash(txtString1);
        String simHash2 = SimHashUtils.getSimHash(txtString2);
        System.out.println(HammingUtils.getSimilarity(simHash1,simHash2));
    }
}
