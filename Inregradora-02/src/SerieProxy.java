public class SerieProxy implements ISerie{
    private GradeDeSeries gradeDeSerie;
    private int qtdViews;

    public SerieProxy(GradeDeSeries gradeDeSerie) {
        this.gradeDeSerie = gradeDeSerie;
    }

    @Override
    public String getSerie(String nomeSerie) throws SeriaNaoHabilitadaException {
        String s = this.gradeDeSerie.getSerie(nomeSerie);

        if(this.qtdViews < 5){
            System.out.println("A série " + s + " está disponível no link: " + "www." + s.replace(" ", "").toLowerCase() + ".com");
            ++qtdViews;
        } else {
            throw new SeriaNaoHabilitadaException("Você excedeu o número de visualizações semanais permitidas");
        }
        return s;

    }


}
