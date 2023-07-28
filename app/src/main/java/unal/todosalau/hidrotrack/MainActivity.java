package unal.todosalau.hidrotrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGoToView (Class viewToGo){
        Intent intent = new Intent(MainActivity.this, viewToGo);
        startActivity(intent);
    }

    public void goToSettings (View v) {
        this.onClickGoToView(SettingsActivity.class);
    }

    public void goToWaterConsumption (View v) {
        this.onClickGoToView(WaterConsumptionActivity.class);
    }

    public void goToProgress (View v) {
        this.onClickGoToView(ProgressActivity.class);
    }

    public void goToTips (View v) {
        this.onClickGoToView(TipsActivity.class);
    }

    public void goToInfo (View v) {
        this.onClickGoToView(InfoActivity.class);
    }

}