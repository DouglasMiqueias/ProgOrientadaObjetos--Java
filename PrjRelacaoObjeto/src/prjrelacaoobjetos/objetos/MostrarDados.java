package prjrelacaoobjetos.objetos;

import prjrelacaoobjetos.objetos.pessoa.Pessoa;
import prjrelacaoobjetos.objetos.contato.Contato;

public class MostrarDados {

    // Mostra os dados de uma Pessoa e seus contatos
    public void mostrarDadosPessoa(Pessoa pessoa) {
        System.out.println("**** Dados da Pessoa *****");
        System.out.println("ID: " + pessoa.getIdPessoa());
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Data de nascimento: " + pessoa.getDataNascimento());
        System.out.println("**** Contatos ****");

        for (Contato contato : pessoa.getLstContato()) {
            System.out.println("ID: " + contato.getIdContato());
            System.out.println("Tipo: " + contato.getTipoContato());
            System.out.println("Valor: " + contato.getValorContato());
            System.out.println("----------------------");
        }
    }

    // Mostra os dados de um Contato e da Pessoa associada
    public void mostrarDadosContato(Contato contato) {
        System.out.println("*** Dados do Contato ***");
        System.out.println("ID: " + contato.getIdContato());
        System.out.println("Tipo: " + contato.getTipoContato());
        System.out.println("Valor: " + contato.getValorContato());

        Pessoa pessoa = contato.getPessoa();
        if (pessoa != null) {
            System.out.println("*** Pessoa Associada ***");
            System.out.println("ID: " + pessoa.getIdPessoa());
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("CPF: " + pessoa.getCpf());
        } else {
            System.out.println("Nenhuma pessoa associada a este contato.");
        }
    }
}
