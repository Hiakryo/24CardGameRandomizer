package com.awesome.a24cardrandomizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ImageView deck,card1,card2,card3,card4;
    Button x;

    ArrayList<Integer> carddeck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x=(Button) findViewById(R.id.Deal);
        deck= (ImageView) findViewById(R.id.deck);
        card1= (ImageView)findViewById(R.id.card1);
        card2=(ImageView) findViewById(R.id.card2);
        card3= (ImageView) findViewById(R.id.card3);
        card4= (ImageView) findViewById(R.id.card4);

        carddeck = new ArrayList<>();

        //Memasukkan data kartu
        //Number 2
        carddeck.add(1);//2 club
        carddeck.add(2);//2 diamond
        carddeck.add(3);//2 heart
        carddeck.add(4);//2 spade
        //Number 3
        carddeck.add(5);//3 club
        carddeck.add(6);//3 diamond
        carddeck.add(7);//3 heart
        carddeck.add(8);//3 spade
        //Number 4
        carddeck.add(9);//4 club
        carddeck.add(10);//4 diamond
        carddeck.add(11);//4 heart
        carddeck.add(12);//4 spade
        //Number 5
        carddeck.add(13);//5 club
        carddeck.add(14);//5 diamond
        carddeck.add(15);//5 heart
        carddeck.add(16);//5 spade
        //Number 6
        carddeck.add(17);//6 club
        carddeck.add(18);//6 diamond
        carddeck.add(19);//6 heart
        carddeck.add(20);//6 spade
        //Number 7
        carddeck.add(21);//7 club
        carddeck.add(22);//7 diamond
        carddeck.add(23);//7 heart
        carddeck.add(24);//7 spade
        //Number 8
        carddeck.add(25);//8 club
        carddeck.add(26);//8 diamond
        carddeck.add(27);//8 heart
        carddeck.add(28);//8 spade
        //Number 9
        carddeck.add(29);//9 club
        carddeck.add(30);//9 diamond
        carddeck.add(31);//9 heart
        carddeck.add(32);//9 spade
        //Number 10
        carddeck.add(33);//10 club
        carddeck.add(34);//10 diamond
        carddeck.add(35);//10 heart
        carddeck.add(36);//10 spade
        //Number Jack
        carddeck.add(37);//Jack club
        carddeck.add(38);//Jack diamond
        carddeck.add(39);//Jack heart
        carddeck.add(40);//Jack spade
        //Number Queen
        carddeck.add(41);//Queen club
        carddeck.add(42);//Queen diamond
        carddeck.add(43);//Queen heart
        carddeck.add(44);//Queen spade
        //Number King
        carddeck.add(45);//King club
        carddeck.add(46);//King diamond
        carddeck.add(47);//King heart
        carddeck.add(48);//King spade
        //Number Aces
        carddeck.add(49);//Aces club
        carddeck.add(50);//Aces diamond
        carddeck.add(51);//Aces heart
        carddeck.add(52);//Aces spade


        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.shuffle(carddeck);
                imagesetting(carddeck.get(0), card1);
                imagesetting(carddeck.get(1), card2);
                imagesetting(carddeck.get(2), card3);
                imagesetting(carddeck.get(3), card4);

                Toast.makeText(MainActivity.this, "Let's 24!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void imagesetting(int card, ImageView image)
    {
        switch(card)
        {
            case 1:
                image.setImageResource(R.drawable.twoc);
                break;
            case 2:
                image.setImageResource(R.drawable.twod);
                break;
            case 3:
                image.setImageResource(R.drawable.twoh);
                break;
            case 4:
                image.setImageResource(R.drawable.twos);
                break;
            case 5:
                image.setImageResource(R.drawable.threec);
                break;
            case 6:
                image.setImageResource(R.drawable.threed);
                break;
            case 7:
                image.setImageResource(R.drawable.threeh);
                break;
            case 8:
                image.setImageResource(R.drawable.threes);
                break;
            case 9:
                image.setImageResource(R.drawable.fourc);
                break;
            case 10:
                image.setImageResource(R.drawable.fourd);
                break;
            case 11:
                image.setImageResource(R.drawable.fourh);
                break;
            case 12:
                image.setImageResource(R.drawable.fours);
                break;
            case 13:
                image.setImageResource(R.drawable.fivec);
                break;
            case 14:
                image.setImageResource(R.drawable.fived);
                break;
            case 15:
                image.setImageResource(R.drawable.fiveh);
                break;
            case 16:
                image.setImageResource(R.drawable.fives);
                break;
            case 17:
                image.setImageResource(R.drawable.sixc);
                break;
            case 18:
                image.setImageResource(R.drawable.sixd);
                break;
            case 19:
                image.setImageResource(R.drawable.sixh);
                break;
            case 20:
                image.setImageResource(R.drawable.sixs);
                break;
            case 21:
                image.setImageResource(R.drawable.sevenc);
                break;
            case 22:
                image.setImageResource(R.drawable.sevend);
                break;
            case 23:
                image.setImageResource(R.drawable.sevenh);
                break;
            case 24:
                image.setImageResource(R.drawable.sevens);
                break;
            case 25:
                image.setImageResource(R.drawable.eightc);
                break;
            case 26:
                image.setImageResource(R.drawable.eightd);
                break;
            case 27:
                image.setImageResource(R.drawable.eighth);
                break;
            case 28:
                image.setImageResource(R.drawable.eights);
                break;
            case 29:
                image.setImageResource(R.drawable.ninec);
                break;
            case 30:
                image.setImageResource(R.drawable.nined);
                break;
            case 31:
                image.setImageResource(R.drawable.nineh);
                break;
            case 32:
                image.setImageResource(R.drawable.nines);
                break;
            case 33:
                image.setImageResource(R.drawable.tenc);
                break;
            case 34:
                image.setImageResource(R.drawable.tend);
                break;
            case 35:
                image.setImageResource(R.drawable.tenh);
                break;
            case 36:
                image.setImageResource(R.drawable.tens);
                break;
            case 37:
                image.setImageResource(R.drawable.jc);
                break;
            case 38:
                image.setImageResource(R.drawable.jd);
                break;
            case 39:
                image.setImageResource(R.drawable.jh);
                break;
            case 40:
                image.setImageResource(R.drawable.js);
                break;
            case 41:
                image.setImageResource(R.drawable.qc);
                break;
            case 42:
                image.setImageResource(R.drawable.qd);
                break;
            case 43:
                image.setImageResource(R.drawable.qh);
                break;
            case 44:
                image.setImageResource(R.drawable.qs);
                break;
            case 45:
                image.setImageResource(R.drawable.kc);
                break;
            case 46:
                image.setImageResource(R.drawable.kd);
                break;
            case 47:
                image.setImageResource(R.drawable.kh);
                break;
            case 48:
                image.setImageResource(R.drawable.ks);
                break;
            case 49:
                image.setImageResource(R.drawable.ac);
                break;
            case 50:
                image.setImageResource(R.drawable.ad);
                break;
            case 51:
                image.setImageResource(R.drawable.ah);
                break;
            case 52:
                image.setImageResource(R.drawable.as);
                break;

        }
    }

}
