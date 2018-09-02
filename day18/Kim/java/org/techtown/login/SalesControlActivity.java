package org.techtown.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SalesControlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales_control);

        Button toLogin = (Button) findViewById(R.id.sales_toLogin_button);
        Button toMenu = (Button) findViewById(R.id.sales_toMenu_button);

        toMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        MenuActivity.class
                );
                startActivity(intent);
            }
        });
        toLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        MainActivity.class
                );
                startActivity(intent);
            }
        });

        String button_name = getIntent().getStringExtra("button_name");
        Toast.makeText(this, button_name, Toast.LENGTH_LONG).show();
    }
}
