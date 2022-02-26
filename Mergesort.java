//20mis7081
//p.venkataganesh
package mergesort;
import java.util.Arrays;  
import java.util.*;
class Mergesort
{
   public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
      Mergesort ob = new Mergesort();
System.out.println("enter the size");
int size=sc.nextInt();
        int nums[] = new int[size];
System.out.println("enter the elements of array");
for(int i=0;i<size;i++){
nums[i]=sc.nextInt();
}
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));
        ob.sort(nums, 0, nums.length-1);
         System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(nums));
        }    
 void sort(int nums[], int left, int right)
    {
        if (left < right)
        {
            int m = (left+right)/2;
            sort(nums, left, m);
            sort(nums , m+1, right);
            merge(nums, left, m, right);
        }
    }
    void merge(int nums[], int left, int m, int right)
    {
        int n1 = m - left + 1;
        int n2 = right - m;
 
        int Left_part_arra[] = new int [n1];
        int Right_part_arra[] = new int [n2];
 
        for (int i=0; i<n1; ++i)
            Left_part_arra[i] = nums[left + i];
        for (int j=0; j<n2; ++j)
            Right_part_arra[j] = nums[m + 1+ j];

        int i = 0, j = 0;
 
        int k = left;
        while (i < n1 && j < n2)
        {
            if (Left_part_arra[i] <= Right_part_arra[j])
            {
                nums[k] = Left_part_arra[i];
                i++;
            }
            else
            {
                nums[k] = Right_part_arra[j];
                j++;
            }
            k++;
        }
 
        while (i < n1)
        {
            nums[k] = Left_part_arra[i];
            i++;
            k++;
        }
 
        while (j < n2)
        {
            nums[k] = Right_part_arra[j];
            j++;
            k++;
        }
    }
  
  
    
}