package day10assignment;

public class Secondlargest {
    public static int secondLargest(int a[], int total) {

        int temp;

        for(int i=0;i<total;i++){

            for(int j=i+1; j<total; j++){
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
        return a[total-2];
    }

    public static void main(String[] args) {
        int a[]={0,9,8,7,6,5,4,3,5,6};
        int ss=secondLargest(a,10);
        System.out.println("secondlargest "+ ss);
    }
}
