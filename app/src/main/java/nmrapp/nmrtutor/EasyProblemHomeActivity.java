package nmrapp.nmrtutor;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

/**
Purpose: The Easy Question Home with the implements of EasyHomeFragment to acquire custom view
 */
public class EasyProblemHomeActivity extends AppCompatActivity implements EasyHomeFragment.OnSelectedListener,NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_problem_home);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.homeDrawerLayout);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();


        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        NavigationView navigationView = (NavigationView) findViewById(R.id.homeNavigationView);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onSelected() {
        android.support.v4.app.FragmentManager fragMan;
        fragMan = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragMan.beginTransaction();

        android.support.v4.app.FragmentTransaction transaction;
        transaction = getSupportFragmentManager().beginTransaction();

        transaction.commit();


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.homeItem){
            startActivity(new Intent(EasyProblemHomeActivity.this,MainActivity.class));
        }else if (id == R.id.Prob){
            startActivity(new Intent(EasyProblemHomeActivity.this,EasyProblemHomeActivity.class));
        }
        return false;
    }
}
