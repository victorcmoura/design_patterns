public class Main {
    public static void main(String[] args) {
        BookInterface bookOne = new BookInterface("Without you there's no us", "My Time with the Sons of North Korea's Elite", "https://www.amazon.com/Without-You-There-No-Us/dp/0307720659/");
        BookInterface bookTwo = new BookInterface("Design Patterns", "Elements of Reusable Object-Oriented Software", "https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612/");

        ArtistInterface artistOne = new ArtistInterface("Owl City", "With humble small town beginnings in Owatonna, MN, Owl City (aka Adam Young) remains an avant-garde hitmaker in his own right", "https://www.youtube.com/channel/UCyo4FFY5_6v_ZzPl-Fq6FZw");
        ArtistInterface artistTwo = new ArtistInterface("Milky Chance", "The Kassel, Germany duo met in an 'Advanced Music Course' at the start of eleventh grade, and they creatively gelled right off the bat", "https://www.youtube.com/channel/UCy-ez61m5LdG3FQVr-4Crcw");

        LongView longView = new LongView(artistOne);
        ShortView shortView = new ShortView(artistOne);

        System.out.println("========================");
        longView.renderView();
        longView.setResource(artistTwo);
        shortView.renderView();
        shortView.setResource(artistTwo);
        System.out.println("========================");
        longView.renderView();
        longView.setResource(bookOne);
        shortView.renderView();
        shortView.setResource(bookOne);
        System.out.println("========================");
        longView.renderView();
        longView.setResource(bookTwo);
        shortView.renderView();
        shortView.setResource(bookTwo);
        System.out.println("========================");
        longView.renderView();
        shortView.renderView();
        System.out.println("========================");

    }
}