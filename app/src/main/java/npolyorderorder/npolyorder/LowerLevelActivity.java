package npolyorderorder.npolyorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LowerLevelActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lower_level);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(Html.fromHtml("<font color='#FFFFFF'>Lower Level </font>"));
        setSupportActionBar(toolbar);

        button = (Button) findViewById(R.id.selectitems);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LowerLevelActivity.this, "Saving into database..", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
