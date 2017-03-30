package it.polito.mad17.viral.sliceapp;


import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.util.LruCache;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class List_Pager_Act extends AppCompatActivity {

    HashMap<String,Gruppo> gruppi = new HashMap<String, Gruppo>();
    int cacheSize= 1024 * 1024 * 4;
    LruCache<String, Bitmap> BitmapCache = new LruCache<String,Bitmap>(cacheSize);

    private Gruppo a= new Gruppo("Gruppo Vacanze A",this);
    private Gruppo b= new Gruppo("Gruppo Vacanze B",this);
    private Gruppo c= new Gruppo("Gruppo Vacanze C",this);
    private Gruppo d= new Gruppo("Gruppo Vacanze D",this);
    private Gruppo e= new Gruppo("Gruppo Vacanze E",this);
    private Gruppo f= new Gruppo("Gruppo Vacanze F",this);
    private Gruppo g= new Gruppo("Gruppo Vacanze G",this);
    private Gruppo h= new Gruppo("Gruppo Vacanze H",this);
    private Gruppo i= new Gruppo("Gruppo Vacanze I",this);
    private Gruppo l= new Gruppo("Gruppo Vacanze L",this);
    private Gruppo m= new Gruppo("Gruppo Vacanze M",this);
    private Gruppo n= new Gruppo("Gruppo Vacanze N",this);
    private Gruppo o= new Gruppo("Gruppo Vacanze O",this);
    private Gruppo p= new Gruppo("Gruppo Vacanze P",this);
    private Gruppo q= new Gruppo("Gruppo Vacanze Q",this);
    private Gruppo r= new Gruppo("Gruppo Vacanze R",this);
    private Gruppo s= new Gruppo("Gruppo Vacanze S",this);
    private Gruppo t= new Gruppo("Gruppo Vacanze T",this);
    private Gruppo u= new Gruppo("Gruppo Vacanze U",this);

    private long number= 3934798759L;
    private Persona p1 = new Persona("Kalos","17/10/1992","Calogero","Carrabbotta","12345",number);
    private Persona p2 = new Persona("Abdel","18/10/1992","Abdel","Carrabbotta","12345",number);
    private Persona p3 = new Persona("Giuseppe","19/10/1992","Giuseppe","Carrabbotta","12345",number);
    private Persona p4 = new Persona("Bruno","20/10/1992","Bruno","Carrabbotta","12345",number);
    private Persona p5 = new Persona("Anna","21/10/1992","Anna","Carrabbotta","12345",number);
    private Persona p6 = new Persona("Pontra","22/10/1992","Pontra","Carrabbotta","12345",number);
    private Persona p7 = new Persona("Alle","23/10/1992","Alle","Carrabbotta","12345",number);


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a.addPersona(p1.getUsername(),p1);
        b.addPersona(p2.getUsername(),p2);
        c.addPersona(p3.getUsername(),p3);
        a.addPersona(p4.getUsername(),p4);
        c.addPersona(p5.getUsername(),p5);
        c.addPersona(p6.getUsername(),p6);
        b.addPersona(p7.getUsername(),p7);



        b.setImg(R.drawable.default_img);
        b.setImg(R.drawable.img1);
        c.setImg(R.drawable.img2);
        a.setImg(R.drawable.img3);
        t.setImg(R.drawable.img3);
        final ArrayList<Gruppo> lista_gruppi=new ArrayList<Gruppo>();

        lista_gruppi.add(a);
        lista_gruppi.add(b);
        lista_gruppi.add(c);
        lista_gruppi.add(d);
        lista_gruppi.add(e);
        lista_gruppi.add(f);
        lista_gruppi.add(g);
        lista_gruppi.add(h);
        lista_gruppi.add(i);
        lista_gruppi.add(l);
        lista_gruppi.add(m);
        lista_gruppi.add(n);
        lista_gruppi.add(o);
        lista_gruppi.add(p);
        lista_gruppi.add(q);
        lista_gruppi.add(r);
        lista_gruppi.add(s);
        lista_gruppi.add(t);
        lista_gruppi.add(u);
       // PROVA PROVA W LA FIGA

        final ListView mylist = (ListView) findViewById(R.id.listView1);

        final GroupAdapter adapter = new GroupAdapter(this, R.layout.listview_group_row, lista_gruppi,BitmapCache);

        // inietto i dati
        mylist.setAdapter(adapter);







    }


}
