package org.techtown.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText ID;
    EditText PW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.button1);
        ID = (EditText) findViewById(R.id.editText2);
        PW = (EditText) findViewById(R.id.editText3);



            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ID.getText().toString().length() == 0 || PW.getText().toString().length() == 0) {
                        Toast.makeText(getApplicationContext(), "Type Login Information", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Intent intent = new Intent(
                                getApplicationContext(),
                                MenuActivity.class);
                        startActivity(intent);
                    }
                }
            });

    }
}
