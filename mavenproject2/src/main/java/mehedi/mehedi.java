/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mehedi;

/**
 *
 * @author mehedihasan
 */
public class mehedi {
    public static void main(String[] args){
        int arr[]={1,34,2,4,8,9};
        Selec(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
        public static void Selec(int arr[])
        {
             for(int i=0;i<arr.length-1;i++)
             {
                 int min=i;
                 for(int j=i+1;j<arr.length;j++)
                 {
                     if(arr[min]>arr[j])
                     {
                         min=j;
                     }
                 }
                 int temp=arr[i];
                         arr[i]=arr[min];
                         arr[min]=temp;
             }
        }
    
}
