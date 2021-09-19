import org.junit.Test;
import utils.TxtUtils;


public class TxtUtilsTest {
    @Test
    public void getTxtStringTest(){
        String filePath = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本\\orig.txt";
        String txtString = TxtUtils.getTxtString(filePath);
        System.out.println(txtString);
    }
    @Test
    public void iterateFileTest(){
        String filePath1 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本";
        String filePath2 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本2";

        String[] iterateFile1 = TxtUtils.iterateFile(filePath1);
        String[] iterateFile2 = TxtUtils.iterateFile(filePath2);
        for (String filename:iterateFile1){
            System.out.println(filename);
        }
        for (String filename:iterateFile2){
            System.out.println(filename);
        }
    }
}
