package com.example.mike.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private final int Customer = 0;
    private final int Sale = 1;
    private final int Product = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button Customer_button = (Button) findViewById(R.id.button2);
        Button Sale_button = (Button) findViewById(R.id.button3);
        Button Product_button = (Button) findViewById(R.id.button4);

        Customer_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doMainActivity(Customer);
            }
        });

        Sale_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doMainActivity(Sale);
            }
        });

        Product_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doMainActivity(Product);
            }
        });
    }

    private void doMainActivity(int menu) {
        Intent intent = null;
        switch(menu){
            case 0 :
            {
                intent = new Intent(getApplicationContext(), CustomerManager.class);
            }
                break;
            case 1 :
            {
                intent = new Intent(getApplicationContext(), SaleManager.class);
            }
            break;
            case 2 :
            {
                intent = new Intent(getApplicationContext(), ProductManager.class);
            }
            break;
        }

        if(intent != null){
            startActivity(intent);
        }
    }
}
