
package prymascotas;

public class Prymascotas {

    
    public static void main(String[] args) {
        Perro miPerro = new Perro("Bobby", 3);
        
        System.out.println("Perro:");
        miPerro.comer();          
        miPerro.dormir();         
        miPerro.jugar();          
        miPerro.mostrarcarino();

        Pez miPez = new Pez("Nemo", 1);

        System.out.println("Pez:");
        miPez.comer();           
        miPez.dormir(); 
    }
    
}
