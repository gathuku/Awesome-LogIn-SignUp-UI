package com.kelvinkamau.www.fonty;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView text1, text2;
        EditText uName, password;
        Button login;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        Typeface prodReg = Typeface.createFromAsset(getAssets(),"fonts/ProductRegular.ttf");
        Typeface prodBold = Typeface.createFromAsset(getAssets(),"fonts/ProductBold.ttf");

        text1 = (TextView)findViewById(R.id.text1);
        text1.setTypeface(prodBold);

        text2 = (TextView)findViewById(R.id.text2);
        text2.setTypeface(prodReg);

        uName = (EditText)findViewById(R.id.uName);
        uName.setTypeface(prodReg);

        password = (EditText)findViewById(R.id.password);
        password.setTypeface(prodReg);

        login = (Button)findViewById(R.id.button2);
        login.setTypeface(prodReg);

    }
}
