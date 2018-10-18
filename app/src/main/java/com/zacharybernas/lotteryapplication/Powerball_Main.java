package com.zacharybernas.lotteryapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class Powerball_Main extends AppCompatActivity {

    Button gen_powerball;
    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    CheckBox cb4;
    CheckBox cb5;
    CheckBox cb6;
    CheckBox cb7;
    CheckBox cb8;
    CheckBox cb9;
    CheckBox cb10;
    CheckBox cb11;
    CheckBox cb12;
    CheckBox cb13;
    CheckBox cb14;
    CheckBox cb15;
    CheckBox cb16;
    CheckBox cb17;
    CheckBox cb18;
    CheckBox cb19;
    CheckBox cb20;
    CheckBox cb21;
    CheckBox cb22;
    CheckBox cb23;
    CheckBox cb24;
    CheckBox cb25;
    CheckBox cb26;
    int numberOfCheckboxesChecked;
    String user_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_powerball__main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        gen_powerball = (Button) findViewById(R.id.gen_powerball);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        cb4 =(CheckBox) findViewById(R.id.cb4);
        cb5 =(CheckBox) findViewById(R.id.cb5);
        cb6 =(CheckBox) findViewById(R.id.cb6);
        cb7 =(CheckBox) findViewById(R.id.cb7);
        cb8 =(CheckBox) findViewById(R.id.cb8);
        cb9 =(CheckBox) findViewById(R.id.cb9);
        cb10 =(CheckBox) findViewById(R.id.cb10);
        cb11 =(CheckBox) findViewById(R.id.cb11);
        cb12=(CheckBox) findViewById(R.id.cb12);
        cb13=(CheckBox) findViewById(R.id.cb13);
        cb14=(CheckBox) findViewById(R.id.cb14);
        cb15=(CheckBox) findViewById(R.id.cb15);
        cb16=(CheckBox) findViewById(R.id.cb16);
        cb17=(CheckBox) findViewById(R.id.cb17);
        cb18=(CheckBox) findViewById(R.id.cb18);
        cb19=(CheckBox) findViewById(R.id.cb19);
        cb20=(CheckBox) findViewById(R.id.cb20);
        cb21=(CheckBox) findViewById(R.id.cb21);
        cb22=(CheckBox) findViewById(R.id.cb22);
        cb23=(CheckBox) findViewById(R.id.cb23);
        cb24=(CheckBox) findViewById(R.id.cb24);
        cb25=(CheckBox) findViewById(R.id.cb25);
        cb26=(CheckBox) findViewById(R.id.cb26);
        numberOfCheckboxesChecked = 0;


        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb1.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });

        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb2.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });

        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb3.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });

        cb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb4.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });

        cb5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb5.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });

        cb6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb6.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });

        cb7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb7.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });

        cb8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb8.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });

        cb9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb9.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });

        cb10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb10.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });

        cb11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb11.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        cb12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb12.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        cb13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb13.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        cb14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb14.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        cb15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb15.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        cb16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb16.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        cb17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb17.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        cb18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb18.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        cb19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb19.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        cb20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb20.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        cb21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb21.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        cb22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb22.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        cb23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb23.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        cb24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb24.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        cb25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb25.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        cb26.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 1) {
                    cb26.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });

        gen_powerball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("lottery_num", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                String power_ball = GenUserPick(user_num);
                editor.putString("powerBall", power_ball);
                editor.commit();
                if(numberOfCheckboxesChecked == 1){
                Intent Final = new Intent(view.getContext(), Final_Screen.class);
                startActivity(Final);}
                else{
                    Toast.makeText(Powerball_Main.this, "You must pick at least 1 number", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    private String GenUserPick(String x) {
        String user_pick= "";
        if(cb1.isChecked()){user_pick += "power ball: 1";}
        if (cb2.isChecked()){user_pick += "power ball: 2";}
        if (cb3.isChecked()){user_pick +="power ball: 3";}
        if (cb4.isChecked()){user_pick +="power ball: 4";}
        if (cb5.isChecked()){user_pick +="power ball: 5";}
        if (cb6.isChecked()){user_pick +="power ball: 6";}
        if (cb7.isChecked()){user_pick +="power ball: 7";}
        if (cb8.isChecked()){user_pick +="power ball: 8";}
        if (cb9.isChecked()){user_pick +="power ball: 9";}
        if (cb10.isChecked()){user_pick +="power ball: 10";}
        if (cb11.isChecked()){user_pick +="power ball: 11";}
        if (cb12.isChecked()){user_pick += "power ball: 12";}
        if (cb13.isChecked()){user_pick += "power ball: 13";}
        if (cb14.isChecked()){user_pick += "power ball: 14";}
        if (cb15.isChecked()){user_pick += "power ball: 15";}
        if (cb16.isChecked()){user_pick += "power ball: 16";}
        if (cb17.isChecked()){user_pick += "power ball: 17";}
        if (cb18.isChecked()){user_pick += "power ball: 18";}
        if (cb19.isChecked()){user_pick += "power ball: 19";}
        if (cb20.isChecked()){user_pick += "power ball: 20";}
        if (cb21.isChecked()){user_pick += "power ball: 21";}
        if (cb22.isChecked()){user_pick += "power ball: 22";}
        if (cb23.isChecked()){user_pick += "power ball: 23";}
        if (cb24.isChecked()){user_pick += "power ball: 24";}
        if (cb25.isChecked()){user_pick += "power ball: 25";}
        if (cb26.isChecked()){user_pick += "power ball: 26";}
        return user_pick;
    }

}
