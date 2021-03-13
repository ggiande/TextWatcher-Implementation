package com.example.textwatcherexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public EditText etInput;
    public TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etInput = findViewById(R.id.etMain);
        etInput.addTextChangedListener(filterTextWatcher);
        tvOutput = findViewById(R.id.tvOutput);
    }

    TextWatcher filterTextWatcher = new TextWatcher() {
        public void afterTextChanged(Editable s) {
            String text = etInput.getText().toString();
            Log.i(TAG, etInput.getText().toString());
            if (!text.equals("")) {
                tvOutput.setText(text);
            } else {
                tvOutput.setText(R.string.EmptyTextInput);
            }
            Log.i(TAG, "Text has changed: Called afterTextChanged");
        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            Log.i(TAG, "Text has changed: Called beforeTextChanged");
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
            Log.i(TAG, "Text has changed: Called onTextChanged");
        }
    };
}