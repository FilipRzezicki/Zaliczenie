import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj równanie w postaci a*x + b = 0");
    System.out.println("Podaj wartość a: "); //podajemy wartość a
    double a = scanner.nextDouble();
    System.out.println("Podaj wartość b: "); //podajemy wartość b
     double b = scanner.nextDouble();
     if (a == 0) { //jeśli współczynnik jest równy 0 wtedy nie ma równania liniowego ~ definicja prosto ze strony ministerstwa
            System.out.println("To nie jest równanie liniowe.");
        } else {
            System.out.println("To jest równanie liniowe.");
            System.out.println("Równanie: " + a + "*x + " + b + " = 0"); // tutaj jest wyświetlane równanie
            double x = -b / a; //jeśli występuje równanie liniowe  to posiada miejsce zerowe ~ definicja prosto ze strony ministerstwa
            System.out.println("Rozwiązanie równania: x = " + x); //wypisywanie rozwiązania równania
        }

        scanner.close();
    }
}
// gdy a = 0 i b != 0 to równanie jest sprzeczne (tak zrozumiałem)