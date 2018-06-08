package zero.azkar;
/**
 * Hiba Sanwar
 */
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Main extends AppCompatActivity {

    // تعريف الازرار الثلاثة في الواجهة الرئيسية من نوع صورة
    ImageView IM1,IM2,IM3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        IM1 = findViewById(R.id.imageView1);
        IM2 = findViewById(R.id.imageView2);
        IM3 = findViewById(R.id.imageView3);

        IM1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Main.this,Page1.class);
                startActivity(i1);
            }
        });
        IM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Main.this,Page2.class);
                startActivity(i2);
            }
        });
        IM3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        Main.this);
                builder.setTitle("إغلاق التطبيق");
                builder.setMessage("هل متأكد من خروج من التطبيق :(");
                builder.setPositiveButton("نعم",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                finish();

                            }
                        });
                builder.setNegativeButton("لا",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {

                            }
                        });
                builder.show();
            }
        });



    }
}
