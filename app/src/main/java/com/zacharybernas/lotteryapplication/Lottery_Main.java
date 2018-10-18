package com.zacharybernas.lotteryapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

public class Lottery_Main extends AppCompatActivity {

    TextView powerball_Num;
    Button gen_powerball;
    Button User_powerball;
    String prob_pb;
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
    CheckBox cb27;
    CheckBox cb28;
    CheckBox cb29;
    CheckBox cb30;
    CheckBox cb31;
    CheckBox cb32;
    CheckBox cb33;
    CheckBox cb34;
    CheckBox cb35;
    CheckBox cb36;
    CheckBox cb37;
    CheckBox cb38;
    CheckBox cb39;
    CheckBox cb40;
    CheckBox cb41;
    CheckBox cb42;
    CheckBox cb43;
    CheckBox cb44;
    CheckBox cb45;
    CheckBox cb46;
    CheckBox cb47;
    CheckBox cb48;
    CheckBox cb49;
    CheckBox cb50;
    CheckBox cb51;
    CheckBox cb52;
    CheckBox cb53;
    CheckBox cb54;
    CheckBox cb55;
    CheckBox cb56;
    CheckBox cb57;
    CheckBox cb58;
    CheckBox cb59;
    CheckBox cb60;
    CheckBox cb61;
    CheckBox cb62;
    CheckBox cb63;
    CheckBox cb64;
    CheckBox cb65;
    CheckBox cb66;
    CheckBox cb67;
    CheckBox cb68;
    CheckBox cb69;
    int numberOfCheckboxesChecked;
    String user_num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottery__main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        powerball_Num = (TextView) findViewById(R.id.powerball_Num);
        gen_powerball = (Button) findViewById(R.id.gen_powerball);
        User_powerball = (Button) findViewById(R.id.User_powerball);
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
        cb27=(CheckBox) findViewById(R.id.cb27);
        cb28=(CheckBox) findViewById(R.id.cb28);
        cb29=(CheckBox) findViewById(R.id.cb29);
        cb30=(CheckBox) findViewById(R.id.cb30);
        cb31=(CheckBox) findViewById(R.id.cb31);
        cb32=(CheckBox) findViewById(R.id.cb32);
        cb33=(CheckBox) findViewById(R.id.cb33);
        cb34=(CheckBox) findViewById(R.id.cb34);
        cb35=(CheckBox) findViewById(R.id.cb35);
        cb36=(CheckBox) findViewById(R.id.cb36);
        cb37=(CheckBox) findViewById(R.id.cb37);
        cb38=(CheckBox) findViewById(R.id.cb38);
        cb39=(CheckBox) findViewById(R.id.cb39);
        cb40=(CheckBox) findViewById(R.id.cb40);
        cb41=(CheckBox) findViewById(R.id.cb41);
        cb42=(CheckBox) findViewById(R.id.cb42);
        cb43=(CheckBox) findViewById(R.id.cb43);
        cb44=(CheckBox) findViewById(R.id.cb44);
        cb45=(CheckBox) findViewById(R.id.cb45);
        cb46=(CheckBox) findViewById(R.id.cb46);
        cb47=(CheckBox) findViewById(R.id.cb47);
        cb48=(CheckBox) findViewById(R.id.cb48);
        cb49=(CheckBox) findViewById(R.id.cb49);
        cb50=(CheckBox) findViewById(R.id.cb50);
        cb51=(CheckBox) findViewById(R.id.cb51);
        cb52=(CheckBox) findViewById(R.id.cb52);
        cb53=(CheckBox) findViewById(R.id.cb53);
        cb54=(CheckBox) findViewById(R.id.cb54);
        cb55=(CheckBox) findViewById(R.id.cb55);
        cb56=(CheckBox) findViewById(R.id.cb56);
        cb57=(CheckBox) findViewById(R.id.cb57);
        cb58=(CheckBox) findViewById(R.id.cb58);
        cb59=(CheckBox) findViewById(R.id.cb59);
        cb60=(CheckBox) findViewById(R.id.cb60);
        cb61=(CheckBox) findViewById(R.id.cb61);
        cb62=(CheckBox) findViewById(R.id.cb62);
        cb63=(CheckBox) findViewById(R.id.cb63);
        cb64=(CheckBox) findViewById(R.id.cb64);
        cb65=(CheckBox) findViewById(R.id.cb65);
        cb66=(CheckBox) findViewById(R.id.cb66);
        cb67=(CheckBox) findViewById(R.id.cb67);
        cb68=(CheckBox) findViewById(R.id.cb68);
        cb69=(CheckBox) findViewById(R.id.cb69);


        numberOfCheckboxesChecked = 0;


        cb1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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

        cb2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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

        cb3.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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

        cb4.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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

        cb5.setOnCheckedChangeListener(new OnCheckedChangeListener() {
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

        cb6.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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

        cb7.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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

        cb8.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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

        cb9.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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

        cb10.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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

        cb11.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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
        cb12.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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
        cb13.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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
        cb14.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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
        cb15.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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
        cb16.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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
        cb17.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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
        cb18.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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
        cb19.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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
        cb20.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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
        cb21.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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
        cb22.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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
        cb23.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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
        cb24.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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
        cb25.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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
        cb26.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
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
        cb27.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb27.setChecked(false);
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
        cb28.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb28.setChecked(false);
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
        cb29.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb29.setChecked(false);
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
        cb30.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb30.setChecked(false);
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
        cb31.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb31.setChecked(false);
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
        cb32.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb32.setChecked(false);
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
        cb33.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb33.setChecked(false);
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
        cb34.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb34.setChecked(false);
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
        cb35.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb35.setChecked(false);
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
        cb36.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb36.setChecked(false);
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
        cb37.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb37.setChecked(false);
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
        cb38.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb38.setChecked(false);
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
        cb39.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb39.setChecked(false);
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
        cb40.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb40.setChecked(false);
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
        cb41.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb41.setChecked(false);
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
        cb42.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb42.setChecked(false);
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
        cb43.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb43.setChecked(false);
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
        cb44.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb44.setChecked(false);
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
        cb45.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb45.setChecked(false);
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
        cb46.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb46.setChecked(false);
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
        cb47.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb47.setChecked(false);
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
        cb48.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb48.setChecked(false);
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
        cb49.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb49.setChecked(false);
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
        cb50.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb50.setChecked(false);
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
        cb51.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb51.setChecked(false);
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
        cb52.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb52.setChecked(false);
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
        cb53.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb53.setChecked(false);
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
        cb54.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb54.setChecked(false);
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
        cb55.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb55.setChecked(false);
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
        cb56.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb56.setChecked(false);
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
        cb57.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb57.setChecked(false);
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
        cb58.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb58.setChecked(false);
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
        cb59.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb59.setChecked(false);
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
        cb60.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb60.setChecked(false);
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
        cb61.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb61.setChecked(false);
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
        cb62.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb62.setChecked(false);
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
        cb63.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb63.setChecked(false);
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
        cb64.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb64.setChecked(false);
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
        cb65.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb65.setChecked(false);
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
        cb66.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb66.setChecked(false);
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
        cb67.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb67.setChecked(false);
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
        cb68.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb68.setChecked(false);
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
        cb69.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 5) {
                    cb69.setChecked(false);
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
                Prob_generator pb = new Prob_generator();
                prob_pb = pb.powballNum(prob_pb);

                SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("lottery_num", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("easyPick", prob_pb);
                editor.putString("didEasy", "1");
                editor.commit();

                Intent PickPowerball = new Intent(view.getContext(), Final_Screen.class);
                startActivity(PickPowerball);


                //powerball_Num.setText(prob_pb);
                //String user_pic = GenUserPick(user_num);
                //powerball_Num.setText(user_pic);
            }
        });

        User_powerball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("lottery_num", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                String white_balls = GenUserPick(user_num);

                editor.putString("whiteBalls", white_balls);
                editor.putString("didEasy", "0");
                editor.commit();

                if(numberOfCheckboxesChecked ==5){
                Intent PickPowerball = new Intent(view.getContext(), Powerball_Main.class);
                startActivity(PickPowerball);}
                else{
                    Toast.makeText(Lottery_Main.this, "You must pick 5 numbers", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
    private String GenUserPick(String x) {
        String user_pick= "";
        if(cb1.isChecked()){user_pick += "1, ";}
        if (cb2.isChecked()){user_pick += "2, ";}
        if (cb3.isChecked()){user_pick +="3, ";}
        if (cb4.isChecked()){user_pick +="4, ";}
        if (cb5.isChecked()){user_pick +="5, ";}
        if (cb6.isChecked()){user_pick +="6, ";}
        if (cb7.isChecked()){user_pick +="7, ";}
        if (cb8.isChecked()){user_pick +="8, ";}
        if (cb9.isChecked()){user_pick +="9, ";}
        if (cb10.isChecked()){user_pick +="10, ";}
        if (cb11.isChecked()){user_pick +="11, ";}
        if (cb12.isChecked()){user_pick += "12, ";}
        if (cb13.isChecked()){user_pick += "13, ";}
        if (cb14.isChecked()){user_pick += "14, ";}
        if (cb15.isChecked()){user_pick += "15, ";}
        if (cb16.isChecked()){user_pick += "16, ";}
        if (cb17.isChecked()){user_pick += "17, ";}
        if (cb18.isChecked()){user_pick += "18, ";}
        if (cb19.isChecked()){user_pick += "19, ";}
        if (cb20.isChecked()){user_pick += "20, ";}
        if (cb21.isChecked()){user_pick += "21, ";}
        if (cb22.isChecked()){user_pick += "22, ";}
        if (cb23.isChecked()){user_pick += "23, ";}
        if (cb24.isChecked()){user_pick += "24, ";}
        if (cb25.isChecked()){user_pick += "25, ";}
        if (cb26.isChecked()){user_pick += "26, ";}
        if (cb27.isChecked()){user_pick += "27, ";}
        if (cb28.isChecked()){user_pick += "28, ";}
        if (cb29.isChecked()){user_pick += "29, ";}
        if (cb30.isChecked()){user_pick += "30, ";}
        if (cb31.isChecked()){user_pick += "31, ";}
        if (cb32.isChecked()){user_pick += "32, ";}
        if (cb33.isChecked()){user_pick += "33, ";}
        if (cb34.isChecked()){user_pick += "34, ";}
        if (cb35.isChecked()){user_pick += "35, ";}
        if (cb36.isChecked()){user_pick += "36, ";}
        if (cb37.isChecked()){user_pick += "37, ";}
        if (cb38.isChecked()){user_pick += "38, ";}
        if (cb39.isChecked()){user_pick += "39, ";}
        if (cb40.isChecked()){user_pick += "40, ";}
        if (cb41.isChecked()){user_pick += "41, ";}
        if (cb42.isChecked()){user_pick += "42, ";}
        if (cb43.isChecked()){user_pick += "43, ";}
        if (cb44.isChecked()){user_pick += "44, ";}
        if (cb45.isChecked()){user_pick += "45, ";}
        if (cb46.isChecked()){user_pick += "46, ";}
        if (cb47.isChecked()){user_pick += "47, ";}
        if (cb48.isChecked()){user_pick += "48, ";}
        if (cb49.isChecked()){user_pick += "49, ";}
        if (cb50.isChecked()){user_pick += "50, ";}
        if (cb51.isChecked()){user_pick += "51, ";}
        if (cb52.isChecked()){user_pick += "52, ";}
        if (cb53.isChecked()){user_pick += "53, ";}
        if (cb54.isChecked()){user_pick += "54, ";}
        if (cb55.isChecked()){user_pick += "55, ";}
        if (cb56.isChecked()){user_pick += "56, ";}
        if (cb57.isChecked()){user_pick += "57, ";}
        if (cb58.isChecked()){user_pick += "58, ";}
        if (cb59.isChecked()){user_pick += "59, ";}
        if (cb60.isChecked()){user_pick += "60, ";}
        if (cb61.isChecked()){user_pick += "61, ";}
        if (cb62.isChecked()){user_pick += "62, ";}
        if (cb63.isChecked()){user_pick += "63, ";}
        if (cb64.isChecked()){user_pick += "64, ";}
        if (cb65.isChecked()){user_pick += "65, ";}
        if (cb66.isChecked()){user_pick += "66, ";}
        if (cb67.isChecked()){user_pick += "67, ";}
        if (cb68.isChecked()){user_pick += "68, ";}
        if (cb69.isChecked()){user_pick += "69, ";}

        return user_pick;
    }

}
