import java.util.Scanner;
public class Bolunme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int k= input.nextInt();
        int toplam=0, s=0;
        for(int i=0; i<=k ; i++)
        {
            if(i%3==0 || i%4==0)
               toplam+=i;
                s++;
        }
        double ort = toplam/s;
        System.out.println("Girilen sayıya kadar olan 3 ve 4 e tam bölünen sayıların toplamı:"+ toplam);
        System.out.println("Girilen sayıya kadar olan 3 ve 4 e tam bölünen sayıların adeti:"+ s);
        System.out.println("Girilen sayıya kadar olan 3 ve 4 e tam bölünen sayıların ortalaması:"+ ort);

    }
}
