package com.example.tictactoecskvsmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9;
    Button reset;

    final int[] turn = {0};
    int[] result = {0};
    int[] last ={2,2,2,2,2,2,2,2,2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);
        i5 = findViewById(R.id.i5);
        i6 = findViewById(R.id.i6);
        i7 = findViewById(R.id.i7);
        i8 = findViewById(R.id.i8);
        i9 = findViewById(R.id.i9);
        reset=findViewById(R.id.reset);

        Toast.makeText(MainActivity.this, "Start the Game", Toast.LENGTH_SHORT).show();



            i1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (last[0]==2) {
                        switch (turn[0]) {
                            case 0:
                                i1.setImageResource(R.drawable.csklogo);
                                turn[0] = 1;
                                result[0]++;
                                last[0] = 0;
                                if (result[0] >= 5) {
                                    boolean won = whowon(last, turn[0]);

                                    if (result[0] == 9 && won == false) {
                                        Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                    }

                                }
                                break;
                            case 1:
                                i1.setImageResource(R.drawable.milogo);
                                turn[0] = 1;
                                result[0]++;
                                last[0] = 1;
                                if (result[0] >= 5) {
                                    boolean won = whowon(last, turn[0]);

                                    if (result[0] == 9 && won == false) {
                                        Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                    }


                                }
                                break;
                            default:
                        }
                    }
                }


            });


        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (last[1] == 2) {
                    switch (turn[0]) {
                        case 0:
                            i2.setImageResource(R.drawable.csklogo);
                            turn[0] = 1;
                            result[0]++;
                            last[1] = 0;
                            if (result[0] >= 5) {
                                boolean won = whowon(last, turn[0]);

                                if (result[0] == 9 && won == false) {
                                    Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                }


                            }
                            break;
                        case 1:
                            i2.setImageResource(R.drawable.milogo);
                            turn[0] = 0;
                            result[0]++;
                            last[1] = 1;
                            if (result[0] >= 5) {
                                boolean won = whowon(last, turn[0]);

                                if (result[0] == 9 && won == false) {
                                    Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                }


                            }
                            break;
                    }
                }
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (last[2]==2) {
                    switch (turn[0]) {
                        case 0:
                            i3.setImageResource(R.drawable.csklogo);
                            turn[0] = 1;
                            result[0]++;
                            last[2] = 0;
                            if (result[0] >= 5) {
                                boolean won = whowon(last, turn[0]);

                                if (result[0] == 9 && won == false) {
                                    Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                }


                            }
                            break;
                        case 1:
                            i3.setImageResource(R.drawable.milogo);
                            turn[0] = 0;
                            result[0]++;
                            last[2] = 1;
                            if (result[0] >= 5) {
                                boolean won = whowon(last, turn[0]);

                                if (result[0] == 9 && won == false) {
                                    Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                }


                            }
                            break;
                    }
                }
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (last[3] == 2) {
                    switch (turn[0]) {
                        case 0:
                            i4.setImageResource(R.drawable.csklogo);
                            turn[0] = 1;
                            result[0]++;
                            last[3] = 0;
                            if (result[0] >= 5) {
                                boolean won = whowon(last, turn[0]);

                                if (result[0] == 9 && won == false) {
                                    Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                }


                            }
                            break;
                        case 1:
                            i4.setImageResource(R.drawable.milogo);
                            turn[0] = 0;
                            result[0]++;
                            last[3] = 1;
                            if (result[0] >= 5) {
                                boolean won = whowon(last, turn[0]);

                                if (result[0] == 9 && won == false) {
                                    Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                }


                            }
                            break;
                    }

                }
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (last[4]==2) {
                    switch (turn[0]) {
                        case 0:
                            i5.setImageResource(R.drawable.csklogo);
                            turn[0] = 1;
                            result[0]++;
                            last[4] = 0;
                            if (result[0] >= 5) {
                                boolean won = whowon(last, turn[0]);

                                if (result[0] == 9 && won == false) {
                                    Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                }


                            }
                            break;
                        case 1:
                            i5.setImageResource(R.drawable.milogo);
                            turn[0] = 0;
                            result[0]++;
                            last[4] = 1;
                            if (result[0] >= 5) {
                                boolean won = whowon(last, turn[0]);

                                if (result[0] == 9 && won == false) {
                                    Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                }


                            }
                            break;
                    }
                }
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (last[5]==2) {
                    switch (turn[0]) {
                        case 0:
                            i6.setImageResource(R.drawable.csklogo);
                            turn[0] = 1;
                            result[0]++;
                            last[5] = 0;
                            if (result[0] >= 5) {
                                boolean won = whowon(last, turn[0]);

                                if (result[0] == 9 && won == false) {
                                    Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                }


                            }
                            break;
                        case 1:
                            i6.setImageResource(R.drawable.milogo);
                            turn[0] = 0;
                            result[0]++;
                            last[5] = 1;
                            if (result[0] >= 5) {
                                boolean won = whowon(last, turn[0]);

                                if (result[0] == 9 && won == false) {
                                    Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                }


                            }
                            break;
                    }
                }
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (last[6]==2) {
                    switch (turn[0]) {
                        case 0:
                            i7.setImageResource(R.drawable.csklogo);
                            turn[0] = 1;
                            result[0]++;
                            last[6] = 0;
                            if (result[0] >= 5) {
                                boolean won = whowon(last, turn[0]);

                                if (result[0] == 9 && won == false) {
                                    Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                }


                            }
                            break;
                        case 1:
                            i7.setImageResource(R.drawable.milogo);
                            turn[0] = 0;
                            result[0]++;
                            last[6] = 1;
                            if (result[0] >= 5) {
                                boolean won = whowon(last, turn[0]);

                                if (result[0] == 9 && won == false) {
                                    Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                }


                            }
                            break;
                    }
                }
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (last[7]==2) {
                    switch (turn[0]) {
                        case 0:
                            i8.setImageResource(R.drawable.csklogo);
                            turn[0] = 1;
                            result[0]++;
                            last[7] = 0;
                            if (result[0] >= 5) {
                                boolean won = whowon(last, turn[0]);


                                if (result[0] == 9 && won == false) {
                                    Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                }


                            }
                            break;
                        case 1:
                            i8.setImageResource(R.drawable.milogo);
                            turn[0] = 0;
                            result[0]++;
                            last[7] = 1;
                            if (result[0] >= 5) {
                                boolean won = whowon(last, turn[0]);


                                if (result[0] == 9 && won == false) {
                                    Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                }


                            }
                            break;
                    }
                }
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (last[8]==2) {
                    switch (turn[0]) {
                        case 0:
                            i9.setImageResource(R.drawable.csklogo);
                            turn[0] = 1;
                            result[0]++;
                            last[8] = 0;
                            if (result[0] >= 5) {
                                boolean won = whowon(last, turn[0]);


                                if (result[0] == 9 && won == false) {
                                    Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                }


                            }
                            break;
                        case 1:
                            i9.setImageResource(R.drawable.milogo);
                            turn[0] = 0;
                            result[0]++;
                            last[8] = 1;
                            if (result[0] >= 5) {
                                boolean won = whowon(last, turn[0]);

                                if (result[0] == 9 && won == false) {
                                    Toast.makeText(MainActivity.this, "Please Restart Your game match is Draw", Toast.LENGTH_SHORT).show();

                                }


                            }
                            break;
                    }
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i=0;i<9;i++){
                    last[i]=2;
                }
                result[0]=0;
                turn[0]=0;

                i1.setImageDrawable(null);
                i2.setImageDrawable(null);
                i3.setImageDrawable(null);
                i4.setImageDrawable(null);
                i5.setImageDrawable(null);
                i6.setImageDrawable(null);
                i7.setImageDrawable(null);
                i8.setImageDrawable(null);
                i9.setImageDrawable(null);



            }
        });




    }

    private boolean whowon(int[] last, int turn) {

        if ((last[0]==0 && last[1]==0 && last[2]==0) || (last[0]==1 && last[1]==1 && last[2]==1) ||
                (last[0]==0 && last[3]==0 && last[6]==0) || (last[0]==1 && last[3]==1 && last[6]==1) ||
                (last[0]==0 && last[4]==0 && last[8]==0) || (last[0]==1 && last[4]==1 && last[8]==1) ||
                (last[1]==0 && last[4]==0 && last[7]==0) || (last[1]==1 && last[4]==1 && last[7]==1) ||
                (last[2]==0 && last[5]==0 && last[8]==0) || (last[2]==1 && last[5]==1 && last[8]==1) ||
                (last[2]==0 && last[4]==0 && last[6]==0) || (last[2]==1 && last[4]==1 && last[6]==1) ||
                (last[3]==0 && last[4]==0 && last[5]==0) || (last[3]==1 && last[4]==1 && last[5]==1) ||
                (last[6]==0 && last[7]==0 && last[8]==0) || (last[6]==1 && last[7]==1 && last[8]==1)){

            Intent intent = new Intent(MainActivity.this,WinActivity.class);
            intent.putExtra("winner",turn);
            startActivity(intent);

            return true;
        }
        else {
            return false;
        }

    }

}