package day10assignment;

public class largestnumber {

    public static void main(String[] args) {

    int[] a={98,67,99,23,21};

     int max=a[0];

     for(int i=0; i<a.length; i++){

         if(a[i]>max){

            max=a[i];

         }
         System.out.println("largest number is " + max);

     }
}
}