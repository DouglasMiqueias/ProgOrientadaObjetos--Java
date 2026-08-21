//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int idade;
    String nome;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o nome da pessoa: ");
    nome = scanner.nextLine();

    System.out.println("Informa a idade: ");
    idade = scanner.nextInt();

    if(idade < 12){
        System.out.println(nome + " é uma criança");
    } else if(idade > 12 && idade < 17)
    {
        System.out.println(nome + " é um adolescente");
    } else if(idade > 18) {
        System.out.println(nome + " é um adulto");
    } else{
        System.out.println("Valor inválido, tente novamente!");
    }

    double idadeDouble = idade;
    System.out.println(idadeDouble);
}
