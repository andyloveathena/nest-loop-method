import java.util.Scanner;

import static java.lang.Math.*;

public class Second {
    // %餘數
    // /整數
    public static void main(String[] args) {
        //求s=a+aa+aaa+aaaa+aa...a的值，其中a是一個數字，相加的項數為n。例如2+22+222+2222+22222(此時共有5個數相加)，幾個數相加有鍵盤控制。若a  =2, n = 3，則輸出結果的形式如：2+22+222 = 246。
        Scanner scanner = new Scanner(System.in);
        System.out.println("請問a的值:");
        int a = scanner.nextInt();
        System.out.println("請輸入n的值");
        int n = scanner.nextInt();

        int result=0;
        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                result+=(a*Math.pow(10,j));        //2=2*Math.pow(10,0)
                                                   //22=2*Math.pow(10,0)+2*Math.pow(10,1)
                                                   //222=2*Math.pow(10,0)+2*Math.pow(10,1)+2*Math.pow(10,2)以此類推,所以需要迴圈.

            }





        }
        System.out.println(result);





    }
}