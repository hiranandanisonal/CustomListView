package com.example.a4.customlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by A4 on 11/26/2017.
 */

public class CustomAdapter extends ArrayAdapter   {

    data[] objects=new data[20];




    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        convertView=inflater.inflate(R.layout.row,parent, false);



        holder h=new holder(convertView);

        Log.i("DDD",this.getItem(position));
        h.textView1.setText(objects[position].getS().toString());   // Error
        h.imageView1.setImageResource(objects[position].getI());

        return convertView;
    }





    public CustomAdapter(Context context, int resource, Object[] objects) {
        super(context, resource, objects);




    }



    class holder
    {
        TextView textView1;
        ImageView imageView1;

        holder(View view)
        {
            textView1=(TextView)view.findViewById(R.id.textView);
            imageView1=(ImageView)view.findViewById(R.id.imageView);

        }

    }

}
