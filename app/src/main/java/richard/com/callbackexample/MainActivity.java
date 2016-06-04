package richard.com.callbackexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import richard.com.callbackexample.SubClass.MyCallbackClass;


public class MainActivity extends AppCompatActivity implements MyCallbackClass{

    Button buttonCallSubClass;
    TextView textResult;
    SubClass mySubClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonCallSubClass = (Button)findViewById(R.id.callsubclass);
        textResult = (TextView)findViewById(R.id.result);

        mySubClass = new SubClass();

        mySubClass.registerCallback(this);

        buttonCallSubClass.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View arg0) {
                mySubClass.doSomething();
            }});
    }

    @Override
    public void callbackReturn() {
        textResult.setText("Callback function called");
    }
}
