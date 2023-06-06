package day10assignment;

public class Evenposition {
    public static void main(String[] args) {

        int a[] ={9,8,7,2,6,3,8,7,2,6,3};

        for(int i=1;i<a.length; i=i+2){

            System.out.println("numbers on even position " +a[i] );
        }

    }
}
