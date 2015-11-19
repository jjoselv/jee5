/* Generated by Together */

package patrones.creacion.factoria.herencia;

class Moto extends Vehiculo {
    public int getTipoMotor() { return tipoMotor; }

    public void setTipoMotor(int tipoMotor) { this.tipoMotor = tipoMotor; }

    @Override
    public String descripcion() {
        return super.descripcion() + " Tipo de motor: " + getTipoMotor() + " tiempos.";
    }

    private int tipoMotor = 4;
}