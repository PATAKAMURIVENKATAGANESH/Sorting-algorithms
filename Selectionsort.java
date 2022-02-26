//20mis7081
//p,venkataganesh
package selectionsort;
import java.util.*;
public class Selectionsort {   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter the size of the array");
        size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter the elements");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();  
        }
        for(int j=0;j<size-1;j++){
            int minvalue=j;
            for(int k=j+1;k<size;k++){
                if(a[k]<a[j])
                    minvalue=k;
                int temp=a[minvalue];
                a[minvalue]=a[k];
                a[k]=temp;  
            }
        }
        for(int h=0;h<size;h++){
            System.out.println(a[h]);
        }
    }  
}
