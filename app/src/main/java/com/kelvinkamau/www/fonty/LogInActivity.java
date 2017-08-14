package com.kelvinkamau.www.fonty;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView text1, text2, forgotpass, text4;
        EditText uName, password;
        Button login;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        Typeface prodReg = Typeface.createFromAsset(getAssets(),"fonts/ProductRegular.ttf");

        text1 = (TextView)findViewById(R.id.text1);
        text1.setTypeface(prodReg);

        text2 = (TextView)findViewById(R.id.text2);
        text2.setTypeface(prodReg);

        uName = (EditText)findViewById(R.id.uName);
        uName.setTypeface(prodReg);

        password = (EditText)findViewById(R.id.password);
        password.setTypeface(prodReg);

        login = (Button)findViewById(R.id.button2);
        login.setTypeface(prodReg);

        forgotpass = (TextView)findViewById(R.id.forgotpass);
        forgotpass.setTypeface(prodReg);

        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LogInActivity.this,"Reset Password Activity Here!",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
