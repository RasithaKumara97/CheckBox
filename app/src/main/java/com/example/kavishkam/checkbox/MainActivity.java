package com.example.kavishkam.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go1(View view) {

        boolean checked =((CheckBox)view).isChecked();
        switch (view.getId()){
            case R.id.checkBox:
                if(checked){
                    Toast toast = Toast.makeText(this,"Agree",Toast.LENGTH_LONG);
                    toast.show();
                }
            break;
            case R.id.checkBox2:
                if (checked){
                    Toast toast = Toast.makeText(this,"Some Times i agree", Toast.LENGTH_LONG);
                    toast.show();

                }
                break;
            case R.id.checkBox3:
                if (checked){
                    Toast toast = Toast.makeText(this,"Disagree",Toast.LENGTH_LONG);
                    toast.show();

                }
        }


    }
}
