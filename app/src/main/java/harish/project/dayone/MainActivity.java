package harish.project.dayone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //1+1=2
    int a,b,c=0;
    EditText editText1,editText2;
    TextView textViewres,textViewsub,textViewmul,textViewdiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.num1);
        editText2=findViewById(R.id.num2);
        textViewres=findViewById(R.id.Tvresult);
        textViewsub=findViewById(R.id.Tvresult1);
        textViewmul=findViewById(R.id.Tvresult2);
        textViewdiv=findViewById(R.id.Tvresult3);

        textViewdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a= Integer.parseInt(editText1.getText().toString());
                b= Integer.parseInt(editText2.getText().toString());
                c=a/b;
                Toast.makeText(MainActivity.this, "DIV :: "+c, Toast.LENGTH_SHORT).show();
            }
        });

        textViewmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a= Integer.parseInt(editText1.getText().toString());
                b= Integer.parseInt(editText2.getText().toString());
                c=a*b;
                Toast.makeText(MainActivity.this, "MUL :: "+c, Toast.LENGTH_SHORT).show();
            }
        });

        textViewsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a= Integer.parseInt(editText1.getText().toString());
                b= Integer.parseInt(editText2.getText().toString());
                c=a-b;
                Toast.makeText(MainActivity.this, "SUB :: "+c, Toast.LENGTH_SHORT).show();
            }
        });



        textViewres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= Integer.parseInt(editText1.getText().toString());
                b= Integer.parseInt(editText2.getText().toString());
                c=a+b;

                Toast.makeText(MainActivity.this, "SUM :: "+c, Toast.LENGTH_SHORT).show();
            }
        });



    }
}