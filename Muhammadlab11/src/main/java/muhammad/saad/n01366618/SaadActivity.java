package muhammad.saad.n01366618;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

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