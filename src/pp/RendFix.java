package pp;

public class RendFix implements InterfaceRend{
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
        return 0.6*Valor;
    }
}