package day10assignment;

public class Smallestnumber {
    public static void main(String[] args) {
        int a[]={9,5,1,2,5,9,7};
        int min=a[0];

        for(int i=0; i<a.length; i++){

            if(a[i]<min){

                min=a[i];
            }
           // System.out.println("smallestnnumber is "+min);

        }
        System.out.println("smallestnnumber is "+min);


    }
}
