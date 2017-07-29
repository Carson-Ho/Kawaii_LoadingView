package scut.carson_ho.view_testdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import scut.carson_ho.kawaii_loadingview.Kawaii_LoadingView;

/**
 * Created by Carson_Ho on 17/7/29.
 */

public class Useage2 extends AppCompatActivity {


    private Kawaii_LoadingView Kawaii_LoadingView;
    private View Loading ;
    private Button buttonStart,buttonFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivty_main1);
        Kawaii_LoadingView = (Kawaii_LoadingView) findViewById(R.id.Kawaii_LoadingView);
        Loading = findViewById(R.id.loadingView);

        buttonStart = (Button)findViewById(R.id.start);
        buttonFinish = (Button)findViewById(R.id.finish);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Kawaii_LoadingView.startMoving();
                Loading.setVisibility(View.VISIBLE);
            }

        });

        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Kawaii_LoadingView.stopMoving();
                Loading.setVisibility(View.INVISIBLE);
            }

        });



    }


}