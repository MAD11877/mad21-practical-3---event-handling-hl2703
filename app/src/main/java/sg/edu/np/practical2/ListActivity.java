package sg.edu.np.practical2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {
    private final static String TAG ="List activity"; //starting line
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView image =findViewById(R.id.image);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inner class
                Log.v(TAG, "Image pressed.");
                userQuery();

            }
        });

    }

    private void userQuery() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("MADness");
        builder.setTitle("Profile");
        builder.setCancelable(false);//will not disappear when user click outside
        builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int ranNum= generateInt();
                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                intent.putExtra("num",String.valueOf(ranNum));
                Log.v(TAG, String.valueOf(ranNum));
                startActivity(intent);


            }
        });
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alert= builder.create();
        alert.show();
    }

    //Upon clicking the View button, a random integer will be generated. The MainActivity
// (created in previous practical) will be launched, and the random integer is sent over.
    private int generateInt() {
        Random ran = new Random();
        int ranVal = ran.nextInt(1000);//assign var as it will return
        return ranVal;
    }


}
