package techacademy.wakou.youko.autoslideshowapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity{
    private ViewFlipper viewFlipper;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = (ViewFlipper) findViewById(R.id.flip);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(2000);
    }
    public void onClick(View v){
        switch(v.getId()){
            break;

            case R.id.prev:
                viewFlipper.showPrevious();
                break;

            case R.id.next:
                viewFlipper.showPrevious();
                break;

            case R.id.
        }
    }
}
