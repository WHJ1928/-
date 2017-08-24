package study;

public class 百鸡算数 {
    public static void main(String[] args) {

        for (int g=0 ;g*5<=100;g++)
        {
            for (int m=0;m*3<=100;m++)
            {
                for(int c=0;c<=100;c++)
                {
                    if(g+m+c==100&&g*15+m*9+c==300)
                    {
                        System.out.println(g+"只公鸡"+m+"只母鸡"+c+"只雏鸡");
                    }
                }
            }

        }
   }
}