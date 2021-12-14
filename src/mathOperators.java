public class mathOperators {
    public static void main(String[] args) {
        int x = 22;
        int y = 2;

        int suma = x + y;
        System.out.println(suma); //suma
        System.out.println(x-y); //różnica
        System.out.println(x*y); //iloczyn
        System.out.println(x/y); //iloraz
        System.out.println(x%y); //reszta z dzielenia (modulo)

//        y = y*5;
        y *= 5;
        System.out.println("Nowy y=" + y);
    }
}
