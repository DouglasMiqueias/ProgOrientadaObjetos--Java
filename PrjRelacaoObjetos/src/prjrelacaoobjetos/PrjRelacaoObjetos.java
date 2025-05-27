/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjrelacaoobjetos;

import java.util.ArrayList;
import java.util.List;
import prjrelacaoobjetos.objetos.Contato;
import prjrelacaoobjetos.objetos.Pessoa;

/**
 *
 * @author IFTM
 */
public class PrjRelacaoObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contato c1 = new Contato();
        Contato c2 = new Contato();
        Contato c3 = new Contato();
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        c1.setIdContato(1);
        c1.setTipoContato("email");
        c1.setValorContato("teste@gmail.com");
        
        c2.setIdContato(2);
        c2.setTipoContato("email");
        c2.setValorContato("teucu@gmail.com");
        
        c3.setIdContato(3);
        c3.setTipoContato("celular");
        c1.setValorContato("32445454545");
                
        p1.setIdPessoa(10);
        p1.setNome("Frederico");
        p1.setCpf("123.456.789.12");
        p1.setDataNascimento("14/09/1999");
        List<Contato> lstContato1 = new ArrayList<Contato>();
        lstContato1.add(c1);
        c1.setPessoa(p2);
        p1.setLstContato(lstContato1);
            
        
    }
    
}
