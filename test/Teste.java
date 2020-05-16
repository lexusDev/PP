import static org.junit.Assert.assertEquals;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import pp.Simulacao;

public class Teste {
    private Simulacao simulado;

    @Before
    public void setUpClass() {
        simulado = new Simulacao(2000);
    }
    
    @Test
    public void testeValoresFix(){
        double valor = simulado.valorRendido(2);
        assertEquals(1200, valor);
    }
    
     @Test
    public void testeValoresVar(){
        double valor = simulado.valorRendido(1);
        assertEquals(1200, valor);
    }
}
