
// Primera parte

public class Main {
  public static void main (String[] args) {
    System.out.println(suma(2,3,4));
  }

  public static int suma (int a, int b, int c) {
    return a + b + c;
  }

}

// Segunda parte

class Coche {
  int puertas = 5;

  void addPuerta() {
    puertas += 1;
  }

}

public class Main {

  public static void main(String[] args) {

    Coche miCoche = new Coche();

    miCoche.addPuerta();

    System.out.println(miCoche.puertas);

  }
}