//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<ContaBancaria> contas = new ArrayList<>();

    ContaBancaria conta001c = new ContaCorrente("Douglas", 100);
    ContaBancaria conta001p = new ContaPoupanca("Emanuela", 50);
    ContaBancaria conta002p = null;

    contas.add(conta001c);
    contas.add(conta001p);
    contas.add(conta002p);

    System.out.println("======= PROCESSANDO CONTAS ======");

    contas.forEach(contaBancaria->{
        try{
            contaBancaria.sacar(80);
            System.out.println("Saldo Restante: " + contaBancaria.getSaldo());
            if(contaBancaria instanceof Tributavel){
                Tributavel contaTributavel = (Tributavel) contaBancaria;
                System.out.println("Imposto devido: " + contaTributavel.calcularImposto());
            }
            System.out.println("-------------------------------------------------");

        }
        catch (SaldoInsuficienteException exception){
            System.out.println("Erro de operação " + exception.getMessage());
        }
        catch (NullPointerException exception){
            System.out.println("Conta inválida ou nula encontrada na lista!");
        }
        System.out.println("-------------------------------------------------");
    });
}
