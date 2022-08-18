public class Main {
    public static void main(String[] args) throws SeriaNaoHabilitadaException {
        SerieProxy serie = new SerieProxy(new GradeDeSeries());

        try{
            System.out.println(serie.getSerie("Dark"));
            System.out.println(serie.getSerie("Dark"));
            System.out.println(serie.getSerie("Breaking Bad"));
            System.out.println(serie.getSerie("Game of Thrones"));
            System.out.println(serie.getSerie("Game of Thrones"));
            System.out.println(serie.getSerie("Game of Thrones"));


        }catch(SeriaNaoHabilitadaException erro){
            System.out.println(erro);
        }

    }
}