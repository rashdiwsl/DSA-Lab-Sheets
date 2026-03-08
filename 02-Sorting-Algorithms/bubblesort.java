/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bhagy
 */
public class bubblesort {
    private long []a;//store element array
    private int nElems;//number of elements
    
    public bubblesort(int max){
        a = new long[max];
        nElems=0;
    }
    public void insert(long value){
        a[nElems]=value;
        nElems++;
    }
    
    public void display(){
        for(int i =0;i<nElems;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println();
    }
    public void swap(int one,int two){
        long temp = a[one];
        a[one]=a[two];
        a[two]=temp;
    }
    public void bubblesor(){
        int j,k;
        for(j=nElems-1; j>1;j--){
            for(k=0;k<j;k++){
                if(a[k]>a[k+1]){
                    swap(k,k+1);
                }
            }
        }
    }
    public static void main (String[] args){
        bubblesort array = new bubblesort(10);
        
        array.insert(5);
        array.insert(10);
        array.insert(15);
        array.insert(4);
        array.insert(8);
        array.insert(87);

        System.out.println("original array:");
        array.display();
        
        array.bubblesor();
        System.out.println("Second array:");
        array.display();
    }
}
