package com.etoak.site.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

/**
 * Created by yinyong on 2017/3/10.////获得文件的hachcode
 */
public class Test {
        private static ApplicationContext applicationContext;
    public static void main(String[] asg)throws Exception{
        if (applicationContext == null){
            applicationContext = new ClassPathXmlApplicationContext("");
        }
    }








    public static byte[] createChecksum(String filename) throws Exception {
        InputStream fis =  new FileInputStream(filename);
        byte[] buffer = new byte[1024];
        MessageDigest complete = MessageDigest.getInstance("MD5");
        int numRead;
        do {
            numRead = fis.read(buffer);
            if (numRead > 0) {
                complete.update(buffer, 0, numRead);

            }
        } while (numRead != -1);
        fis.close();
        return complete.digest();
    }
    public static String getMD5Checksum(String filename) throws Exception {
        byte[] b = createChecksum(filename);
        String result = "";
        for (int i=0; i < b.length; i++) {
            result += Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring( 1 );
        }
        return result;
    }
}
