public class compareOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        System.out.println("Czy x jest większy od y?");
        boolean isXGreaterThenY = x>=y;
        System.out.println(isXGreaterThenY);

        boolean XequalY = x!=y;
        System.out.println("Czy x jest różne od y?");
        System.out.println(XequalY);
        System.out.println(!XequalY);
    }
}
