public class Main {
    public static void main(String args[]) {
        int numeroIf = 0;
        
        if (numeroIf > 0) {
            System.out.println("el número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("el número es negativo");
        } else {
            System.out.println("el número es cero");
        }
        
        int numeroWhile = 0;
        
        while (numeroWhile < 3) {
            System.out.println("numeroWhile: " + numeroWhile);
            numeroWhile += 1;
        }
        
        int numeroDoWhile = 0;
        
        do {
            System.out.println("numeroDoWhile: " + numeroDoWhile);
            numeroDoWhile += 1;
        } while(numeroDoWhile < 1);
        
        for (int numeroFor = 0; numeroFor <= 3; numeroFor += 1) {
            System.out.println("numeroFor: " + numeroFor);
        }
        
        String estacion = "VERANO";
        
        switch (estacion) {
            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            case "VERANO":
                System.out.println("es verano");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            default:
                System.out.println("es otra estación");
        }
        
    }
}
