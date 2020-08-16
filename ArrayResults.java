package com.ram;

import java.util.Arrays;

public class ArrayResults {

	public static void main(String[] args) {
		
		System.out.println("First Method Output");
		findDuplicateElementsinArray();
		System.out.println("\n Second Method Output");
		removeDuplicateElementsinArray();
		System.out.println(" \n Third Method Output");
		int a1[] = {1, 6, 4, 3, 2, 2, 3, 8, 1};
		sumOfUniqueNumbersInArray(a1);
		int b1[] = {1, 1, 3, 2, 2, 3};
		sumOfUniqueNumbersInArray(b1);
		System.out.println(" \n Fourth Method Output ");
		int a[] = {6, 8, 1,9, 2, 1,10};
		thirdLargestNumberInArray(a);
		int b[] = {6, 8, 1,9, 2, 1,10,12};
		thirdLargestNumberInArray(b);
		int b2[] = {6};
		thirdLargestNumberInArray(b2);
		System.out.println(" \n Fifth Method Output");
		int c[] = {2, 5, 1,7, 3, 9,5};
		maximumDiffBWTwoElementsInArray(c);
		int d[] = {9, 2, 12, 5, 4, 7, 3, 19, 5};
		maximumDiffBWTwoElementsInArray(d);
		System.out.println(" \n Sixth Method Output");
		int c1[] = {1, 2, 5, 5, 6, 6, 7, 2};
		min(c1);
		max(c1);
		System.out.println(" \n Seventh Method Output");
		secMinandSecMaxElementsInArray();
		System.out.println(" \n Seventh Method Output");
		int l[] = {1, 5, 10, 20, 40, 80}; 
        int m[] = {6, 7, 20, 80, 100}; 
        int n[] = {3, 4, 15, 20, 30, 70, 80, 120}; 
        System.out.print(" \n Common elements are : "); 
		findCommonElementsInArrays(l,m,n);
        

	}
	private static void findDuplicateElementsinArray(){
		
		int [] arr = new int [] {1, 2, 5, 5, 6, 6, 7, 2};   
		
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
	}
   private static void removeDuplicateElementsinArray(){
		
		int arr[] = {1, 2, 5, 5, 6, 6, 7, 2}; 

		Arrays.sort(arr);
		
        int length = arr.length;  
        
        length = getData(arr, length);  
        
        for (int i=0; i<length; i++)  
           System.out.print(" \n "+arr[i]+" ");  
       
	}
   public static int getData(int arr[], int n){  
	   
	   if (n==0 || n==1){  
           return n;  
       }  
       int[] temp = new int[n];  
       int j = 0;  
       for (int i=0; i<n-1; i++){  
           if (arr[i] != arr[i+1]){  
               temp[j++] = arr[i];  
           }  
        }  
       temp[j++] = arr[n-1];     
       // Changing original array  
       for (int i=0; i<j; i++){  
           arr[i] = temp[i];  
       }  
       return j;  
   }  
   public static void thirdLargestNumberInArray(int[] a)
   {  

       int total = a.length; 
       if(total<3) {
    	   System.out.println("\n Invalid Input, Array Size is less than 3");   
       }else {
	   int temp;  
	   for (int i = 0; i < total; i++)   
	           {  
	               for (int j = i + 1; j < total; j++)   
	               {  
	                   if (a[i] > a[j])   
	                   {  
	                       temp = a[i];  
	                       a[i] = a[j];  
	                       a[j] = temp;  
	                   }  
	               }  
	           }  
	     System.out.println("\n Third Largest Element :"+a[total-3]);  
       }
   }  
   public static void sumOfUniqueNumbersInArray(int[] a){

       Arrays.sort(a);

       int current = a[0];
       int sum = a[0];
       for (int i = 1; i <a.length ; i++) {
           if(current!=a[i]) {
               sum += a[i];
               current = a[i];
           }
       }
       System.out.println("\n "+sum);
   }
   public static void maximumDiffBWTwoElementsInArray(int[] a) 
   { 
	   
	   int n = a.length; 

	   int minEle = a[0]; 
       int maxEle = a[0]; 
       for (int i = 1; i < n; i++) { 
           minEle = Math.min(minEle, a[i]); 
           maxEle = Math.max(maxEle, a[i]); 
       } 
 
       System.out.println(" \n "+ (maxEle - minEle)); 
   } 
   public static void max(int [] array) {
	      int max = 0;
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]>max) {
	            max = array[i];
	         }
	      }
	      System.out.println(" \n Max : "+ max); 
	   }
	   public static void min(int [] array) {
	      int min = array[0];
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]<min) {
	            min = array[i];
	         }
	      }
	      System.out.println(" \n Min : "+ min); 
	   }
	   public static void secMinandSecMaxElementsInArray(){
		   
		      int arr[] = {1, 2, 5, 9, 6, 4, 7, 2}; 
		      int a;
		   
		      int count = arr.length;
		      for (int i = 0; i < count; i++) {
		         for (int j = i + 1; j < count; j++) {
		            if (arr[i] > arr[j]) {
		               a = arr[i];
		               arr[i] = arr[j];
		               arr[j] = a;
		            }
		         }
		      }
		      System.out.println(" \n Second Min: "+arr[1]);
		      System.out.println(" \n Second Max: "+arr[count-2]);
	   }
	   public static void findCommonElementsInArrays(int ar1[], int ar2[], int ar3[]) 
	    { 
	        int i = 0, j = 0, k = 0; 
	  
	        while (i < ar1.length && j < ar2.length && k < ar3.length) 
	        { 
	             if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) 
	             {   System.out.print(ar1[i]+" ");   i++; j++; k++; } 
	  
	             else if (ar1[i] < ar2[j]) 
	                 i++; 
	  
	             else if (ar2[j] < ar3[k]) 
	                 j++; 
	  
	             else
	                 k++; 
	        } 
	    }
}
