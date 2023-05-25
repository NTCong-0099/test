package git.com.tinhtoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
GridView gridViewanh ;
ArrayList<Anh> anhArrayList ;
anhAdapter adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();

        gridViewanh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, anhArrayList.get(i).getTen(), Toast.LENGTH_SHORT).show();
            }
        });
        adapter = new anhAdapter(this, R.layout.hinh_anh, anhArrayList);
        gridViewanh.setAdapter(adapter);
    }
    private void anhxa(){
        gridViewanh = (GridView) findViewById(R.id.gridviewanh);
        anhArrayList  = new ArrayList<>();

        anhArrayList.add(new Anh("hinh 1" , R.drawable.tron));
        anhArrayList.add(new Anh("hinh 2" , R.drawable.tamgiac));
        anhArrayList.add(new Anh("hinh 3" , R.drawable.chunhat));
    }
}
