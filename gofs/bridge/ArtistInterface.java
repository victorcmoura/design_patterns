public class ArtistInterface implements ResourceInterface {
    private String name;
    private String bio;
    private String youtubeChannelLink;

    public ArtistInterface(String name, String bio, String youtubeChannelLink) {
        this.name = name;
        this.bio = bio;
        this.youtubeChannelLink = youtubeChannelLink;
    }

    public String snippet() {
        return this.bio;
    }

    public String title() {
        return this.name;
    }

    public String url() {
        return this.youtubeChannelLink;
    }
}