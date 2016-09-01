package com.example.andrea.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void greet(View view)
    {
        EditText editText=  (EditText) findViewById(R.id.Name);
        String name = editText.getText().toString();
        String greeting = "Hello " + name + "!";
        Toast.makeText(getApplicationContext(), greeting, Toast.LENGTH_LONG).show();
    }
}
