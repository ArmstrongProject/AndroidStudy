Day18 도전 문제 05,06 풀기
======================================

--------------------------------------
# Day18
## 20180902 17:00~20:40 (2명)
### 도전 문제 05,06 풀기  
*****

# MainActivity  
```java  
package com.example.mike.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username = (EditText) findViewById(R.id.editText);
        Password = (EditText) findViewById(R.id.editText2);
//        Intent intent = new Intent(this.getIntent());
//        String data = intent.getStringExtra("name");
//        if(data != null) {
//            Toast.makeText(this, "Pushed this button = " + data, Toast.LENGTH_SHORT).show();
//        }
        Button login_button = (Button) findViewById(R.id.button);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Username.getText().toString().length() <= 0) {
                    Toast.makeText(getApplication(), "Write Username", Toast.LENGTH_SHORT).show();
                    return;
                } else if(Password.getText().toString().length() <= 0) {
                    Toast.makeText(getApplication(), "Write Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent);
            }
        });

    }
}
```  
*****
# MenuActivity  
```java  
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
```  
*****  

# CustomManager  
```java  
package com.example.mike.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProductManager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_manager);
        Button menu_button = (Button) findViewById(R.id.Pmenu);
        Button login_button = (Button) findViewById(R.id.Plogin);

        menu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(intent);
            }
        });

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
```  
