
public class Review02 {

    public static void main(String[] args) {
        //変数iを宣言
        int i;
        //iを１から１００まで１ずつカウントアップする
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");//3の剰余0かつ5の剰余0=FizzBuzz
            }else if (i % 3 == 0) {
                System.out.println("Fizz");//3の剰余0=Fizz
            }else if (i % 5 == 0) {
                System.out.println("Buzz");//5の剰余0=Buzz
            }else {
                System.out.println(i);//上記以外、iをそのまま表示
            }
        }
    }

}
