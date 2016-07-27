package tomerbu.edu.animationsparttwo;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Animator cloud1Animator;
    private Animator cloud2Animator;
    private Animator cloud3Animator;
    private Animator cloud4Animator;

    private ImageView ivCloud1;
    private ImageView ivCloud2;
    private ImageView ivCloud3;
    private ImageView ivCloud4;

    //1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        cloud1Animator = AnimatorInflater.loadAnimator(this, R.animator.move_cloud);
        cloud2Animator = AnimatorInflater.loadAnimator(this, R.animator.move_cloud2);
        cloud3Animator = AnimatorInflater.loadAnimator(this, R.animator.move_cloud3);
        cloud4Animator = AnimatorInflater.loadAnimator(this, R.animator.move_cloud4);
        animateClouds();
    }

    private void findViews() {
        ivCloud1 = (ImageView) findViewById(R.id.ivCloud1);
        ivCloud2 = (ImageView) findViewById(R.id.ivCloud2);
        ivCloud3 = (ImageView) findViewById(R.id.ivCloud3);
        ivCloud4 = (ImageView) findViewById(R.id.ivCloud4);
    }

    private void animateClouds() {
        cloud1Animator.setTarget(ivCloud1);
        cloud1Animator.start();

        cloud2Animator.setTarget(ivCloud2);
        cloud2Animator.start();

        cloud3Animator.setTarget(ivCloud3);
        cloud3Animator.start();

        cloud4Animator.setTarget(ivCloud4);
        cloud4Animator.start();

    }

    //2)
    @Override
    protected void onStart() {
        super.onStart();
    }

    //3)
    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
