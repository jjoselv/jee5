/* Generated by Together */

package patrones.estructura.utilidades;

public class Persona implements Comparable {
    public Persona(String nombre, String email) {
        this.nombre=nombre;
        this.email=email;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    @Override
    public int compareTo(Object par1) {
        // Write your code here
        return getNombre().compareTo(((Persona)par1).getNombre());
    }

    @Override
    public String toString() {
        return getNombre();
    }

    private String nombre;
    private String email;
}
