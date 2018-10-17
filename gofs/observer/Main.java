public class Main {
    public static void main(String[] args) {
        TwitterAccount victorcmoura = new TwitterAccount("victorcmoura");
        TwitterAccount brunapinos = new TwitterAccount("brunapinos");
        TwitterAccount guiglacerda = new TwitterAccount("guiglacerda");

        victorcmoura.addObserver(brunapinos);
        victorcmoura.addObserver(guiglacerda);

        brunapinos.addObserver(victorcmoura);
        brunapinos.addObserver(guiglacerda);

        guiglacerda.addObserver(brunapinos);
        guiglacerda.addObserver(victorcmoura);

        System.out.println("=====================");

        victorcmoura.tweet("My tweet!");
        victorcmoura.tweet("Another tweet!");

        System.out.println("=====================");

        guiglacerda.tweet("More tweets!");

        System.out.println("=====================");

        brunapinos.tweet("Last tweet :(");
    }
}