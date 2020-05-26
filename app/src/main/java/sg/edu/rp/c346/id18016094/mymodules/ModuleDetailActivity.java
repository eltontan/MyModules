package sg.edu.rp.c346.id18016094.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        tvAnswer = findViewById(R.id.textViewMod);


        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("ModuleCode");
        String name = intentReceived.getStringExtra("ModuleName");
        int year = intentReceived.getIntExtra("Year", 0);
        int sem = intentReceived.getIntExtra("Sem", 0);
        int modCredit = intentReceived.getIntExtra("ModuleCredit", 0);
        String venue = intentReceived.getStringExtra("Venue");


        tvAnswer.setText("Module Code: " + code + "\n" + "Module Name: " + name + "\n" + "Academic Year: " + year + "\n" +
                "Semester: " +  sem + "\n" + "Module Credit: " + modCredit + "\n" + "Venue: " + venue);
    }
}
