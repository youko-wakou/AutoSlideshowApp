package techacademy.wakou.youko.autoslideshowapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    private ViewFlipper viewFlipper;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = (ViewFlipper) findViewById(R.id.flip);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(2000);
    }
}
