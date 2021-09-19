import utils.HammingUtils;
import utils.SimHashUtils;
import utils.TxtUtils;

public class main {
    public static void main(String[] args) {
        if(null==args||args.length<3){
            System.out.println("输入格式错误，请重新尝试");
            return;
        }
        String path1 = args[0];
        String path2 = args[1];
        String targetFile = args[2];
        String TxtString1 = TxtUtils.getTxtString(path1);
        String TxtString2 = TxtUtils.getTxtString(path2);
        //获取simHash码
        String simHash0 = SimHashUtils.getSimHash(TxtString1);
        String simHash1 = SimHashUtils.getSimHash(TxtString2);
        //相似度
        double similarity = HammingUtils.getSimilarity(simHash0, simHash1);
        StringBuilder builder = new StringBuilder();
        builder.append("原文文件：").append(path1).append("\n");
        builder.append("抄袭文件：").append(path2).append("\n");
        builder.append("两个文件的相似度为：").append(similarity).append("\n");
        TxtUtils.write(targetFile,builder.toString());
    }

}
