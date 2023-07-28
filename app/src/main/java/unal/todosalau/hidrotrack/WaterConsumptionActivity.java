package unal.todosalau.hidrotrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WaterConsumptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_consumption);
    }

    public void onClickGoToBack (View v){
        Intent intent = new Intent(WaterConsumptionActivity.this, MainActivity.class);
        startActivity(intent);
    }

}