public class GradeDeSeries implements ISerie{
    @Override
    public String getSerie(String nomeSerie) {
        Serie s = null;

        switch (nomeSerie){
            case "Dark":
               s = new Serie("Dark");
               break;
            case "Game of Thrones":
                s = new Serie("Game of Thrones");
                break;
            case "Breaking Bad":
                s = new Serie("Breaking Bad");
                break;
            default:
                System.out.println("Série não encontrada");
        }

        return nomeSerie;
    }
}
