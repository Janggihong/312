package yonsei.cte.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        long now=System.currentTimeMillis();
        Date date = new Date(now);
        final int h= date.getMonth() + 1;
        int k=date.getDay()+1;

        TextView t1 = (TextView) findViewById(R.id.test);

        t1.setText("현재 달은 "+h +"월" +k+ "일 입니다");

        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder k2 = new  AlertDialog.Builder(MainActivity.this);
                k2.setTitle("안녕하세요");
                k2.setPositiveButton("네 안녕하세요", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                         Toast.makeText(getApplicationContext(),"이제 꺼지세요",Toast.LENGTH_LONG).show();
                    finish();
                    }
                });
                k2.show();
            }
        });
        Button b2=(Button) findViewById(R.id.kda);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"안녕하세요",Toast.LENGTH_LONG).show();
                setContentView(R.layout.kind);
                Button coco =(Button) findViewById(R.id.coco);
                coco.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"Test",Toast.LENGTH_LONG).show();
                    }
                });
            }
        });


    }

}
