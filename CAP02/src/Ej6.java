public class Ej6 {
    public static void main(String[] args) {
        double base, IVA, total;
        base = 22.75;
        IVA = 4.78; //4.78%
        total = base+IVA;
        System.out.printf("%-14s\t%5.2f%n","Base imponible",base);
        System.out.printf("%-14s\t%4.0f%n","IVA(%)",(IVA/base)*100);
        System.out.printf("%-14s\t%5.2f%n","IVA",IVA);
        System.out.println("-----------------------");
        System.out.printf("%-14s\t%5.2f%n","Total",total);
    }   

}
