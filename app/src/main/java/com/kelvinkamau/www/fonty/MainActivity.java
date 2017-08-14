package com.kelvinkamau.www.fonty;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView texty, welcome;
        Button button, button1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface proReg = Typeface.createFromAsset(getAssets(), "fonts/ProductRegular.ttf");
        texty =(TextView)findViewById(R.id.text);
        texty.setTypeface(proReg);

        button = (Button)findViewById(R.id.button);
        button.setTypeface(proReg);

        button1 = (Button)findViewById(R.id.button1);
        button1.setTypeface(proReg);

        welcome = (TextView)findViewById(R.id.welcome);
        welcome.setTypeface(proReg);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(MainActivity.this, LogInActivity.class);
                startActivity(login);

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent signup = new Intent(MainActivity.this, SignUpActivity.class);
                 startActivity(signup);

     }
 });
    }
}
