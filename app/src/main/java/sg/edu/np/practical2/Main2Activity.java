package sg.edu.np.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {
    private final static String TAG ="Main Activity 2"; //starting line
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.v(TAG, "Page 2 Load");

    }
}
