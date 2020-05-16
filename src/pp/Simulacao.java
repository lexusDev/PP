package pp;

import java.util.Scanner;

public class Simulacao {
    private RendVar var;
    private RendFix fix;
    private double valor;
    
    Scanner sc = new Scanner(System.in);
    
    public Simulacao(double valor){
        this.valor = valor;
    }
    
    private void setValores(){
        var.setValor(valor);
        fix.setValor(valor);
    }
    
    public double valorRendido(int opcao){
        double valor=0;
        
        switch(opcao){
            case 1:
                valor = var.getValor();
                break;
            case 2:
                valor = fix.getValor();
                break;
            default:
                System.out.println("Opção incorreta!");
        }
        
        return valor;
    }
}