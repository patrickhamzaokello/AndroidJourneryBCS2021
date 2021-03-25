package must.ac.ug.csce.patrickokello.pokelloprogcolorswap;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.util.TypedValue;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import  android.widget.Button;
import android.graphics.Color;
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


    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button= new Button(this);
        button.setText("TAP ME!");


        TextView textView = new TextView(this);
        textView.setText("Tap to Change Color");
        textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);
        textView.setPadding(20,20,20,20);
        textView.setTextAlignment(4);


        final Random random= new Random();

        button.setWidth(20);

        button.setOnClickListener((m )-> {
            int red =  random.nextInt(999999);
            int rd = rgbvalue(String.valueOf(red));
            int green =  random.nextInt(999999);
            int gn = greenvalue(String.valueOf(red));

            int blue =  random.nextInt(999999);
            int bu = bluevalue(String.valueOf(red));


            textView.setText("COLOR:" + String.valueOf(rd)+"r "+" "+String.valueOf(gn)+"g "+String.valueOf(bu)+"b");
            textView.setTextColor(Color.rgb(rd,gn,bu));

        });
        LinearLayout linearlayoutobj = new LinearLayout(this);
        linearlayoutobj.setOrientation(LinearLayout.VERTICAL);
        button.setLayoutParams(new LinearLayout.LayoutParams(300, 100));
        button.setGravity(Gravity.CENTER);

        linearlayoutobj.addView(textView);
        linearlayoutobj.addView(button);
        linearlayoutobj.setGravity(Gravity.CENTER);
        linearlayoutobj.setPadding(20,20,20,20);
        setContentView(linearlayoutobj);

    }

}







