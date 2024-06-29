import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a=2.14, e=3.67, d=1.11, m=0.95, p=5.0;
        double aa, ee, dd, mm, pp,total;
        Scanner sc = new Scanner(System.in);

        System.out.print("Armut kaç kilo: ");
        aa = sc.nextDouble();
        System.out.print("Elma kaç kilo: ");
        ee = sc.nextDouble();
        System.out.print("Domates kaç kilo: ");
        dd = sc.nextDouble();
        System.out.print("Muz kaç kilo: ");
        mm = sc.nextDouble();
        System.out.print("Patlıcan kaç kilo: ");
        pp = sc.nextDouble();

        total = (a*aa)+(e*ee)+(d*dd)+(m*mm)+(p*pp);
        System.out.print("Toplam tutar: "+ total + " TL");
    }
}