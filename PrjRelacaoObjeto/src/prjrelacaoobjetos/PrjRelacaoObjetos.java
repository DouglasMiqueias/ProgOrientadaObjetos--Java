package prjrelacaoobjetos;

import prjrelacaoobjetos.objetos.contato.Contato;
import prjrelacaoobjetos.objetos.pessoa.Pessoa;
import prjrelacaoobjetos.objetos.MostrarDados;

public class PrjRelacaoObjetos {

    public static void main(String[] args) {
        // Criando contatos
        Contato c1 = new Contato();
        c1.setIdContato(1);
        c1.setTipoContato("email");
        c1.setValorContato("teste@gmail.com");

        Contato c2 = new Contato();
        c2.setIdContato(2);
        c2.setTipoContato("email");
        c2.setValorContato("teucu@gmail.com");

        Contato c3 = new Contato();
        c3.setIdContato(3);
        c3.setTipoContato("celular");
        c3.setValorContato("32445454545");

        // Criando pessoas
        Pessoa p1 = new Pessoa();
        p1.setIdPessoa(10);
        p1.setNome("Frederico");
        p1.setCpf("123.456.789-12");
        p1.setDataNascimento("14/09/1999");

        Pessoa p2 = new Pessoa();
        p2.setIdPessoa(11);
        p2.setNome("Ana");
        p2.setCpf("987.654.321-00");
        p2.setDataNascimento("20/05/2000");

        // Associando contatos à pessoa p1
        p1.adicionarContato(c1);
        p1.adicionarContato(c2);

        // Associando contato c3 à pessoa p2
        p2.adicionarContato(c3);

        // Criando instância para exibir os dados
        MostrarDados md = new MostrarDados();

        // Mostrando dados de cada pessoa
        System.out.println("========== Pessoa 1 ==========");
        md.mostrarDadosPessoa(p1);

        System.out.println("\n========== Pessoa 2 ==========");
        md.mostrarDadosPessoa(p2);

        // Mostrando dados de um contato específico
        System.out.println("\n========== Contato Individual ==========");
        md.mostrarDadosContato(c1);
    }
}
