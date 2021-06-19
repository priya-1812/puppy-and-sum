/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puppy.and.sum;
import java.util.Scanner;
public class PuppyAndSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int result=0;
        while(t>0)
        {
            int d=in.nextInt();
            int n=in.nextInt();
            for(int i=0;i<d;i++)
            {
                result=n*(n+1)/2;
                n=result;
            }
            System.out.println(result);
        }
        t--;
    }
    
}
