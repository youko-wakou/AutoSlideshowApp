package techacademy.wakou.youko.autoslideshowapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ViewFlipper viewFlipper;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button play = new Button(this);
        Button prev = new Button(this);
        Button next = new Button(this);
        Button stop = new Button(this);

        viewFlipper = (ViewFlipper) findViewById(R.id.flip);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(2000);
    }
    public void onClick(View v){
        switch(v.getId()){

            case R.id.play:
                viewFlipper.startFlipping();
            break;

            case R.id.prev:
                viewFlipper.showPrevious();
                break;

            case R.id.next:
                viewFlipper.showPrevious();
                break;

            case R.id.stop:
                viewFlipper.stopFlipping();
                break;

            default:
                break;
        }
    }
}
