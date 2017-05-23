package benignstar.kr.hs.emirim.optionmenutest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        Button but_ok=(Button)findViewById(R.id.but_ok);
        LinearLayout linear=(LinearLayout)findViewById(R.id.linear);

        switch (item.getItemId()){
            case R.id.item_blue :
                linear.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.item_red :
                linear.setBackgroundColor(Color.RED);
                return true;
            case R.id.item_yellow :
                linear.setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.item_but_rotate :
                but_ok.setRotation(but_ok.getRotation()+15);
                return true;
            case R.id.item_but_size:
                but_ok.setScaleX(but_ok.getScaleX()*1.2f);
                but_ok.setScaleY(but_ok.getScaleY()*1.2f);
                return true;
        }
        return false;
    }
}
