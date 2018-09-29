package com.example.sam.samhitha;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText n1 = (EditText) findViewById(R.id.num1);
        final EditText n2 = (EditText) findViewById(R.id.num2);
        Button add =(Button) findViewById(R.id.button);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String s1= n1.getText().toString();
                final String s2= n2.getText().toString();
                int x=Integer.parseInt(s1);
                int y=Integer.parseInt(s2);
                int z=x+y;
                Toast.makeText(MainActivity.this,"sum is "+""+z+"",Toast.LENGTH_LONG).show();
            }
        });
    }
}
