package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_4 extends AppCompatActivity implements View.OnClickListener{

    Button ngehe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        ngehe = (Button) findViewById(R.id.ngehe);
        ngehe.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ngehe:
                Intent explicit = new Intent(Activity_4.this, Activity5.class);
                startActivity(explicit);
                break;

        }
    }

}
