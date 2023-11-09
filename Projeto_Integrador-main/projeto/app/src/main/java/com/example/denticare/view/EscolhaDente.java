package com.example.denticare.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.denticare.R;

public class EscolhaDente extends AppCompatActivity {

    private Button btVoltar;
    private Button btContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha_dente);

        NavigationUtil.hideNavigation(this);

        btContinuar = findViewById(R.id.btContinuar);
        btVoltar = findViewById(R.id.btVoltar);

        btContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DescricaoConsulta.showCustomDialog(EscolhaDente.this, new DescricaoConsulta.CustomDialogListener() {
                    @Override
                    public void onNegativeButtonClick() {

                    }
                });
            }
        });

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DescricaoConsulta.showCustomDialog(EscolhaDente.this, new DescricaoConsulta.CustomDialogListener() {
                    @Override
                    public void onNegativeButtonClick() {

                    }
                });
            }
        });

    }
}