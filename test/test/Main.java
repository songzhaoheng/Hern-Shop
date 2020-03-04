package test;

import java.io.InputStreamReader;
import java.net.*;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.*;
import javax.net.ssl.HttpsURLConnection;
/**
 * @program: hern-shop
 * @description: CSDN博客刷量
 * @author: 宋兆恒-2336909208@q.com
 * @create: 2020-02-23 20:55
 **/
//实现https请求需要自定义SSL证书(https对链接使用安全证书SSL)
public class Main {
    private static int COUNT=100;//循环访问次数
    private static List<String> urls=new ArrayList<>();//网址
    private static int ERROR_COUNT=0;//访问出错总数
    //初始化信息
    static {
        urls.add("https://blog.csdn.net/qq_36761831/article/details/104465176");
        urls.add("https://blog.csdn.net/qq_36761831/article/details/104448108");
        urls.add("https://blog.csdn.net/qq_36761831/article/details/102999190");
        urls.add("https://blog.csdn.net/qq_36761831/article/details/102672508");
        urls.add("https://blog.csdn.net/qq_36761831/article/details/104383190");
        urls.add("https://blog.csdn.net/qq_36761831/article/details/103891528");
    }
    public static void main(String[] args){
        //配置ssl管理
        SSLSocketFactory ssf=null;
        try{
            //创建SSLContext
            SSLContext sslContext=SSLContext.getInstance("SSL");
            TrustManager[] tm={new MyX509TrustManager()};//信任管理
            //初始化
            sslContext.init(null, tm, new java.security.SecureRandom());
            //获取SSLSocketFactory对象
            ssf=sslContext.getSocketFactory();
        }catch(Exception e){
            System.out.println("SSL配置出错");
            e.printStackTrace();
        }

        for(int i=0;i<COUNT;i++){
            for (String s:urls){
                try {
                    if(s!=null){
                        URL csdn=new URL(s);//创建URl对象
                        HttpsURLConnection csdnConnection=(HttpsURLConnection) csdn.openConnection();//打开地址URL连接,使用https，设置请求对象格式与参数
                        //配置方法参数和请求属性
                        csdnConnection.setDoInput(true);
                        csdnConnection.setDoOutput(true);
                        csdnConnection.setUseCaches(false);
                        csdnConnection.setRequestMethod("GET");
                        csdnConnection.setSSLSocketFactory(ssf);
                        csdnConnection.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.116 Safari/537.36 Edg/80.0.361.57");
                        csdnConnection.connect();//建立tcp连接
                        //发送请求并获得响应报文，返回流对象
                        InputStreamReader in;
                        if(csdnConnection.getResponseCode()==-1){
                            in=new InputStreamReader(csdnConnection.getErrorStream());
                        }else{
                            in=new InputStreamReader(csdnConnection.getInputStream());
                        }
                        in.close();//关闭数据流
                        csdnConnection.disconnect();//断开连接
                    }
                }catch (Exception e){
                    ERROR_COUNT++;
                    e.printStackTrace();
                }
            }
            System.out.println("已执行"+(i+1)+"次");
            //防止频繁执行，睡眠30秒
            try{
                Thread.currentThread().sleep(30000);
            }catch (Exception e){
                System.out.println("睡眠失败");
            }
        }
        System.out.println("over,失败次数:"+ERROR_COUNT+"成功访问次数:"+(urls.size()*COUNT-ERROR_COUNT));
    }
}

//证书管理
class MyX509TrustManager implements X509TrustManager {

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType)
            throws CertificateException {
    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType)
            throws CertificateException {
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}