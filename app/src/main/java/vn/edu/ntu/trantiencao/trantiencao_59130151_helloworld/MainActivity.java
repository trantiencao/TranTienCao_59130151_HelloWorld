package vn.edu.ntu.trantiencao.trantiencao_59130151_helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Khai báo biến cho đối tượng
    TextView txtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ biến đến id đối tượng
        txtv = (TextView) findViewById(R.id.txtvhelloworld);

        // Thực thi hành vi trên đối tượng
        txtv.setText("Hello World!");
    }
}
