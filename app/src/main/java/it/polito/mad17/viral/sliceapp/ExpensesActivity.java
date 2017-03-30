package it.polito.mad17.viral.sliceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ExpensesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenses);

        ArrayList<Spesa> lista_spese = new ArrayList<Spesa>();

        Soldi soldi1 = new Soldi(24.50, "EUR");
        Soldi soldi2 = new Soldi(56.80, "EUR");
        Soldi soldi3 = new Soldi(18.30, "EUR");
        Spesa s1 = new Spesa(null, "Food", null, null, soldi1, null, null, null, null);
        Spesa s2 = new Spesa(null, "Light bill", null, null, soldi2, null, null, null, null);
        Spesa s3 = new Spesa(null, "Water bill", null, null, soldi3, null, null, null, null);
        Spesa s4 = new Spesa(null, "Food", null, null, soldi1, null, null, null, null);
        Spesa s5 = new Spesa(null, "Food", null, null, soldi1, null, null, null, null);
        Spesa s6 = new Spesa(null, "Food", null, null, soldi1, null, null, null, null);
        Spesa s7 = new Spesa(null, "Food", null, null, soldi1, null, null, null, null);
        Spesa s8 = new Spesa(null, "Food", null, null, soldi1, null, null, null, null);
        Spesa s9 = new Spesa(null, "Food", null, null, soldi1, null, null, null, null);
        Spesa s10 = new Spesa(null, "Food", null, null, soldi1, null, null, null, null);
        Spesa s11 = new Spesa(null, "Food", null, null, soldi1, null, null, null, null);
        Spesa s12 = new Spesa(null, "Food", null, null, soldi1, null, null, null, null);
        Spesa s13 = new Spesa(null, "Food", null, null, soldi1, null, null, null, null);
        Spesa s14 = new Spesa(null, "Food", null, null, soldi1, null, null, null, null);
        Spesa s15 = new Spesa(null, "Food", null, null, soldi1, null, null, null, null);
        Spesa s16 = new Spesa(null, "Food", null, null, soldi1, null, null, null, null);

        lista_spese.add(s1);
        lista_spese.add(s2);
        lista_spese.add(s3);
        lista_spese.add(s4);
        lista_spese.add(s5);
        lista_spese.add(s6);
        lista_spese.add(s7);
        lista_spese.add(s8);
        lista_spese.add(s9);
        lista_spese.add(s10);
        lista_spese.add(s11);
        lista_spese.add(s12);
        lista_spese.add(s13);
        lista_spese.add(s14);
        lista_spese.add(s15);
        lista_spese.add(s16);

        final ListView mlist = (ListView) findViewById(R.id.listView2);

        final ExpensesAdapter adapter = new ExpensesAdapter(ExpensesActivity.this, R.layout.listview_expense_row, lista_spese);

        mlist.setAdapter(adapter);

        ImageView addExpenseButton = (ImageView)findViewById(R.id.addExpense);
        addExpenseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(ExpenseActivity.this, addExpenseActivity.class);
                //ExpenseActivity.this.startActivity(intent);

            }
        });

    }
}
