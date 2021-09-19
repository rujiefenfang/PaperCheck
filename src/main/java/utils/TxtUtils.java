package utils;

import java.io.*;

public class TxtUtils {

    /**
     * 通过绝对路径读取Txt文件，返回String字符串
     * @param filePath Txt文件绝对路径
     * @return str Txt文件的String字符串
     */
    public static String getTxtString(String filePath){
        if (null==filePath){
            try {
                throw new FileNotFoundException("文件名错误");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        File file = new File(filePath);
        if(!file.exists()||!file.isFile()){
            try {
                throw new FileNotFoundException("文件错误，请重新检查文件名或者该路径是否是文件夹");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        String str = "";
        String strLine;
        // 将 txt文件按行读入 str中
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            // 字符串拼接
            while ((strLine = bufferedReader.readLine()) != null) {
                str += strLine;
            }
            // 关闭资源
            inputStreamReader.close();
            bufferedReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 遍历一个文件夹下的所有Txt文件
     * @param filepath
     * @return 目录下的文件名
     */
    public static String[] iterateFile(String filepath)
    {
        File file=new File(filepath);
        //System.out.println(file.getName());
        if(file.isFile())
        {
            //是文件
            System.out.println("\t"+file.getName());
            String[] files = new String[1];
            files[0] = file.getAbsolutePath();
            return files;
        }else{
            String[] files=file.list();
            return files;
        }
    }
    public static void write(String name,String context){
        if(null==name||null==context){
            System.out.println("请输出正确的格式");
            return;
        }
        File file = new File(name);
        BufferedWriter writer=null;
        if(!file.exists()){
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(!file.isFile()){
            System.out.println("路径："+name+" 不是文件，写入文件失败");
            return;
        }
        try {
            writer=new BufferedWriter(new FileWriter(file));
            writer.write(context);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null!=writer){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
