package com.fauziy.biomastery_evakuasi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class soal3 extends AppCompatActivity {

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal3);

        int currentScore = MyApp.getScore();
        TextView scoreTextView = findViewById(R.id.score);
        scoreTextView.setText("Score: " + currentScore);

        Button jawabanA = findViewById(R.id.jawabanA);
        jawabanA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showProgressDialog();
                MyApp.incrementScore(100);
                Intent intent = new Intent(soal3.this, jawaban_benar3.class);
                startActivity(intent);
            }
        });

        Button jawabanB = findViewById(R.id.jawabanB);
        jawabanB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showProgressDialog();
                MyApp.incrementScore(0);
                Intent intent = new Intent(soal3.this, jawaban_salah3.class);
                startActivity(intent);
            }
        });

        Button jawabanC = findViewById(R.id.jawabanC);
        jawabanC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showProgressDialog();
                MyApp.incrementScore(0);
                Intent intent = new Intent(soal3.this, jawaban_salah3.class);
                startActivity(intent);
            }
        });

        Button jawabanD = findViewById(R.id.jawabanD);
        jawabanD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showProgressDialog();
                MyApp.incrementScore(0);
                Intent intent = new Intent(soal3.this, jawaban_salah3.class);
                startActivity(intent);
            }
        });

        Button jawabanE = findViewById(R.id.jawabanE);
        jawabanE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showProgressDialog();
                MyApp.incrementScore(0);
                Intent intent = new Intent(soal3.this, jawaban_salah3.class);
                startActivity(intent);
            }
        });
    }

    private void showProgressDialog() {
        progressDialog = ProgressDialog.show(this, "Loading", "Harap tunggu...", true);
    }

    private void hideProgressDialog() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        hideProgressDialog();
    }
}