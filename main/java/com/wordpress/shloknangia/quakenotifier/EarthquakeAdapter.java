package com.wordpress.shloknangia.quakenotifier;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by SHLOK on 12-10-2016.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        //to reuse availabe list in memory
        View listitemview = convertView;
        if(listitemview == null){
            listitemview = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item,parent,false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView magnitude = (TextView)listitemview.findViewById(R.id.magnitude);
        magnitude.setText(currentEarthquake.getmMagnitude());

        TextView location = (TextView)listitemview.findViewById(R.id.location);
        location.setText(currentEarthquake.getmLocation());

        TextView date = (TextView)listitemview.findViewById(R.id.date);
        date.setText(currentEarthquake.getmDate());


        return listitemview;
    }
}
