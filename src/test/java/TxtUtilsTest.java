import org.junit.Test;
import utils.TxtUtils;

public class TxtUtilsTest {
    @Test
    public void getTxtStringTest(){
        String filePath = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本\\orig.txt";
        String txtString = TxtUtils.getTxtString(filePath);
        System.out.println(txtString);
    }
}
