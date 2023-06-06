package day10assignment;

public class Duplicateinarray {
    public static void main(String[] args) {
        int a[]={1,2,3,2,4,5,6,4,7,8,7,9,8,9,1,2,3,};
        for(int i=0;i<a.length; i++){

            for(int j=i+1;j<a.length;j++){

                if(a[i]==a[j]){

                    System.out.print(a[j]+ " ");
                }
            }
        }
    }
}
