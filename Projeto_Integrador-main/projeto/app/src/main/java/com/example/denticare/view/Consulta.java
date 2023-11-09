package com.example.denticare.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.denticare.R;

public class Consulta extends AppCompatActivity {

    private LinearLayout btAgendarRecep;
    private LinearLayout btPdfRecep;
    private LinearLayout btCadFotoRecep;
    private LinearLayout btSair;
    private LinearLayout btMeusDados;
    private LinearLayout btCadClienteRecep;
    private TableLayout tableLayout;
    private Button btProximo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);

        // Chame o método para ocultar a barra de navegação
        NavigationUtil.hideNavigation(this);

        btMeusDados = findViewById(R.id.btMeusDados);
        btAgendarRecep = findViewById(R.id.btAgendarRecep);
        btPdfRecep = findViewById(R.id.btPdfRecep);
        btSair = findViewById(R.id.btSair);
        btCadFotoRecep = findViewById(R.id.btCadFotoRecep);
        btCadClienteRecep = findViewById(R.id.btCadClienteRecep);
        btProximo = findViewById(R.id.btProximo);

        tableLayout = findViewById(R.id.tableLayout);
        
        String[][] dados = {
                {"Status 1", "08:00", "Nome 1", "Tipo 1", "Data 1", "Valor 1"},
                {"Status 2", "08:30", "Nome 2", "Tipo 2", "Data 2", "Valor 2"},
                {"Status 3", "09:00", "Nome 3", "Tipo 3", "Data 3", "Valor 3"}
        };

        for (int i = 0; i < dados.length; i++) {
            TableRow row = new TableRow(this);
            TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(
                    TableRow.LayoutParams.MATCH_PARENT,
                    TableRow.LayoutParams.WRAP_CONTENT
            );
            row.setLayoutParams(layoutParams);

            for (int j = 0; j < dados[i].length; j++) {
                TextView cell = new TextView(this);
                cell.setText(dados[i][j]);
                cell.setPadding(10, 10, 10, 10);
                row.addView(cell);
            }

            tableLayout.addView(row);
        }

        btProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Consulta.this, InicialConsulta.class);
                startActivity(intent);
            }
        });
        btAgendarRecep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Consulta.this, Agenda.class);
                startActivity(intent);
            }
        });
        btPdfRecep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Consulta.this, GeraPDF.class);
                startActivity(intent);
            }
        });

        btCadFotoRecep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Consulta.this, SelClienteFoto.class);
                startActivity(intent);
            }
        });
        btSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Consulta.this, Login.class);
                startActivity(intent);
            }
        });
        btMeusDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Consulta.this, DadosDentista.class);
                startActivity(intent);
            }
        });
        btCadClienteRecep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpcaoCadUsuario.showCustomDialog(Consulta.this, new OpcaoCadUsuario.CustomDialogListener() {
                    @Override
                    public void onNegativeButtonClick() {

                    }
                });
            }
        });

    }
}