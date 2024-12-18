package prymascotas;


public class Perro extends Animal implements Mascota{

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    
    public void comer() {
        System.out.println(nombre + " esta comiendo croquetas.");
    }

   
    public void dormir() {
        System.out.println(nombre + " esta durmiendo.");
    }

  
    public void jugar() {
        System.out.println(nombre + " esta jugando.");
    }

    
    public void mostrarcarino() {
        System.out.println(nombre + " esta mostrando cariño.");
    }
    
}
