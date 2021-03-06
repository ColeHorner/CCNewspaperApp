package t.angelicafabila.thecornellianapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
//import android.widget.Toast;
import android.support.v7.widget.Toolbar;

public class Main extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add Toolbar
        Toolbar toolbar = findViewById(R.id.actionbar);
        setSupportActionBar(toolbar);

        // Spinner Widget/Dropdown
        Spinner mySpinner = findViewById(R.id.spinner_main);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(Main.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.items));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}