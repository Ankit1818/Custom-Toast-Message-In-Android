package com.example.toastcustom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater li=getLayoutInflater();

                View view=li.inflate(R.layout.design, (ViewGroup) findViewById(R.id.relative));

                Toast toast=new Toast(getApplicationContext());
                toast.setDuration(toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setView(view);
                toast.show();

            }
        });
    }
}
