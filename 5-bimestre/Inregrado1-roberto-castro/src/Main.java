public class Main {
    public static void main(String[] args) {

        Vendedor funcionario1 = new Funcionario("Darth", "Vader", 70, 60000, 950);
        Vendedor afiliado1 = new Afiliado("Zé", "Ruela", 1);

        funcionario1.mostrarCategoria();
        afiliado1.mostrarCategoria();
    }
}