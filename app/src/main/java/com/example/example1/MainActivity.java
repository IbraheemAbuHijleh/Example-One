package com.example.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button but;
    private Spinner sp;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but=findViewById(R.id.button);
        sp=findViewById(R.id.sep);
        txt=findViewById(R.id.txtres);



        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cat=sp.getSelectedItem().toString();

                DataBase data=new DataBase();

                ArrayList<Book> st=new ArrayList<>();

                st=data.Serche(cat);

                String str="";

                for(Book b:st){

                    str=str+b.getTitle()+"\n";
                }

                txt.setText(str);
            }
        });

    }


}