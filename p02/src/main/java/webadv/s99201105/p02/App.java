package webadv.s99201105.p02;
import org.apache.commons.codec.digest.DigestUtils;
import java.io.*;
public class App {
    public static void main(String[] args) throws Exception{
        if (args.length < 1) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }
        FileInputStream fis = new FileInputStream("a.txt");		
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line;
        String s[] = new String[2];
        int i = 0;
        while((line=br.readLine())!=null){
                 s[i] = line;
	 i++;
        }
        fis.close();
        if(s[0].equals(args[0])&&s[1].equals(sha256hex(args[1]))){
                System.out.println("登录成功！");
        }else{
                System.out.println("登录失败！");
        }
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}
