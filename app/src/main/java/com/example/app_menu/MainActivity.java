package com.example.app_menu;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private Button btnShow;
private Spinner spnDrinks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnShow=findViewById(R.id.btnShow);
        spnDrinks=findViewById(R.id.spnDrinks);
        bindSpinner();

    }
    private void bindSpinner(){
        DrinkMockupDA da=new DrinkMockupDA();
        String[] arr=da.getDrinkTypes();
        ArrayAdapter<String> spnAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arr);
        spnDrinks.setAdapter(spnAdapter);
    }
}