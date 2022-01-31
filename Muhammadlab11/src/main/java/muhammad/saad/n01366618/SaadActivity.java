package muhammad.saad.n01366618;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;



public class SaadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saad);

        Intent intent = getIntent();
        String newTxt = intent.getStringExtra(MuhammadActivity.extxt);
        TextView ab = (TextView) findViewById(R.id.MuhammadTV3);
        ab.setText(newTxt);

    }
}