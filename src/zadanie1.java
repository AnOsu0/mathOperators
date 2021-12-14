import java.util.Random;

public class zadanie1 {
    public static void main(String[] args) {
        Random rand = new Random ();

        int x = rand.nextInt(50);
        int y = rand.nextInt(50);
        System.out.println(x);
        System.out.println(y);
        boolean xLowerThenY = (x>y);
        boolean resault1 = (x+2)>y;

        System.out.println(xLowerThenY);
        System.out.println(resault1);
        System.out.println(y<(x+3) && y>(x-2));
        System.out.println(((x*y)%2)==0);
    }
}
