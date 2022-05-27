package in.nisha.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerCities;
    private ArrayList<String> cities;
    private CitiesAdapter citiesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initCities();
        initViews();
    }
    private void initViews(){
        recyclerCities = findViewById(R.id.recyclerCities);
        recyclerCities.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        citiesAdapter = new CitiesAdapter(cities);
        recyclerCities.setAdapter(citiesAdapter);
    }
    private void initCities(){
        cities = new ArrayList<>();
        for (int i=0;i<6;i++){
            cities.add("pune"+1);
            cities.add("mumbai"+1);
            cities.add("chennai"+1);
            cities.add("kolkata"+1);



        }
    }
}