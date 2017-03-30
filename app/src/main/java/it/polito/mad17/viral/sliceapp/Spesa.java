package it.polito.mad17.viral.sliceapp;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Kalos on 25/03/2017.
 *
 */

public class Spesa {

    private String data_acquisto;
    private String motivo;
    private String luogo;
    private Persona acquirente;
    private Soldi costo;
    private SharingPolicy policy_scelta;
    private ArrayList<Categoria> categorie= new ArrayList<Categoria>();
    private String comments;
    private HashMap<Persona,Contestazione> contestation = new HashMap<Persona,Contestazione>(); // una spesa fino a quando è contestata da almeno 1 utente non è valida -> con una HashMap ho tutte le contestationi salvate
                                                                                                // e fino a quando non muoiono la spesa non è valida
    //public Attachment PDF;
    //public Attachment PHOTO; //Quando scopriremo come si fa le attiviamo
    //





}
