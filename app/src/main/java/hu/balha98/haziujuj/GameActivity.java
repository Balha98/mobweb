package hu.balha98.haziujuj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    private Tile[][] map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initmap();
        setContentView(R.layout.activity_game);
        setimages();

    }

    public void initmap(){
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4;j++ )
                map[i][j] = new Tile(i,j,0);
    }

    public void setimages(){
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4;j++ ) {
                String buttonID = "a" + i + j;
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                ImageView imv = findViewById(resID);
                imv.setImageResource(R.drawable.guszti);
            }
    }
}
