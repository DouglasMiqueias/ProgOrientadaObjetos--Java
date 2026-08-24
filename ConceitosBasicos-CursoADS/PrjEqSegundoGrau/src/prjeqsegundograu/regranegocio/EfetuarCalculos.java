package prjeqsegundograu.regranegocio;
import prjeqsegundograu.objetos.DadosEntrada;
import prjeqsegundograu.objetos.DadosSaida;

public class EfetuarCalculos 
{
    public DadosSaida calcularDelta(DadosEntrada de, DadosSaida ds)
    {
        ds.setDelta((de.getB()* de.getB())- 4*de.getA()*de.getC());
        return ds;
    }
    
    public DadosSaida calcularX1l(DadosEntrada de, DadosSaida ds)
    {
        ds.setX1l((-de.getB() + Math.sqrt(ds.getDelta())) / (2 * de.getA()));
        return ds;
    }
    
    public DadosSaida calcularX2l(DadosEntrada de, DadosSaida ds)
    {
        ds.setX2l((-de.getB() - Math.sqrt(ds.getDelta())) / (2 * de.getA()));
        return ds;
    }
    
    public DadosSaida calcularXv(DadosEntrada de, DadosSaida ds)
    {
        ds.setXv((-de.getB()) / (2 * de.getA()));
        return ds;
    }
    
    public DadosSaida calcularYv(DadosEntrada de, DadosSaida ds)
    {
        ds.setYv((-ds.getDelta()) / (4 * de.getA()));
        return ds;
    }
}
