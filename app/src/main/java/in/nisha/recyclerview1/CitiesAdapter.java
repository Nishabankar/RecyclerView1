package in.nisha.recyclerview1;

import android.graphics.Color;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.CityViewHolder> {

    private ArrayList<String> cities;

    public CitiesAdapter(ArrayList<String>cities){
        this.cities = cities;
    }

    class CityViewHolder extends RecyclerView.ViewHolder{
        public TextView txtCity;

        public  CityViewHolder(TextView itemView){
            super(itemView);
            txtCity = (TextView) itemView;
        }
    }

    @Override
    public int getItemCount(){
        Log.e("tag","getItemCount"+cities.size());
        return cities.size();

    }
    @Nullable
    @Override
    public CityViewHolder onCreateViewHolder(@Nullable ViewGroup parent, int viewType){
        Log.e("tag","onCreateViewHolder");
        TextView txtCity = new TextView(parent.getContext());
        txtCity.setTextSize(30);
        txtCity.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        txtCity.setPadding(30,10,10,10);
        txtCity.setTextColor(Color.BLACK);

        return new CityViewHolder(txtCity);
    }




    @Override
    public void onBindViewHolder(@Nullable CityViewHolder holder,int position){
        Log.e("tag","onBinedViewHolder" +position);
        holder.txtCity.setText(cities.get(position));
    }
}


