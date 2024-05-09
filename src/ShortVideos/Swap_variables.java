package ShortVideos;

public class Swap_variables {
    public static void main(String[] args) {


        int i = 15;
        int j = 10;

        i = i - j; // 15-10 =5; i = 5;
        j = i + j; //10+5 =15; j=15
        i = j - i; //15-5 = 10 ; i =10

        System.out.println(i);// 10
        System.out.println(j);//15
    }
}