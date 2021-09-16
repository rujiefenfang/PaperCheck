package utils;

import java.io.*;

public class TxtUtils {

    /**
     * 通过绝对路径读取Txt文件，返回String字符串
     * @param filePath Txt文件绝对路径
     * @return str Txt文件的String字符串
     */
    public static String getTxtString(String filePath){
        StringBuilder str = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                str.append(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }
}
