package test;

/**
 * @program: hern-shop
 * @description: DieLikeADog
 * @author: 宋兆恒-2336909208@q.com
 * @create: 2020-02-25 21:50
 **/
public class DieLikeADog {

    private static int i = 1;

    public static void main(String[] argv){
        for(;;){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(i);
                    i++;
                }
            }).start();
        }
    }
}
