package scut.carson_ho.view_testdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import scut.carson_ho.kawaii_loadingview.Kawaii_LoadingView;

public class MainActivity extends AppCompatActivity  {


    private Kawaii_LoadingView Kawaii_LoadingView;
    private View Loading ;
    private Button buttonStart,buttonFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Kawaii_LoadingView = (Kawaii_LoadingView) findViewById(R.id.Kawaii_LoadingView);
//        Loading = findViewById(R.id.loadingView);

        buttonStart = (Button)findViewById(R.id.start);
        buttonFinish = (Button)findViewById(R.id.finish);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Kawaii_LoadingView.startMoving();
//                Loading.setVisibility(View.VISIBLE);
            }

        });

        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Kawaii_LoadingView.stopMoving();
//                Loading.setVisibility(View.INVISIBLE);
            }

        });



    }


}
