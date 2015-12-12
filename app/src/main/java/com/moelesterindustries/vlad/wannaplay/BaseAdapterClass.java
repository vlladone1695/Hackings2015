package com.moelesterindustries.vlad.wannaplay;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vlad on 12/10/2015.
 */
public class BaseAdapterClass extends BaseAdapter {

    private Activity activity;
    private ArrayList timestamp;
    private ArrayList sport;
    private ArrayList team_name;
    private ArrayList medium_age;
    private ArrayList city;
    private ArrayList country;
    private ArrayList event_date;
    private ArrayList event_date2;


    public BaseAdapterClass(Activity a,ArrayList timestamp,ArrayList sport, ArrayList team_name, ArrayList medium_age, ArrayList city, ArrayList country, ArrayList event_date,ArrayList event_date2)
    {
        this.activity = a;
        this.timestamp = timestamp;
        this.sport = sport;
        this.team_name = team_name;
        this.medium_age = medium_age;
        this.city = city;
        this.country = country;
        this.event_date = event_date;
        this.event_date2 = event_date2;

System.out.println("APELATA");

    }
    @Override
    public int getCount() {
        if(timestamp==null) return 0;
        return timestamp.size();
    }

    @Override
    public Object getItem(int position) {
        if(timestamp==null) return null;
        return timestamp.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if(convertView==null)
        {
            LayoutInflater inflater= activity.getLayoutInflater();
            v = inflater.inflate(R.layout.row_listitem,parent,false);
            System.out.println("CACAT");
        }


        System.out.println("AFISARE");

                TextView sport2 = (TextView) v.findViewById(R.id.sport);
                String sp = sport.get(position).toString();
                sport2.setText(sp);


        TextView team_name2 = (TextView) v.findViewById(R.id.teamname);
        String tn = team_name.get(position).toString();
        team_name2.setText(tn);

        TextView date2 = (TextView) v.findViewById(R.id.date);
        String dt = event_date.get(position).toString();
        date2.setText(dt);

        TextView medium_age2 = (TextView) v.findViewById(R.id.mediumage);
        String ma = medium_age.get(position).toString();
        medium_age2.setText(ma);

        TextView city2 = (TextView) v.findViewById(R.id.city);
        String ct = city.get(position).toString();
        city2.setText(ct);

        TextView country2 = (TextView) v.findViewById(R.id.country);
        String co = country.get(position).toString();
        country2.setText(co);

        TextView timestamp2 = (TextView) v.findViewById(R.id.times);
        String ts = timestamp.get(position).toString();
        timestamp2.setText(ts);

        TextView date22 = (TextView) v.findViewById(R.id.date2);
        String dt2 = event_date2.get(position).toString();
        date22.setText(dt2);



        return v;
    }
}
