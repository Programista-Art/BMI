import java.util.Scanner;
public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        System.out.println("Program kalkulaor BMI w JAVA");
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Podaj wagę w kg");
            String weight = scanner.nextLine();
            if (weight.equalsIgnoreCase("koniec")) {
                System.out.println("Koniec programu.");
                break;
            }

            try {
                double weightD = Double.parseDouble(weight);
                System.out.println("Podaj wzrost w metrach");
                String height = scanner.nextLine();
                double heightD = Double.parseDouble(height);
                if (height.equalsIgnoreCase("koniec")) {
                    System.out.println("Koniec programu.");
                    break;
                }

                if (!(heightD <= 0.0) && !(weightD <= 0.0)) {
                    double sumBmi = weightD / (heightD * heightD);
                    if (sumBmi <= 18.5) {
                        System.out.println("Twój wynik " + Math.ceil(sumBmi) + " Masz niedowagę \n Masa ciała jest zbyt niska. \n Skontaktuj się ze swoim lekarzem, który przeprowadzi wywiad medyczny i \n być może zleci wykonanie badań diagnostycznych lub modyfikację diety.");
                    } else if (sumBmi >= 18.5 && sumBmi <= 24.99) {
                        System.out.println("Twój wynik " + Math.ceil(sumBmi) + " Prawidłowa waga \n Masa ciała jest prawidłowa. Dbaj o bogatą w warzywa i owoce dietę oraz codzienną dawkę sportu, \n aby utrzymać dobrą formę.");
                    } else if (sumBmi >= 25.0 && sumBmi <= 29.9) {
                        System.out.println("Twój wynik " + Math.ceil(sumBmi) + " Nadwaga \n Masa ciała jest zbyt wysoka. \n Rozważ konsultację lekarską i modyfikację stylu życia.");
                    } else if (sumBmi >= 30.0) {
                        System.out.println("Twój wynik " + Math.ceil(sumBmi) + " Otyłość \n Masa ciała jest zbyt wysoka, \n wartości BMI wskazuje na rozwijającą się otyłość I stopnia. \n Skontaktuj się ze swoim lekarzem, \n który zarekomenduje modyfikację diety i \n wprowadzenie codziennej dawki ruchu. \n Wdrażając zmiany, unikniesz powikłań otyłości i zachowasz zdrowie na dłużej.");
                    }
                } else {
                    System.out.println("Wzrost i masa muszą być większe od zera.");
                    scanner.nextLine();
                }
            } catch (NumberFormatException var10) {
                System.out.println("Nieprawidłowy format danych. Podaj liczbę.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}