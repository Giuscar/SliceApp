package it.polito.mad17.viral.sliceapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.acl.Group;
import java.util.ArrayList;

import static it.polito.mad17.viral.sliceapp.R.attr.title;
import static java.lang.Thread.sleep;
import static java.security.AccessController.getContext;


/**
 * Created by Kalos on 27/03/2017.
 */

public class GroupAdapter extends ArrayAdapter<Gruppo> {

    Context context;
    int layoutResourceId;
    ArrayList<Gruppo> data = null;
    int cacheSize = 4 * 1024 * 1024;
    LruCache cache;

    public GroupAdapter(Context context, int layoutResourceId, ArrayList<Gruppo> objects, LruCache BitmapCache) {
        super(context, layoutResourceId, objects);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.cache=BitmapCache;
        this.data = objects;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        GroupHolder holder= null;

        BitmapManager bm = new BitmapManager(context,data.get(position).getImg(),50,70);
        Bitmap b= bm.decodeSampledBitmapFromResource();



        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new GroupHolder();
            holder.imgIcon = (ImageView) row.findViewById(R.id.imgIcon);
            TextView title = (TextView)row.findViewById(R.id.groupName);

            title.setText(new Integer (b.getByteCount()).toString());
            holder.txtTitle = title;
            holder.imgIcon.setImageBitmap(b);
            cache.put(new Integer(position).toString(), b);

            row.setTag(holder);
        }
        else
        {
            holder = (GroupHolder)row.getTag();
        }

        Gruppo gruppo = data.get(position);
        holder.txtTitle.setText(new Integer (b.getByteCount()).toString());
        holder.imgIcon.setImageBitmap((Bitmap) cache.get(new Integer(position).toString()));


        return row;
    }




    static class GroupHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
    }



}
