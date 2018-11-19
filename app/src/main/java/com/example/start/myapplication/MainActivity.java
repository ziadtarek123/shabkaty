package com.example.start.myapplication;


import android.Manifest;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;




import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;



import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    public DrawerLayout mydrawer;
    public ActionBarDrawerToggle mytoggle;
    public TabLayout tabLayout = null;
    public ViewPager viewPager = null;

    private static final int Time_limt = 1500;
    private static long backPress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        //perrmision

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new String[]{Manifest.permission.CALL_PHONE},1);

        }


        //tabs
//----//
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

//settings the tab titels

        tabLayout.addTab(tabLayout.newTab().setText("Vodafone"));
        tabLayout.addTab(tabLayout.newTab().setText("Etisalat"));
        tabLayout.addTab(tabLayout.newTab().setText("Orange"));
        tabLayout.addTab(tabLayout.newTab().setText("We"));

//setup the view pager
        final PagerAdapter adapter = new com.example.start.myapplication.adadapters.PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



//navigation drawer
//-----------------
        mydrawer = (DrawerLayout) findViewById(R.id.myDrawer);
        mytoggle = new ActionBarDrawerToggle(this, mydrawer, R.string.open, R.string.closed);
        mydrawer.addDrawerListener(mytoggle);
        mytoggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mytoggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onBackPressed() {


        if (Time_limt+backPress>System.currentTimeMillis()) {
            super.onBackPressed();
        }
        else {
            Toast.makeText(getApplicationContext(),"press back again to exit",Toast.LENGTH_SHORT).show();
        }
        backPress = System.currentTimeMillis();
    }


    }

