package com.example.painting_company;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText add,total;
    TextView t1,t2,t3;
    Button inc,dec;
    ImageView image1;
    int _counter=0;
    @SuppressLint({"CutPasteId", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=findViewById(R.id.e1);
        total=findViewById(R.id.e2);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        dec=findViewById(R.id.b1);
        inc=findViewById(R.id.b2);
        image1=findViewById(R.id.img2);
        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("src", "Increasing value..."); _counter++;
                add.setText(Integer.toString(_counter));
                total.setText(Integer.toString(100*_counter));
            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(_counter == 0) {
                    add.setText("ADD");
                }
                else{
                    Log.d("src", "Decreasing value..."); _counter--;
                    add.setText(Integer.toString(_counter));
                    total.setText(Integer.toString(_counter));
                }
            }
        });
    }
}
