package zero.azkar;
/**
 * Hiba Sanwar
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class Page2 extends AppCompatActivity {
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        b1 = findViewById(R.id.Button1);
        b2 = findViewById(R.id.Button2);
        b3 = findViewById(R.id.Button3);



    }
}
