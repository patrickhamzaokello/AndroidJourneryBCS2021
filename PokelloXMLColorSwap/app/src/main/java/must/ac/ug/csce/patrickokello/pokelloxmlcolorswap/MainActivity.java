package must.ac.ug.csce.patrickokello.pokelloxmlcolorswap;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static int rgbvalue(String hex) {
        int color = (int) Long.parseLong(hex.replace("#", ""), 16);
        int r = (color >> 16) & 0xFF;
        return  r;
    }

    public static int greenvalue(String hex) {
        int color = (int) Long.parseLong(hex.replace("#", ""), 16);
        int g = (color >> 8) & 0xFF;
        return  g;
    }
    public static int bluevalue(String hex) {
        int color = (int) Long.parseLong(hex.replace("#", ""), 16);
        int b = (color >> 0) & 0xFF;
        return b;
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.colortextview);
        Button tapbutton = findViewById(R.id.tapbutton);

        final Random random = new Random();




        tapbutton.setOnClickListener((v)->{

            int red =  random.nextInt(999999);
            int rd = rgbvalue(String.valueOf(red));
            int green =  random.nextInt(999999);
            int gn = greenvalue(String.valueOf(red));

            int blue =  random.nextInt(999999);
            int bu = bluevalue(String.valueOf(red));

            textView.setText("COLOR:" + String.valueOf(rd)+"r "+" "+String.valueOf(gn)+"g "+String.valueOf(bu)+"b");
            textView.setTextColor(Color.rgb(rd,gn,bu));
        });
    }
}