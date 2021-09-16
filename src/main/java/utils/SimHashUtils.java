package utils;


import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SimHashUtils {


    /**
     *MessageDigest 类为应用程序提供信息摘要算法的功能，利用SHA算法。接收任意大小的字符串，返回固定长度的哈希值。
     * @param str
     * @return str的哈希值
     */
    public static String getHash(String str){
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            return new BigInteger(1,messageDigest.digest(str.getBytes(StandardCharsets.UTF_8))).toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return str;
        }
    }

}
