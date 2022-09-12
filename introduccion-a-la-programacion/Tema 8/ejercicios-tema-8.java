public class Main {
    public static void main(String args[]) {
        Persona persona = new Persona();
        
        persona.setEdad(25);
        persona.setNombre("Pascual");
        persona.setTelefono(123456789);
        
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
        
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;
    
    public Persona() {
        this.edad = 0;
        this.nombre = "";
        this.telefono = 0;
    }
    
    public int getEdad () {
        return this.edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getTelefono () {
        return this.telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
