public class Main {
    public static void main(String[] args) {

        for (InnerDays D : InnerDays.values())
        {
            Days d = new Days(D);
            System.out.print(D);
            d.getDays();
        }
        sc.close();
    }
}
