//20mis7081
//p.venkata ganesh
package insertionsort;
import java.util.*;
public class Insertionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        for(int j=1;j<size;j++){
            int key=a[j];
            int k=j-1;
            while(k>=0 && a[k]>key){
                a[k+1]=a[k];
                k=k-1;
            }
            a[k+1]=key;
        }
        for(int h=0;h<size;h++){
           System.out.println(a[h]);
        }
      
    }
    
}
