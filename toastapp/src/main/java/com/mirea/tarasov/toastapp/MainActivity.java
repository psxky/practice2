package com.mirea.tarasov.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text = findViewById(R.id.editTextSym);
    }
    public void onClickSendNotification(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "«СТУДЕНТ № 22 ГРУППА БСБО-07-21 Количество символов - " + Text.getText().length(),
                Toast.LENGTH_SHORT);
        toast.show();
    }
}