package com.example.antraspraktinisdarbas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.antraspraktinisdarbas.utils.TextCounter;

public class MainActivity extends AppCompatActivity {

    private Spinner spCountingOptions;
    private EditText edMain;
    private Button btnCount;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvResult = findViewById(R.id.tvResult);
        this.btnCount = findViewById(R.id.btnCount);
        this.edMain = findViewById(R.id.edMain);
        this.spCountingOptions = findViewById(R.id.spCountingOptions);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.options_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spCountingOptions.setAdapter(adapter);


        btnCount.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String userInput = edMain.getText().toString();
                String selectedOption = spCountingOptions.getSelectedItem().toString();

                if(edMain.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), R.string.empty_text, Toast.LENGTH_SHORT).show();
                } else if (selectedOption.equalsIgnoreCase(getResources().getString(R.string.chars_selection))) {
                    tvResult.setText(getString(R.string.chars_selection) + ": " + TextCounter.getCharsCount(userInput));
                } else if (selectedOption.equalsIgnoreCase(getResources().getString(R.string.words_selection))) {
                    tvResult.setText(getString(R.string.words_selection) + ": " + TextCounter.getWordsCount(userInput));
                }
            }
            }
        );
    }
}