import org.junit.Test;


public class mainTest {

    @Test
    public void test1(){
        new main().main(null);
    }
    @Test
    public void test2(){
        String filePath1 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本\\orig.txt";
        String filePath2 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本\\orig_0.8_add.txt";
        String filePath3 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\target.txt";
        new main().main(new String[]{filePath1,filePath2,filePath3});
    }
    @Test
    public void test3(){
        String filePath1 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本\\orig.txt";
        String filePath2 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本\\orig_0.8_del.txt";
        String filePath3 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\target.txt";
        new main().main(new String[]{filePath1,filePath2,filePath3});
    }
    @Test
    public void test4(){
        String filePath1 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本\\orig.txt";
        String filePath2 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本\\orig_0.8_dis_1.txt";
        String filePath3 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\target.txt";
        new main().main(new String[]{filePath1,filePath2,filePath3});
    }
    @Test
    public void test5(){
        String filePath1 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本\\orig.txt";
        String filePath2 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本\\orig_0.8_dis_10.txt";
        String filePath3 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\target.txt";
        new main().main(new String[]{filePath1,filePath2,filePath3});
    }
    @Test
    public void test6(){
        String filePath1 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本\\orig.txt";
        String filePath2 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本\\orig_0.8_dis_15.txt";
        String filePath3 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\target.txt";
        new main().main(new String[]{filePath1,filePath2,filePath3});
    }
    @Test
    public void test7(){
        String filePath1 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本2\\orig.txt";
        String filePath2 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本2\\orig_0.8_add.txt";
        String filePath3 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\target.txt";
        new main().main(new String[]{filePath1,filePath2,filePath3});
    }
    @Test
    public void test8(){
        String filePath1 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本2\\orig.txt";
        String filePath2 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本2\\orig_0.8_del.txt";
        String filePath3 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\target.txt";
        new main().main(new String[]{filePath1,filePath2,filePath3});
    }
    @Test
    public void test9(){
        String filePath1 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本2\\orig.txt";
        String filePath2 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本2\\orig_0.8_dis_1.txt";
        String filePath3 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\target.txt";
        new main().main(new String[]{filePath1,filePath2,filePath3});
    }
    @Test
    public void test10(){
        String filePath1 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本2\\orig.txt";
        String filePath2 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\测试文本2\\orig_0.8_dis_10.txt";
        String filePath3 = "D:\\JAVA\\demo\\PaperChech\\src\\main\\resources\\txt文件\\target.txt";
        new main().main(new String[]{filePath1,filePath2,filePath3});
    }
}
