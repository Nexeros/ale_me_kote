import java.util.Arrays;
import java.util.Objects;

public class MusicAlbum {
    String title;
    String artist;
    double[] ratings;
    public MusicAlbum(String title, String artist, double[] ratings) {
        this.title = title;
        this.artist = artist;
        this.ratings = ratings;
    }

    public void addRate(double rating) {
        double[] newRatings = new double[ratings.length + 1];
        System.arraycopy(ratings, 0, newRatings, 0, ratings.length);
        newRatings[ratings.length] = rating;
        this.ratings = newRatings;
    }

    public void deleteRate(double rating) {
        double[] newRatings = new double[ratings.length - 1];
        int i = 0, j = 0;
        while (i < ratings.length && j < newRatings.length) {
            if (ratings[i] != rating) {
                newRatings[j] = ratings[i];
                i++; j++;
            }
            i++;
        }
        this.ratings = newRatings;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double[] getRatings() {
        return ratings;
    }

    public void setRatings(double[] ratings) {
        this.ratings = ratings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicAlbum that = (MusicAlbum) o;
        return Objects.equals(title, that.title) && Objects.equals(artist, that.artist) && Objects.deepEquals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, Arrays.hashCode(ratings));
    }

    @Override
    public String toString() {
        return "MusicAlbum{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", ratings=" + Arrays.toString(ratings) +
                '}';
    }
}
