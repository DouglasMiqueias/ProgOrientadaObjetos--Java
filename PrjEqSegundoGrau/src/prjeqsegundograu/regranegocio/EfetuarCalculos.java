package prjeqsegundograu.regranegocio;
import prjeqsegundograu.objetos.DadosEntrada;
import prjeqsegundograu.objetos.DadosSaida;

public class EfetuarCalculos 
{
    public DadosSaida calcularDelta(DadosEntrada de)
    {   
        DadosSaida ds = new DadosSaida();
        
        float delta = (de.getB()*de.getB()) - 4*de.getA()*de.getC();
        ds.setDelta(delta);
        return ds;
    }
    
}
