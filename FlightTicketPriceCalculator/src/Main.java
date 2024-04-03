/* Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int age, flightType, distance, price;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        age = input.nextInt();
        if (age <= 0) {
            System.out.println("Invalid input. Please enter a positive number greater than 0.");
        } else {
            System.out.print("Press 1 for one way, 2 for round trip: ");
            flightType = input.nextInt();
            if (flightType != 1 && flightType != 2) {
                System.out.println("Invalid input. Please enter 1 or 2.");
            } else {
                System.out.print("Please enter total distance: ");
                distance = input.nextInt();
                if (distance <= 0) {
                    System.out.println("Invalid input. Please enter a positive number greater than 0.");
                } else {
                    price = (int) (distance * 0.10);
                    if (age <= 12) {
                        price = price / 2;
                        System.out.println("Children under 12 received a 50% discount!");
                    } else if (age < 24) {
                        price -= (price * 10) / 100;
                        System.out.println("Youth aged 12-24 received a 30% discount!");
                    } else if (age >= 65) {
                        price -= (price * 30) / 100;
                        System.out.println("Seniors aged 65 and over received a 30% discount!");
                    }
                    if (flightType == 2) {
                        price -= (price * 20) / 100;
                        System.out.println("Special 20% discount applied for round-trip tickets!");
                    }
                    System.out.println("The amount to be paid: " + price);
                }
            }
        }
    }
}
