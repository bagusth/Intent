package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;




    public class Activity3 extends AppCompatActivity implements View.OnClickListener{

        Button ciat;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_3);
            ciat = (Button) findViewById(R.id.ciat);
            ciat.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.ciat:
                    Intent explicit = new Intent(Activity3.this, Activity_4.class);
                    startActivity(explicit);
                    break;

            }
        }

    }

