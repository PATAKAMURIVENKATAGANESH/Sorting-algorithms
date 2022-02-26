//20mis7081
//p,venkataganesh
package bubblesort;
import java.util.*;
public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        int temp;
        System.out.println("enter the size of the array");
        size=sc.nextInt();
        int a[]=new int[size];
        for(int k=0;k<size;k++){
            a[k]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                if(a[i]>a[j]){
                   temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int f=0;f<size;f++){
           System.out.println(a[f]); 
        }
    }
    
}
