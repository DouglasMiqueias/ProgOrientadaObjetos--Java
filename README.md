# ☕ Estudos de Java - Programação Orientada a Objetos

Repositório dedicado ao armazenamento de códigos, anotações e projetos desenvolvidos durante os meus estudos da linguagem Java, com foco em Programação Orientada a Objetos (POO).

---

## 📂 Estrutura do Repositório

O projeto está organizado em três níveis principais para facilitar a navegação e o aprendizado progressivo:

* **`📂 ConceitosBasicos/`**
  * Sintaxe inicial da linguagem.
  * Estruturas condicionais e de repetição.
  * Primeiros passos com classes, atributos e métodos.

* **`📂 ConceitosIntermediarios/`**
  * Pilares da POO: Encapsulamento, Herança e Polimorfismo.
  * Uso de interfaces e classes abstratas.
  * Tratamento de exceções personalizadas (`try/catch`).

* **`📂 Desafios/`**
  * **`Prj_Desafio_SistemaBancario`**: Sistema simulando operações bancárias com validações, saques, depósitos e controle de saldo utilizando conceitos avançados de POO.
  * Projetos práticos e desafios de lógica de maior complexidade.
  * **`Prj_Desafio_SistemaGaragem`**: Sistema de gerenciamento de frota que explora polimorfismo, herança múltipla simulada por interfaces e tratamento robusto de erros.
  * **`Prj_Desafio_SistemaFiltragemVeiculos`**: Sistema de busca de veículos que aplica Java Core e POO com manipulação de ArrayList, filtragem por regras de negócio, tratamento de exceções customizadas.
  * **`Prj_Desafio_GatewayPagamentos`**: Gateway de pagamento dinâmico em Java Core que processa transações polimórficas (Cartão de Crédito e Pix) utilizando contratos de interface (Pagavel), taxas percentuais,
  * validação de chaves/limites com exceções customizadas, controle estático de transações e resiliência a objetos nulos.
  * **Prj_Desafio_AuditoriaTransacoes`**: Módulo de auditoria e relatórios financeiros em Java Core que utiliza Stream API e Expressões Lambda para filtragem declarativa de dados por Enum (StatusTransacao), cálculo de somatórios com mapToDouble, busca do maior valor com Comparator e prevenção de NullPointerException com a classe Optional.
  * **`Prj_Biblioteca`**: Sistema de gestão de biblioteca e acervo que explora os recursos do **Java Intermediário**, utilizando `Record` para imutabilidade, **Generics** para classes reutilizáveis, `Queue` (`LinkedList`) para gerenciamento de fila de espera e **Stream API** com Lambdas para filtragem, mapeamentos (`Map`/`Set`) e operações de agregação.
---

## 🛠️ Tecnologias e Ferramentas Utilizadas

* **Linguagem:** Java (JDK 17+)
* **Ambiente de Desenvolvimento (IDE):** IntelliJ IDEA / NetBeans
* **Controle de Versão:** Git e GitHub

---

## 🚀 Como Executar os Projetos Localmente

1. **Clone o repositório:**
   ```bash
   git clone git@github.com:DouglasMiqueias/ProgOrientadaObjetos--Java.git
   ```
2. **Abra o projeto:**
   * Importe a pasta raiz ou o projeto específico na sua IDE de preferência.
3. **Execute:**
   * Localize a classe que contém o método `public static void main` (como a `Main.java` dentro do Sistema Bancário) e execute o arquivo.

---

## 📌 Objetivos de Aprendizado

- [x] Compreender a sintaxe e a tipagem do Java.
- [x] Dominar os 4 pilares da Programação Orientada a Objetos.
- [x] Praticar boas práticas de escrita de código (Clean Code).
- [ ] Implementar testes unitários (JUnit) em desafios futuros.

---
Desenvolvido por [Douglas Miqueias](https://github.com) ✨
