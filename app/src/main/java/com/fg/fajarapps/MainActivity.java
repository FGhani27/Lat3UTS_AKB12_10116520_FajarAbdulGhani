package com.fg.fajarapps;

import android.content.ClipData;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
// 28 April 2019 - 10116520 - Fajar Abdul Ghani - AKB12

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView navbottom;
    private FrameLayout mFrame;
    private HomeFragment homeFragment;
    private DailyFragment dailyFragment;
    private GalleryFragment galleryFragment;
    private MusicFragment musicFragment;
    private ProfileFragment profileFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFrame = (FrameLayout) findViewById(R.id.mainFrame);
        navbottom = (BottomNavigationView) findViewById(R.id.navbot);

        homeFragment = new HomeFragment();
        dailyFragment = new DailyFragment();
        galleryFragment = new GalleryFragment();
        musicFragment = new MusicFragment();
        profileFragment = new ProfileFragment();
        setFragment(homeFragment);

        navbottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home :
                        navbottom.setItemBackgroundResource(R.color.white80);
                        setFragment(homeFragment);
                        return true;

                    case R.id.nav_dal :
                        navbottom.setItemBackgroundResource(R.color.white80);
                        setFragment(dailyFragment);
                        return true;

                    case R.id.nav_gal :
                        navbottom.setItemBackgroundResource(R.color.white80);
                        setFragment(galleryFragment);
                        return true;

                    case R.id.nav_music :
                        navbottom.setItemBackgroundResource(R.color.white80);
                        setFragment(musicFragment);
                        return true;

                    case R.id.nav_profile :
                        navbottom.setItemBackgroundResource(R.color.white80);
                        setFragment(profileFragment);
                        return true;

                        default:
                            return false;
                }
            }
        });

    }
    public void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mainFrame, fragment);
        fragmentTransaction.commit();
    }
}
