package com.example.newmenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class ConvertorFragment extends Fragment {
    EditText etMontant;
    RadioButton rbDollar, rbEuro;
    TextView tvResultat;
    Button btnConvertir, btnVider;


    public ConvertorFragment() {
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

        View view = inflater.inflate(R.layout.fragment_convertor, container, false);
        etMontant=(EditText) view.findViewById(R.id.etMontant);
        tvResultat=(TextView) view.findViewById(R.id.tvResultat);
        rbDollar=(RadioButton) view.findViewById(R.id.rbDollar);
        rbEuro=(RadioButton) view.findViewById(R.id.rbEuro);
        btnConvertir=(Button) view.findViewById(R.id.btnConvertir);
        btnVider=(Button) view.findViewById(R.id.btnVider);

        btnVider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etMontant.setText("");
                tvResultat.setText("");
                rbDollar.setChecked(false);
                rbEuro.setChecked(false);
            }
        });

        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rbDollar.isChecked()){
                    //DOLLAR
                    float mt = Float.parseFloat(etMontant.getText().toString());
                    float res= mt*10.44f;
                    tvResultat.setText(String.valueOf(res));
                }
                else if(rbEuro.isChecked()){
                    //EURO
                    float mt = Float.parseFloat(etMontant.getText().toString());
                    float res= mt*11.05f;
                    tvResultat.setText(String.valueOf(res));
                }
                else {
                    tvResultat.setText("Aucun choix spécifié");
                }
            }
        });
        return view;
    }
}