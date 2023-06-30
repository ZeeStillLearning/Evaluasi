package com.fauziy.biomastery_evakuasi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class jawaban_salah4 extends AppCompatActivity {

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawaban_salah4);

        Button lanjut04 = findViewById(R.id.lanjut04);

        int currentScore = MyApp.getScore();
        TextView scoreTextView = findViewById(R.id.score);
        scoreTextView.setText("Score: " + currentScore);

        lanjut04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showProgressDialog();
                Intent intent = new Intent(jawaban_salah4.this, soal5.class);
                intent.putExtra("score", currentScore);
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