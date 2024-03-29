package com.example.veggiebuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

public class Profile extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_profile);

                 /*
        Going to be part of every activity
         */
                ActionBar actionBar = getSupportActionBar();        //hides the top bar
                actionBar.hide();
                ImageView profile = findViewById(R.id.profile);
                ImageView home = findViewById(R.id.home);
                ImageView cart = findViewById(R.id.cart);
                profile.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                Intent intent = new Intent();
                                intent.setClass(getApplicationContext(), Profile.class);
                                startActivity(intent);
                        }
                });
                home.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                Intent intent = new Intent();
                                intent.setClass(getApplicationContext(), HomeScreen.class);
                                startActivity(intent);
                        }
                });
                cart.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                Intent intent = new Intent();
                                intent.setClass(getApplicationContext(), ShoppingCart.class);
                                startActivity(intent);
                        }
                });
        /*
        End of material to always include in every activity
         */

                FragmentManager fm = getSupportFragmentManager();

                ViewStateAdapter sa = new ViewStateAdapter(fm, getLifecycle());
                final ViewPager2 pa = findViewById(R.id.pager);
                pa.setAdapter(sa);

                // Up to here, we have working scrollable pages

                final TabLayout tabLayout = findViewById(R.id.tabLayout);
                tabLayout.addTab(tabLayout.newTab().setText("Favorites"));
                tabLayout.addTab(tabLayout.newTab().setText("Activity"));

                // Now we have tabs, NOTE: I am hardcoding the order, you'll want to do something smarter

                tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                        @Override
                        public void onTabSelected(TabLayout.Tab tab) {
                                pa.setCurrentItem(tab.getPosition());
                        }

                        @Override
                        public void onTabUnselected(TabLayout.Tab tab) {

                        }

                        @Override
                        public void onTabReselected(TabLayout.Tab tab) {

                        }
                });
                pa.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
                        @Override
                        public void onPageSelected(int position) {
                                tabLayout.selectTab(tabLayout.getTabAt(position));
                        }
                });

                // And now we have tabs that, when clicked, navigate to the correct page
        }
        private class ViewStateAdapter extends FragmentStateAdapter {

                public ViewStateAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
                        super(fragmentManager, lifecycle);
                }

                @NonNull
                @Override
                public Fragment createFragment(int position) {
                        // Hardcoded in this order, you'll want to use lists and make sure the titles match
                        if (position == 0) {
                                return new FavoritesFragment();
                        }
                        return new ActivityFragment();
                }

                @Override
                public int getItemCount() {
                        // Hardcoded, use lists
                        return 2;
                }
        }
}