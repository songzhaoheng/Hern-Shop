package test;

import java.awt.*;
import java.net.URI;
import java.util.ArrayList;

/**
 * @program: hern-shop
 * @description: CSDN刷量
 * @author: 宋兆恒-2336909208@q.com
 * @create: 2020-02-23 21:05
 **/
public class DesktopTest2 {
    private static Desktop desktop;//定义私有静态成员变量
    public static ArrayList<String> strList = new ArrayList<String>();//定义String类型的泛型集合

    //以下是我的博文的网址
    public static String str = "https://blog.csdn.net/qq_36761831/article/details/104465176";
    /*
     * 定义了一个通过默认浏览器打开相应网址的方法
     * 这个方法还用到了有关Desktop类的一些内容，大家可以自行百度或者查看相应API
     */
    public static void browse(String uri){

        if(Desktop.isDesktopSupported()){//判断是否支持DeskTop
            desktop = Desktop.getDesktop();
            try{
                desktop.browse(new URI(uri));
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }

    /*
     * 调用这个方法将事先写好的网址写入泛型集合strList
     */
    public static void addUri(){
        strList.add(str);
    }

    public static void main(String[] args) {
        int i =0;
        addUri();
        while(true){	//一直循环
            try{
                if(i<1000)	//判断是否小于博文数量，不然可能会出现越界错误
                {
                    browse((String)strList.get(i));
                    Thread.sleep(20000);	//这里的单位为毫秒 我这里设置每个 网址之间间隔30s 这里可以根据情况改
                }else{
                    i=-1; //将i重置为-1 因为后面会进行i++ 加1后就变成了0
                    // 启用cmd运行chrome的方式来退出
                    Runtime.getRuntime().exec("taskkill /F /IM chrome.exe"); //我默认浏览器是 chrome
                    //如果你的事firefox 将chrome改为firefox即可
                    Thread.sleep(3600000);	//这里的单位为毫秒 我这里设置每个访问所有博文后 休眠1小时 这里可以根据情况改
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            i++;
        }

    }

}
