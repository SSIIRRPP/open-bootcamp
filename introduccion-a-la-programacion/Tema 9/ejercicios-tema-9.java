public class Main {
    public static void main(String args[]) {
        Cliente cliente = new Cliente();
        cliente.edad = 25;
        cliente.nombre = "Pedro";
        cliente.telefono = 123456789;
        cliente.credito = 100;
        
        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);
        
        System.out.println("---------------");
        
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 43;
        trabajador.nombre = "Alfredo";
        trabajador.telefono = 987654321;
        trabajador.salario = 2500;
        
        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
        
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
    
}

class Cliente extends Persona {
    int credito;
    
}

class Trabajador extends Persona {
    int salario;
}
