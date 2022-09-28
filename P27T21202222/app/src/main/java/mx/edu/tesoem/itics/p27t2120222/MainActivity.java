package mx.edu.tesoem.itics.p27t2120222;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btncalcula;
    EditText txtnum1, txtnum2;
    TextView lblresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblresult = findViewById(R.id.lblresult);
        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);

        btncalcula = findViewById(R.id.btncalcula);
                btncalcula.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int num1, num2;
                        num1 = Integer.parseInt(txtnum1.getText().toString());
                        num2 = Integer.parseInt(txtnum2.getText().toString());

                        lblresult.setText(String.valueOf(num1+num2));
                    }
                });
    }
}