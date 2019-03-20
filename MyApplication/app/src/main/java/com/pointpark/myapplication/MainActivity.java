package com.pointpark.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnSubmit;
    private TextView txtView1;
    private EditText aEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newlayout);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        txtView1 = (TextView) findViewById(R.id.txtView1);
        aEditText = (EditText) findViewById(R.id.aEditText);

        btnSubmit.setText(R.string.button_name);
        btnSubmit.setTextColor(Color.MAGENTA);

       /* btnSubmit.setOnClickListener(new View.onClickListener(){
            @Override
            public void onClick(View v){
                txtView1.setVisibility(View.VISIBLE);
                txtView1.setText(R.string.show_text);
            }

        });
*/
    }

    public void ShowMeText(View view) {

        String InputText;
        InputText = aEditText.getText().toString();
        txtView1.setVisibility(View.VISIBLE);
        txtView1.setText("Hello " + InputText);
    }
}
