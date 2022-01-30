/*
Name: Muhammad Saad
Student#: n01366618
section: RNA
Assignment 1
   */
//Name: Muhammad Saad
//Course: CEng-258-RNA
package muhammad.saad.n01366618;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class MuhammadActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void myToastMsg(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Muhammad Saad, wwe.com is about to launch";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url)));
        startActivity(web);
    }

    public void mySnack(View view) {
        Snackbar.make(findViewById(R.id.MuhammadLayout),
                R.string.SbarContent,
                Snackbar.LENGTH_LONG).show();
        /*The snack message disappears as soon as 2nd activity  launches, It does work appear for a split
        second, I tested it.   */
        launchActivity();
    }

    public void launchActivity() {
        Intent act = new Intent(this, SaadActivity.class);
        startActivity(act);

    }

    public void onStop(){
        super.onStop();
        Log.d(TAG,getString(R.string.LogdText));
    }


}




