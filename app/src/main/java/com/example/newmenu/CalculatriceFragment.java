package com.example.newmenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CalculatriceFragment extends Fragment {

    EditText et1, et2;
    TextView tvRasultat;
    Button btnPlus, btnMoins, btnMulti, btnDiv, btnAuCarre, btnAuCube, btnVider;


    public CalculatriceFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calculatrice, container, false);
        et1 = (EditText) view.findViewById(R.id.et1);
        et2 = (EditText) view.findViewById(R.id.et2);
        btnPlus = (Button) view.findViewById(R.id.btnPlus);
        btnMoins = (Button) view.findViewById(R.id.btnMoins);
        btnMulti = (Button) view.findViewById(R.id.btnMulti);
        btnDiv = (Button) view.findViewById(R.id.btnDiv);
        btnAuCarre = (Button) view.findViewById(R.id.btnAucarre);
        btnAuCube = (Button) view.findViewById(R.id.btnAucube);
        btnVider = (Button) view.findViewById(R.id.btnVider);
        tvRasultat = (TextView) view.findViewById(R.id.tvResultat);

        btnVider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
                et2.setText("");
                tvRasultat.setText("");
            }
        });

        // +
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(et1.getText().toString());
                double n2 = Double.parseDouble(et2.getText().toString());
                double res = n1 + n2;
                tvRasultat.setText(String.valueOf(res));
            }
        });

        // -
        btnMoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(et1.getText().toString());
                double n2 = Double.parseDouble(et2.getText().toString());
                double res = n1 - n2;
                tvRasultat.setText(String.valueOf(res));
            }
        });

        // x
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(et1.getText().toString());
                double n2 = Double.parseDouble(et2.getText().toString());
                double res = n1 * n2;
                tvRasultat.setText(String.valueOf(res));
            }
        });

        // /
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(et1.getText().toString());
                double n2 = Double.parseDouble(et2.getText().toString());
                double res = n1 / n2;
                tvRasultat.setText(String.valueOf(res));
            }
        });

        // ²
        btnAuCarre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(et1.getText().toString());
                double res = n1 * n1;
                tvRasultat.setText(String.valueOf(res));
            }
        });

        // ³
        btnAuCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(et1.getText().toString());
                double res = n1 * n1 * n1;
                tvRasultat.setText(String.valueOf(res));
            }
        });


        return view;
    }
}