package pp;

public class RendVar implements InterfaceRend{
    private double Valor;
    
    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double valorRendido(){
        return Valor*Math.pow(1.6, 12);
    }
}