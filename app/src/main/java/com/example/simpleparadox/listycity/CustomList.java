package com.example.simpleparadox.listycity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomList extends ArrayAdapter<City> {

    private ArrayList<City> cities;
    private Context context;

    public CustomList(Context context, ArrayList<City> cities){
        super(context,0, cities);
        this.cities = cities;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.content, parent,false);
        }

        City city = cities.get(position);

        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getCityName());
        provinceName.setText(city.getProvinceName());

        return view;

    }

    /**
     * This function will get the size of the list
     * @return
     */
    public int getCount() {
        return cities.size();
    }

    /**
     * This function will add a city object into the list
     * @param city
     */
    public void addCity(City city) {
        cities.add(city);
    }

    /**
     * This function will check if a city object is in the list
     * @param city
     */
    public Boolean hasCity(City city) {
        City currentCity;
        for (int i = 0; i < cities.size(); i++) {
            currentCity = cities.get(i);
            if (currentCity.getCityName() == city.getCityName()
                    && currentCity.getProvinceName() == city.getProvinceName()) {
                return true;
            }
        }

        return false;
    }

    /**
     * This function will remove a matching city object from the list
     * @param city
     */
    public void deleteCity(City city) {
        City currentCity;
        for (int i = 0; i < cities.size(); i++) {
            currentCity = cities.get(i);
            if (currentCity.getCityName() == city.getCityName()
                    && currentCity.getProvinceName() == city.getProvinceName()) {

                cities.remove(i);
                return;
            }
        }
   }
}
