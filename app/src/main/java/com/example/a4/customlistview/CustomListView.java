package com.example.a4.customlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

public class CustomListView extends AppCompatActivity {


    ListView listView;
    CustomAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        data[] d;
        d = new data[20];

        for(int i=1;i<getResources().getStringArray(R.array.versions).length;i++)
        {

            d[i]=new data(getResources().getStringArray(R.array.versions)[i].toString(), getResources().getIdentifier("v"+i,"drawable",getPackageName()));

            Log.i("BBB", String.valueOf(d[i].getI()));
        }



        listView=(ListView)findViewById(R.id.listView);
        ad=new CustomAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,d);
        listView.setAdapter(ad);




    }
}
