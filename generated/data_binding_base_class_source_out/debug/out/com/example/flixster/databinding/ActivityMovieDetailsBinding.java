// Generated by view binder compiler. Do not edit!
package com.example.flixster.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.example.flixster.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMovieDetailsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout RelativeLayout;

  @NonNull
  public final ImageView ivPoster;

  @NonNull
  public final ImageView ivVector;

  @NonNull
  public final RatingBar rbVoteAverage;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final TextView tvOverview;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final ViewPager2 viewPager2;

  private ActivityMovieDetailsBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout RelativeLayout, @NonNull ImageView ivPoster,
      @NonNull ImageView ivVector, @NonNull RatingBar rbVoteAverage, @NonNull TabLayout tabLayout,
      @NonNull TextView tvOverview, @NonNull TextView tvTitle, @NonNull ViewPager2 viewPager2) {
    this.rootView = rootView;
    this.RelativeLayout = RelativeLayout;
    this.ivPoster = ivPoster;
    this.ivVector = ivVector;
    this.rbVoteAverage = rbVoteAverage;
    this.tabLayout = tabLayout;
    this.tvOverview = tvOverview;
    this.tvTitle = tvTitle;
    this.viewPager2 = viewPager2;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMovieDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMovieDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_movie_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMovieDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout RelativeLayout = (RelativeLayout) rootView;

      id = R.id.ivPoster;
      ImageView ivPoster = rootView.findViewById(id);
      if (ivPoster == null) {
        break missingId;
      }

      id = R.id.ivVector;
      ImageView ivVector = rootView.findViewById(id);
      if (ivVector == null) {
        break missingId;
      }

      id = R.id.rbVoteAverage;
      RatingBar rbVoteAverage = rootView.findViewById(id);
      if (rbVoteAverage == null) {
        break missingId;
      }

      id = R.id.tabLayout;
      TabLayout tabLayout = rootView.findViewById(id);
      if (tabLayout == null) {
        break missingId;
      }

      id = R.id.tvOverview;
      TextView tvOverview = rootView.findViewById(id);
      if (tvOverview == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = rootView.findViewById(id);
      if (tvTitle == null) {
        break missingId;
      }

      id = R.id.viewPager2;
      ViewPager2 viewPager2 = rootView.findViewById(id);
      if (viewPager2 == null) {
        break missingId;
      }

      return new ActivityMovieDetailsBinding((RelativeLayout) rootView, RelativeLayout, ivPoster,
          ivVector, rbVoteAverage, tabLayout, tvOverview, tvTitle, viewPager2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
