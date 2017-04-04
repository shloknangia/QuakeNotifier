package com.wordpress.shloknangia.quakenotifier;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes();
       /* earthquakes.add(new Earthquake("8.2","San Francisco","2016-02-02"));
        earthquakes.add(new Earthquake("6.4","London","2016-08-09"));
        earthquakes.add(new Earthquake("7.3","Tokyo","2016-02-22"));
        earthquakes.add(new Earthquake("4.9","Mexico City","2016-03-12"));
        earthquakes.add(new Earthquake("9.0","Moscow","2016-08-07"));
        earthquakes.add(new Earthquake("5.5","Paris","2016-05-02"));
        */


        ListView earthquakeListView = (ListView)findViewById(R.id.list);
        EarthquakeAdapter adapter = new EarthquakeAdapter(this,earthquakes);

      //  ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,earthquake);

        earthquakeListView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
