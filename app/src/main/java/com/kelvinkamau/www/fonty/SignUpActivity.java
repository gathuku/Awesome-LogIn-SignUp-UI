package com.kelvinkamau.www.fonty;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView text1, text2, terms;
        EditText uName, password, email;
        Button signup;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);

        Typeface prodReg = Typeface.createFromAsset(getAssets(), "fonts/ProductRegular.ttf");

        uName = (EditText)findViewById(R.id.uName);
        uName.setTypeface(prodReg);

        password = (EditText)findViewById(R.id.password);
        password.setTypeface(prodReg);

        email = (EditText)findViewById(R.id.email);
        email.setTypeface(prodReg);

        signup = (Button) findViewById(R.id.button2);
        signup.setTypeface(prodReg);

        text1.setTypeface(prodReg);
        text2.setTypeface(prodReg);

        terms = (TextView)findViewById(R.id.logintext) ;
        terms.setTypeface(prodReg);
        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUpActivity.this, "Read Terms & Conditions First", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
