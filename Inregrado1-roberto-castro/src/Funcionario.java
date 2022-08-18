public class Funcionario extends Vendedor{

    private int antiguidade;
    private int vendas;
    private int afiliados;

    public Funcionario(String nome, String sobrenome, int antiguidade, int vendas, int afiliados) {
        super(nome, sobrenome);
        this.antiguidade = antiguidade;
        this.vendas = vendas;
        this.afiliados = afiliados;
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
        return (this.vendas * 5) + (this.afiliados * 10) + this.antiguidade * 5;
    }

}
