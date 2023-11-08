 package com.example.mymaps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Model.Place;
import Model.UserMap;

 public class MainActivity extends AppCompatActivity {
     RecyclerView rvMaps;
     List<UserMap> usermaps = generateSampleData();

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         rvMaps = findViewById(R.id.rvMaps);
         //Set layout manager on the recycler view
         LinearLayoutManager layoutManager = new LinearLayoutManager(this);
         rvMaps.setLayoutManager(layoutManager);

         //set adapter on the recycler view
         MapsAdapter adapter = new MapsAdapter(this, usermaps);
         rvMaps.setAdapter(adapter);
     }

     public List<UserMap> generateSampleData() {
         List<UserMap> userMaps = new ArrayList<>();

         userMaps.add(new UserMap(
                 "Memories from University",
                 Arrays.asList(
                         new Place("Branner Hall", "Best dorm at Stanford", 37.426, -122.163),
                         new Place("Gates CS building", "Many long nights in this basement", 37.430, -122.173),
                         new Place("Pinkberry", "First date with my wife", 37.444, -122.170)
                 )
         ));

         userMaps.add(new UserMap(
                 "January vacation planning!",
                 Arrays.asList(
                         new Place("Tokyo", "Overnight layover", 35.67, 139.65),
                         new Place("Ranchi", "Family visit + wedding!", 23.34, 85.31),
                         new Place("Singapore", "Inspired by \"Crazy Rich Asians\"", 1.35, 103.82)
                 )
         ));

         userMaps.add(new UserMap(
                 "Singapore travel itinerary",
                 Arrays.asList(
                         new Place("Gardens by the Bay", "Amazing urban nature park", 1.282, 103.864),
                         new Place("Jurong Bird Park", "Family-friendly park with many varieties of birds", 1.319, 103.706),
                         new Place("Sentosa", "Island resort with panoramic views", 1.249, 103.830),
                         new Place("Botanic Gardens", "One of the world's greatest tropical gardens", 1.3138, 103.8159)
                 )
         ));

         userMaps.add(new UserMap(
                 "My favorite places in the Midwest",
                 Arrays.asList(
                         new Place("Chicago", "Urban center of the Midwest, the \"Windy City\"", 41.878, -87.630),
                         new Place("Rochester, Michigan", "The best of Detroit suburbia", 42.681, -83.134),
                         new Place("Mackinaw City", "The entrance into the Upper Peninsula", 45.777, -84.727),
                         new Place("Michigan State University", "Home to the Spartans", 42.701, -84.482),
                         new Place("University of Michigan", "Home to the Wolverines", 42.278, -83.738)
                 )
         ));

         userMaps.add(new UserMap(
                 "Restaurants to try",
                 Arrays.asList(
                         new Place("Champ's Diner", "Retro diner in Brooklyn", 40.709, -73.941),
                         new Place("Althea", "Chicago upscale dining with an amazing view", 41.895, -87.625),
                         new Place("Shizen", "Elegant sushi in San Francisco", 37.768, -122.422),
                         new Place("Citizen Eatery", "Bright cafe in Austin with a pink rabbit", 30.322, -97.739),
                         new Place("Kati Thai", "Authentic Portland Thai food, served with love", 45.505, -122.635)
                 )
         ));

         return userMaps;
     }
 }