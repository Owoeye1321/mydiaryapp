package com.tobiloba.mydiary;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter {
    //To reference the activity
    private Activity context;

    //To reference the Content
    private String[] contentArray;

    //To reference the date
    private  String[] dateArray;


    public ListAdapter( Activity context, String[] contentArray, String[] dateArray) {
        super(context,R.layout.each_row,contentArray);
        this.context = context;
        this.contentArray = contentArray;
        this.dateArray = dateArray;

    }
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater =  context.getLayoutInflater();
        @SuppressLint({"InflateParams", "ViewHolder"}) View rowView = inflater.inflate(R.layout.each_row,null,true);

        //To reference the view in the layout
        TextView content = rowView.findViewById(R.id.content);
        TextView date = rowView.findViewById(R.id.date);

        //To set the text olf the various ide view
        content.setText(contentArray[position]);
        date.setText(dateArray[position]);
        return  rowView;

    }
}
