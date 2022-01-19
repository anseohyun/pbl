package softcampus.co.myapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    ImageView main_line;
    ImageView donation_btn;
    TextView main_name;
    TextView main_token_num;
    TextView main_mil_num;
    Button using_button;
    Button donation_button;
    TextView donation_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ImageView main_line = findViewById(R.id.main_line);
        ImageView donation_btn = findViewById(R.id.donation_btn);
        TextView main_name = findViewById(R.id.main_name);
        TextView main_grade = findViewById(R.id.main_grade);
        TextView main_token_num = findViewById(R.id.main_token_num);
        TextView main_mil_num = findViewById(R.id.main_mil_num);
        Button donation_button = findViewById(R.id.donation_button);
        TextView donation_text = findViewById(R.id.donation_text);
        Button using_button = findViewById(R.id.using_button);

        donation_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, DonationPage.class);
                startActivity(intent);
            }
        });

        using_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, UsageDetails.class);
                startActivity(intent);
            }
        });

        donation_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, DonationPage.class);
                startActivity(intent);
            }
        });



    }
}