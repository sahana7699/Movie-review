package dev.sahana.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

//    public List<Movie> allMovies() {
//        List<Movie> movies = movieRepository.findAll();
//
//        // Fetch and attach reviews for each movie
//        for (Movie movie : movies) {
//            List<Review> reviews = reviewRepository.findByMovieId(movie.getId());
//            movie.setReviewIds(reviews);  // Ensure Movie.java has a setter
//        }
//
//        return movies;
//    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }

}
