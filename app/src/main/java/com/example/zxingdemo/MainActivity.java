package com.example.zxingdemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.xys.libzxing.zxing.activity.CaptureActivity;

import hugo.weaving.DebugLog;

public class MainActivity extends Activity {
    private Button scan;
    public static int SCAN_RESULT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scan = (Button) findViewById(R.id.scan);
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CaptureActivity.class);
                startActivityForResult(intent, SCAN_RESULT);
            }
        });

        testDebug("test", 30);
    }

    @DebugLog
    public void testDebug(String name, int age ){

        for (int i = 0; i < 100000000; i ++){
            int k = 00001;
        }

        Log.i("MainActiviy", "=========== name: " + name + "; age= " + age);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(MainActivity.this, data.getStringExtra("result"), Toast.LENGTH_LONG).show();
        if(resultCode == SCAN_RESULT){
            Log.i("Mainactivity", "onActivityResult: " + data.toString());
        }
    }
}
