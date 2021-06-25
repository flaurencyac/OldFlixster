package com.example.flixster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.example.flixster.databinding.ActivityMovieDetailsBinding;
import com.example.flixster.models.Movie;

import org.parceler.Parcels;

import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

public class MovieDetailsActivity extends AppCompatActivity {

    Context context;
    Movie movie;

    // declare the view fields
    TextView tvTitle;
    TextView tvOverview;
    RatingBar rbVoteAverage;
    ImageView ivPoster;
    String imageURL;


    /*
        Intent intent = lsjdflaj
        intent.putExtra("movieObj", movie.getId());
        startActivity(intent);

     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // I used View Boilerplate w/ ViewBinding in order to reduce findViewById() lookups
        // replaced setContentView(R.layout.activity_movie_details); with:
        ActivityMovieDetailsBinding binding = ActivityMovieDetailsBinding.inflate(getLayoutInflater());
        // layout of activity is stored in a special property called root
        View view = binding.getRoot();
        setContentView(view);

        // Use fields (binding.title, binding.subtitle, binding.footer, etc.) to resolve view objects
        tvTitle = binding.tvTitle;
        tvOverview = binding.tvOverview;
        rbVoteAverage = binding.rbVoteAverage;
        ivPoster = binding.ivPoster;
        this.context = this;

        // unwrap the movie passed in via intent, using its simple name as a key
        movie = (Movie) Parcels.unwrap(getIntent().getParcelableExtra(Movie.class.getSimpleName()));
        Log.d("MovieDetailsActivity", String.format("Showing details for '%s'", movie.getTitle()));

        // set the title and overview
        tvTitle.setText(movie.getTitle());
        tvOverview.setText(movie.getOverview());

        // vote average is 0..10, convert to 0..5 by dividing by 2
        float voteAverage = movie.getVoteAverage().floatValue();
        rbVoteAverage.setRating(voteAverage / 2.0f);

        int radius = 25;
        int margin = 5;

        // if phone in landscape then imageUrl = back drop image
        // else in portrait then imageUrl = poster image
        if (context.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            imageURL = movie.getBackdropPath();
            Glide.with(context)
                    .load(imageURL)
                    .placeholder(R.drawable.flicks_backdrop_placeholder)
                    .transform(new CenterInside(), new RoundedCornersTransformation(radius, margin))
                    .into(ivPoster);
        } else {
            imageURL = movie.getPosterPath();
            Glide.with(context)
                    .load(imageURL)
                    .placeholder(R.drawable.flicks_movie_placeholder)
                    .transform(new CenterInside(), new RoundedCornersTransformation(radius, margin))
                    //.transform(new CenterInside(), new RoundedCorners(24))
                    .into(ivPoster);
        }

        ivPoster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // make intent in onclick method from details to trailer activities
                Intent intent = new Intent(context, MovieTrailerActivity.class);
                // package id as a string w/ putExtra() aka serialize the movie using parceler, use movieObj as key
                intent.putExtra("vidId", movie.getVideoId());
                // show the activity
                context.startActivity(intent);
            }
        });
    }

}