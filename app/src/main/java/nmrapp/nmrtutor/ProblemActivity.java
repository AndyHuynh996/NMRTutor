package nmrapp.nmrtutor;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;


public class ProblemActivity extends AppCompatActivity {

    PinchZoomImageView mPinchZoomImageView;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private BottomSheetBehavior mBottomSheetBehavior;

    private ViewPager mViewPager;

    LinearLayout llBottomsheet;

    private ArrayList<String> q1Answer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);

        llBottomsheet = (LinearLayout) findViewById(R.id.bottom_sheet);

        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from(llBottomsheet);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        CustomViewPager ViewPagerObj = (CustomViewPager)findViewById(R.id.container);
        ViewPagerObj.setPagingEnabled(false);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        final TextView question1 = (TextView) findViewById(R.id.question);
        final Spinner q1Spinner = (Spinner) findViewById(R.id.Q1spinner);




        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                q1Answer = new ArrayList<String>();
                switch (tab.getPosition()){
                    case 0 :
                        question1.setText("How was your day?");

                        q1Answer.add("Good");
                        q1Answer.add("Well");
                        q1Answer.add("NotGood");
                        spinnerset(q1Answer,q1Spinner);


                        break;
                    case 1 :
                        question1.setText("Hows the weather?");
                        q1Answer.add("Sunny");
                        q1Answer.add("Raining");
                        q1Answer.add("Snowing");
                        spinnerset(q1Answer,q1Spinner);

                        break;
                    default:
                        question1.setText("Hello");


                }


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {

                if(newState==BottomSheetBehavior.STATE_EXPANDED){
                    bottomSheet.requestLayout();

                    /*or
                     recyclerView.scrollToPosition(0);
                     recyclerView.requestLayout();*/

                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });



    }

    public void spinnerset(ArrayList<String> list, Spinner spinner){



        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinner.setAdapter(dataAdapter);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_problem_set, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_probHome) {
            startActivity(new Intent(ProblemActivity.this,EasyProblemHomeActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    nmrFragment tab1 = new nmrFragment();
                    return tab1;
                case 1:
                    irFragment tab2 = new irFragment();
                    return tab2;
                case 2:
                    cnmrFragment tab3 = new cnmrFragment();
                    return tab3;

                default:
                    return null;

            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }


    }
}
