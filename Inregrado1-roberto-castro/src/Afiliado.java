public class Afiliado extends Vendedor{
    private int vendas;

    public Afiliado(String nome, String sobrenome, int vendas) {
        super(nome, sobrenome);
        this.vendas = vendas;
    }

    @Override
    public void mostrarCategoria() {
        if(calcularPontos() < 20){
            System.out.println("O funcionário " + super.getNome() + " " + super.getSobrenome() + " pertence a categoria rookie-vai-morrer-logo e possui: " + calcularPontos() + " pontos");
        } else if(calcularPontos() <= 30){
            System.out.println("O funcionário " + super.getNome() + " " + super.getSobrenome() + " pertence a categoria Padawan e possui: " + calcularPontos() + " pontos");
        } else if(calcularPontos() <= 40){
            System.out.println("O funcionário " + super.getNome() + " " + super.getSobrenome() + " pertence a categoria Jedi e possui: " + calcularPontos() + " pontos");
        } else {
            System.out.println("O funcionário " + super.getNome() + " " + super.getSobrenome() + " pertence a categoria Mestre-Super-Motherfucker e possui: " + calcularPontos() + " pontos");
        }
    }

    @Override
    public int calcularPontos() {
        return this.vendas * 15;
    }
}
