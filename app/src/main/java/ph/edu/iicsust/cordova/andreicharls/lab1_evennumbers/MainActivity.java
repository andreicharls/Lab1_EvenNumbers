package ph.edu.iicsust.cordova.andreicharls.lab1_evennumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button clickMeButton = (Button) findViewById(R.id.clickMeButton);
        clickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView resultTV = (TextView) findViewById(R.id.resultTV);

                int num = 1, counter = 0;

                while (counter < 10) {
                    if (num % 2 == 0) {
                        resultTV.append(num + " ");
                        counter++;
                        num = num + 1;
                    } else
                        num++;
                }
            }

        });

    }
}
