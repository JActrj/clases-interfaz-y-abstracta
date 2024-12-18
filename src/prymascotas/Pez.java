package prymascotas;

class Pez extends Animal {
    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }

    public void comer() {
        System.out.println(nombre + " esta comiendo escamas.");
    }

    public void dormir() {
        System.out.println(nombre + " esta durmiendo.");
    }
}

