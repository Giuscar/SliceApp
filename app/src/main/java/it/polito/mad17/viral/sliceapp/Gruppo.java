package it.polito.mad17.viral.sliceapp;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.media.Image;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Kalos on 25/03/2017.
 */

public class Gruppo {

        private HashMap<String, Persona> membri = new HashMap<String, Persona>();
        private Soldi totale;
        private SharingPolicy default_policy;
        private ArrayList<Spesa> spese_gruppo = new ArrayList<Spesa>();
        private String groupName;
        private int img;
        private Context ct;
        private Bitmap icon;


        public Gruppo(String groupName, Context ct){
            this.groupName=groupName;
            img= R.drawable.default_img;
            setImg(img);
            this.ct=ct;
        }


        public void addPersona(String Username, Persona p){
            membri.put(Username,p);
        }

        public String getGroupName(){
            return groupName;
        }

        public void setImg(int icon){

        img=icon;
        }

        public int getImg(){
            return img;
        }


}
