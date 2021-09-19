import org.junit.Test;
import utils.TxtUtils;


public class TxtUtilsTest {
    @Test
    public void getTxtStringTest(){
        String filePath = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本\\orig.txt";
        String txtString = TxtUtils.getTxtString(filePath);
    }
    @Test
    public void iterateFileTest(){
        String filePath1 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本";
        String filePath2 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本2";

        String[] iterateFile1 = TxtUtils.iterateFile(filePath1);
        String[] iterateFile2 = TxtUtils.iterateFile(filePath2);
    }
}
