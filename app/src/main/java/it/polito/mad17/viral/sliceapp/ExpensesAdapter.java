package it.polito.mad17.viral.sliceapp;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by abdel on 28/03/2017.
 */

public class ExpensesAdapter extends ArrayAdapter<Spesa> {

    private Context context;
    private int layoutResourceId;
    private ArrayList<Spesa> data = null;

    public ExpensesAdapter(Context context, int layoutResourceId, ArrayList<Spesa> objects) {
        super(context, layoutResourceId, objects);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = objects;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Spesa s = data.get(position);

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layoutResourceId, null);
        }

        ImageView itemIcon = (ImageView) convertView.findViewById(R.id.expIcon);

        TextView itemTitle = (TextView) convertView.findViewById(R.id.expName);
        itemTitle.setText(s.getDescription());

        TextView itemPrice = (TextView) convertView.findViewById(R.id.expPrice);
        itemPrice.setText(Double.toString(s.getPrice().getValore()));

        return convertView;
    }
}

