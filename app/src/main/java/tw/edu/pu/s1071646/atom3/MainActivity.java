package tw.edu.pu.s1071646.atom3;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button a;

    static MediaPlayer mp = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mp = MediaPlayer.create(this,R.raw.legend2);



        a = findViewById(R.id.btn);

        a.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,PlayerMainActivity.class);
                startActivity(it);
            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
        mp.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mp.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mp!=null){
            mp.stop();
            mp.release();

        }
    }

}