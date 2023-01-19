package com.empresa.aprendaingles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.empresa.aprendaingles.fragments.BichosFragment;
import com.empresa.aprendaingles.fragments.NumerosFragment;
import com.empresa.aprendaingles.fragments.VogaisFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentStatePagerItemAdapter;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.smartTabLayout = findViewById(R.id.smartTabLayout);
        this.viewPager = findViewById(R.id.viewPager);

        getSupportActionBar().setElevation(0);

        FragmentStatePagerItemAdapter adapter = new FragmentStatePagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add("Bichos", BichosFragment.class)
                        .add("Números", NumerosFragment.class)
                        .add("Vogais", VogaisFragment.class)
                        .create()
        );
        viewPager.setAdapter( adapter);
        smartTabLayout.setViewPager(viewPager);
    }
}