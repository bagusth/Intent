package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



    public class Activity2 extends AppCompatActivity {

        private Button aweu;

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_2);
            aweu = (Button)findViewById(R.id.aweu);
            aweu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (view.getId()) {
                        case R.id.aweu:
                            Intent explicit = new Intent(Activity2.this, Activity3.class);
                            startActivity(explicit);
                            break;

                    }
                }
            });
        }
    }

