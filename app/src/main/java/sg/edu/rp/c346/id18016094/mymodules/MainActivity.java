package sg.edu.rp.c346.id18016094.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.tv1);
        textView2 = findViewById(R.id.tv2);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C346");
                intent.putExtra("ModuleName", "Android Programming");
                intent.putExtra("Year", 2020);
                intent.putExtra("Sem", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "W66M");

                startActivity(intent);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C349");
                intent.putExtra("ModuleName", "iPad Programming");
                intent.putExtra("Year", 2021);
                intent.putExtra("Sem", 2);
                intent.putExtra("ModuleCredit", 8);
                intent.putExtra("Venue", "W63M");
                startActivity(intent);
            }
        });
    }
}
