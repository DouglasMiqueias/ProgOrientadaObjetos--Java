//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ArrayList<String> linguagens = new ArrayList<>();

    linguagens.add("Java");
    linguagens.add("Python");
    linguagens.add("C#");
    linguagens.add("JavaScript");

    for(String linguagem : linguagens){
        System.out.println(linguagem);
    }

    System.out.println("Removemendo linguagem C#");
    linguagens.remove("C#");

    System.out.println("Lista Atualizada: ");
    linguagens.forEach(linguagem-> System.out.println(linguagem));
}
