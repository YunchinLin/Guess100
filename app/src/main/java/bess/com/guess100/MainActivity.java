package bess.com.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int r = new Random().nextInt(100)+1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Secret = (TextView)findViewById(R.id.secret);
        Secret.setText(Integer.toString(r));
    }

    public void findViews(View view){
        TextView Secret = (TextView)findViewById(R.id.secret);
        TextView Info = (TextView)findViewById(R.id.info);
        EditText Number = (EditText)findViewById(R.id.number);
        Button Send = (Button)findViewById(R.id.send);
        int n = Integer.parseInt(Number.getText().toString());
        if(n > 1 && n < r){
            new AlertDialog.Builder(this)
                    .setMessage(n+" to 100")
                    .setPositiveButton("OK", null)
                    .show();
        }else if(n > r && n < 100){
            new AlertDialog.Builder(this)
                    .setMessage("1 to"+n)
                    .setPositiveButton("OK", null)
                    .show();
        }else{
            new AlertDialog.Builder(this)
                    .setMessage("猜對了")
                    .setPositiveButton("OK", null)
                    .show();
        }
    }
}
