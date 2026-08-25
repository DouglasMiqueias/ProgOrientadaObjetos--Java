//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    AuditoriaService auditoria = new AuditoriaService();

    auditoria.adicionarTransacao(new Transacao("Douglas", 1500.00, StatusTransacao.APROVADA));
    auditoria.adicionarTransacao(new Transacao("Emanuela", 350.50, StatusTransacao.APROVADA));
    auditoria.adicionarTransacao(new Transacao("Maria", 4200.00, StatusTransacao.RECUSADA));
    auditoria.adicionarTransacao(new Transacao("José", 890.00, StatusTransacao.PENDENTE));
    auditoria.adicionarTransacao(new Transacao("Flávio", 2100.00, StatusTransacao.APROVADA));

    System.out.println("=== 1. Transações Aprovadas ===");
    List<Transacao> aprovadas = auditoria.filtrarPorStatus(StatusTransacao.APROVADA);
    aprovadas.forEach(System.out::println);

    System.out.println("=== 2. Transações Recusadas ===");
    List<Transacao> recusadas = auditoria.filtrarPorStatus(StatusTransacao.RECUSADA);
    recusadas.forEach(System.out::println);

    System.out.println("=== 3. Maior Transação Aprovada ===");
    auditoria.maiorTransacaoAprovada()
            .ifPresentOrElse(
                    t -> System.out.println(t),
                    () -> System.out.println("Nenhuma transação aprovada encontrada!")
            );
}
