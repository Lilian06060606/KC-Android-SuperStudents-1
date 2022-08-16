package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    Button rock,paper,sc;
    TextView score, name1;
    ImageView male,female;
    int HumanScore,ComputerScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rock =(Button)findViewById(R.id.button);
        paper =(Button)findViewById(R.id.button1);
        sc =(Button)findViewById(R.id.button2);
        score = (TextView)findViewById(R.id.textView);
        male = (ImageView) findViewById(R.id.imageView);
        female = (ImageView) findViewById(R.id.imageView2);

        name1 =(TextView)findViewById(R.id.textView2);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("Hi.name");
        name1.setText(name);




        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                female.setImageResource(R.drawable.play33);

                String message = play_turn("rockk");
                Toast.makeText(MainActivity2.this,message, Toast.LENGTH_SHORT).show();
                score.setText("Score Human "+Integer.toString(HumanScore)+"Cmputer"+Integer.toString(ComputerScore));}});



        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                female.setImageResource(R.drawable.play22);

                String message =play_turn("paperr");
                Toast.makeText(MainActivity2.this,message, Toast.LENGTH_SHORT).show();
                score.setText("Score Human "+Integer.toString(HumanScore)+"Cmputer"+Integer.toString(ComputerScore));
            }
        });
        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                female.setImageResource(R.drawable.play111);
                String message =play_turn("scc");
                Toast.makeText(MainActivity2.this, message, Toast.LENGTH_SHORT).show();
                score.setText("Score Human "+Integer.toString(HumanScore)+"Cmputer"+Integer.toString(ComputerScore));
            }
        });
    }

    public String play_turn(String player_choise) {
        String male_choise = "";
        Random f = new Random();

        int male_choise_number = f.nextInt(3) + 1;

        if (male_choise_number == 1) {
            male_choise = "rockk";

        } else if (male_choise_number == 2) {
            male_choise = "scc";
        } else if (male_choise_number == 3) {
            male_choise = "paperr";
        }
        if (male_choise=="rockk") {male.setImageResource(R.drawable.play33);}

        else if (male_choise=="scc"){male.setImageResource(R.drawable.play111);}

        else if (male_choise=="paperr") {male.setImageResource(R.drawable.play22);}


        if (male_choise== player_choise) {
            return "هالمرة محد فاز";}

        else if (player_choise== "rockk"&&male_choise=="scc"){
            HumanScore++;
            return "يا سلام عليك";

        }else if (player_choise=="rockk"&&male_choise=="paperr"){
            ComputerScore++;
            return "يا حرام راحت عليك";
        }
        else if (player_choise=="scc"&&male_choise=="rockk"){
            ComputerScore++;
            return "  يا حرام راحت عليك !";
        }
        else if (player_choise=="scc"&&male_choise=="paperr"){
            HumanScore++;
            return "  الله عليك";
        }
        else if (player_choise=="paperr"&&male_choise=="rockk"){
            HumanScore++;
            return "  الله عليك";
        }
        else if (player_choise=="paperr"&&male_choise=="scc"){
            ComputerScore++;
            return "  يا حرام راحت عليك!";
        }else return "Not sure";

    }
}