public class App {
    public static void main(String[] args) throws Exception {
        int tal1 = 2;
        int tal2 = 30;

        int summa_addition = tal1+tal2;
        int summa_subtraktion = tal1-tal2;

        System.out.println("Summan av tal1 och tal2 = "+summa_addition);
        System.out.println("Differensen mellan tal1 och tal2 = "+summa_subtraktion);

        int produkt = tal1*tal2;
        int kvot = tal1*tal2;

        System.out.println("produkten av tal1 och tal2 = "+produkt);
        System.out.println("Kvoten mellan tal1 och tal2 = "+kvot);

        int rest1 = 10%3;
        int rest2 = 9%3;

        System.out.println("resten av 10/3 = "+rest1);
        System.out.println("resten av 9%3 = "+rest2);

    }
}
