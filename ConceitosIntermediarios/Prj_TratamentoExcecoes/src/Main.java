//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    String texto = null;
    try{
        texto.toUpperCase();
    } catch(NullPointerException exception){
        System.out.println(exception);
    }
}
