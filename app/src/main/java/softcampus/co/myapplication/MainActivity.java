package softcampus.co.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView; //바텀 네비게이션 뷰
    private FragmentManager fm;
    private FragmentTransaction ft;
    Frag1 frag1_home;
    Frag2 frag2_mypage;
    FrameLayout main_frame;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1_home = new Frag1();
        frag2_mypage = new Frag2();
        main_frame = findViewById(R.id.main_frame);
        toolbar = findViewById(R.id.toolbar);
        

        bottomNavigationView = findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        setFrag(0);
                        break;
                    case R.id.action_mypage:
                        setFrag(1);
                        break;
                }
                return true;
            }
        });

        setFrag(0); //첫 프래그먼트 화면
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    //프래그먼트 교체가 일어나는 실행문
    private void setFrag(int n) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n) {
            case 0:
                ft.replace(R.id.main_frame, frag1_home);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame, frag2_mypage);
                ft.commit();
                break;
        }
    }
}