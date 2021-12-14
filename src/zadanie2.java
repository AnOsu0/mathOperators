public class zadanie2 {
    public static void main(String[] args) {
        double netto = 43526;
        double vat = 0.23;
        System.out.println("cena netto wynosi " + netto + "zł");
        System.out.println("stawka VAT wynosi " + (vat * 100) + " %");
        System.out.println("stawka brutto wynosi " + (netto + (netto*vat)) + "zł");
    }
}
