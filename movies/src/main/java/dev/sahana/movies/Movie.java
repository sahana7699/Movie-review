package dev.sahana.movies;

//import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviewIds;
    @Transient
    private List<Review> reviews;

    //Default constructor
    public Movie(){}

    //Parameterized Constructor
    public Movie(ObjectId id, String imdbId, String title, String releaseDate, String trailerLink, String poster, List<String> genres,
                 List<String> backdrops, List<Review> reviewIds) {
        this.id = id;
        this.imdbId = imdbId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.genres = genres;
        this.backdrops = backdrops;
        this.reviewIds = reviewIds;
    }

    //Getters
    public ObjectId getId() {
        return id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public String getPoster() {
        return poster;
    }

    public List<String> getGenres() {
        return genres;
    }

    public List<String> getBackdrops() {
        return backdrops;
    }

    public List<Review> getReviewIds() {
        return reviewIds;
    }

    public List<Review> getReviews(){
        return reviews;
    }

    // Setters
    public void setId(ObjectId id) {
        this.id = id;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public void setBackdrops(List<String> backdrops) {
        this.backdrops = backdrops;
    }

    public void setReviewIds(List<Review> reviewIds) {
        this.reviewIds = reviewIds;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews=reviews;
    }

    // toString() for debugging
    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", imdbId='" + imdbId + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", trailerLink='" + trailerLink + '\'' +
                ", poster='" + poster + '\'' +
                ", genres=" + genres +
                ", backdrops=" + backdrops +
                ", reviewIds=" + reviewIds +
                '}';
    }
}
