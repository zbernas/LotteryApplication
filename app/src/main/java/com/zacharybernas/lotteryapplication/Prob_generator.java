package com.zacharybernas.lotteryapplication;

import java.util.*;


public class Prob_generator {

    public int Prob_Num(int x) {
        Random r = new Random();
        double prob = 0.0 + (1.0000 - 0.0) * r.nextDouble();
        prob = Math.round(prob * 10000.0) / 10000.0;

        if (0.0 <= prob && prob <= 0.0245) {
            x = 32;
        } else if (0.0246 <= prob && prob <= 0.0466) {
            x = 23;
        } else if (0.0467 <= prob && prob <= 0.0687) {
            x = 28;
        } else if (0.0688 <= prob && prob <= 0.0908) {
            x = 69;
        } else if (0.0909 <= prob && prob <= 0.1121) {
            x = 64;
        } else if (0.1122 <= prob && prob <= 0.1318) {
            x = 16;
        } else if (0.1319 <= prob && prob <= 0.1515) {
            x = 62;
        } else if (0.1516 <= prob && prob <= 0.1712) {
            x = 63;
        } else if (0.1713 <= prob && prob <= 0.1893) {
            x = 3;
        } else if (0.1894 <= prob && prob <= 0.2074) {
            x = 61;
        } else if (0.2075 <= prob && prob <= 0.2247) {
            x = 25;
        } else if (0.2248 <= prob && prob <= 0.2420) {
            x = 33;
        } else if (0.2421 <= prob && prob <= 0.2593) {
            x = 40;
        } else if (0.2594 <= prob && prob <= 0.2766) {
            x = 41;
        } else if (0.2767 <= prob && prob <= 0.2932) {
            x = 12;
        } else if (0.2933 <= prob && prob <= 0.3098) {
            x = 20;
        } else if (0.3099 <= prob && prob <= 0.3264) {
            x = 52;
        } else if (0.3265 <= prob && prob <= 0.3422) {
            x = 9;
        } else if (0.3423 <= prob && prob <= 0.3580) {
            x = 54;
        } else if (0.3581 <= prob && prob <= 0.3738) {
            x = 57;
        } else if (0.3739 <= prob && prob <= 0.3896) {
            x = 66;
        } else if (0.3897 <= prob && prob <= 0.4046) {
            x = 10;
        } else if (0.4047 <= prob && prob <= 0.4196) {
            x = 17;
        } else if (0.4197 <= prob && prob <= 0.4346) {
            x = 19;
        } else if (0.4347 <= prob && prob <= 0.4496) {
            x = 30;
        } else if (0.4497 <= prob && prob <= 0.4646) {
            x = 31;
        } else if (0.4647 <= prob && prob <= 0.4796) {
            x = 37;
        } else if (0.4797 <= prob && prob <= 0.4946) {
            x = 44;
        } else if (0.4947 <= prob && prob <= 0.5096) {
            x = 59;
        } else if (0.5097 <= prob && prob <= 0.5246) {
            x = 68;
        } else if (0.5247 <= prob && prob <= 0.5388) {
            x = 13;
        } else if (0.5389 <= prob && prob <= 0.5530) {
            x = 21;
        } else if (0.5531 <= prob && prob <= 0.5672) {
            x = 27;
        } else if (0.5673 <= prob && prob <= 0.5814) {
            x = 29;
        } else if (0.5815 <= prob && prob <= 0.5956) {
            x = 53;
        } else if (0.5957 <= prob && prob <= 0.6098) {
            x = 67;
        } else if (0.6099 <= prob && prob <= 0.6232) {
            x = 5;
        } else if (0.6233 <= prob && prob <= 0.6366) {
            x = 18;
        } else if (0.6367 <= prob && prob <= 0.6500) {
            x = 26;
        } else if (0.6501 <= prob && prob <= 0.6634) {
            x = 36;
        } else if (0.6635 <= prob && prob <= 0.6768) {
            x = 39;
        } else if (0.6769 <= prob && prob <= 0.6902) {
            x = 47;
        } else if (0.6903 <= prob && prob <= 0.7036) {
            x = 48;
        } else if (0.7037 <= prob && prob <= 0.7170) {
            x = 50;
        } else if (0.7171 <= prob && prob <= 0.7296) {
            x = 1;
        } else if (0.7297 <= prob && prob <= 0.7422) {
            x = 7;
        } else if (0.7423 <= prob && prob <= 0.7548) {
            x = 11;
        } else if (0.7459 <= prob && prob <= 0.7674) {
            x = 14;
        } else if (0.7675 <= prob && prob <= 0.7800) {
            x = 22;
        } else if (0.7800 <= prob && prob <= 0.7926) {
            x = 24;
        } else if (0.7927 <= prob && prob <= 0.8052) {
            x = 42;
        } else if (0.8053 <= prob && prob <= 0.8178) {
            x = 49;
        } else if (0.8179 <= prob && prob <= 0.8304) {
            x = 60;
        } else if (0.8305 <= prob && prob <= 0.8422) {
            x = 2;
        } else if (0.8423 <= prob && prob <= 0.8532) {
            x = 8;
        } else if (0.8533 <= prob && prob <= 0.8642) {
            x = 15;
        } else if (0.8643 <= prob && prob <= 0.8784) {
            x = 51;
        } else if (0.8785 <= prob && prob <= 0.8894) {
            x = 55;
        } else if (0.8895 <= prob && prob <= 0.9004) {
            x = 56;
        } else if (0.9005 <= prob && prob <= 0.9114) {
            x = 58;
        } else if (0.9115 <= prob && prob <= 0.9216) {
            x = 6;
        } else if (0.9217 <= prob && prob <= 0.9318) {
            x = 38;
        } else if (0.9319 <= prob && prob <= 0.9420) {
            x = 43;
        } else if (0.9421 <= prob && prob <= 0.9522) {
            x = 45;
        } else if (0.9523 <= prob && prob <= 0.9624) {
            x = 46;
        } else if (0.9625 <= prob && prob <= 0.9726) {
            x = 65;
        } else if (0.9727 <= prob && prob <= 0.9820) {
            x = 4;
        } else if (0.9821 <= prob && prob <= 0.9914) {
            x = 34;
        } else if (0.9915 <= prob && prob <= 1.0000) {
            x = 35;
        }

        return x;
    }

    public int Prob_pow(int y) {
        Random r = new Random();
        double prob_pow = 0.0 + (1.0000 - 0.0) * r.nextDouble();
        prob_pow = Math.round(prob_pow * 10000.0) / 10000.0;

        if (0.0 <= prob_pow && prob_pow <= 0.0592) {
            y = 9;
        } else if (0.0593 <= prob_pow && prob_pow <= 0.1105) {
            y = 6;
        } else if (0.1106 <= prob_pow && prob_pow <= 0.1579) {
            y = 10;
        } else if (0.1580 <= prob_pow && prob_pow <= 0.2053) {
            y = 21;
        } else if (0.2054 <= prob_pow && prob_pow <= 0.2527) {
            y = 24;
        } else if (0.2528 <= prob_pow && prob_pow <= 0.2961) {
            y = 3;
        } else if (0.2962 <= prob_pow && prob_pow <= 0.3395) {
            y = 13;
        } else if (0.3396 <= prob_pow && prob_pow <= 0.3829) {
            y = 19;
        } else if (0.3830 <= prob_pow && prob_pow <= 0.4263) {
            y = 22;
        } else if (0.4264 <= prob_pow && prob_pow <= 0.4697) {
            y = 25;
        } else if (0.4698 <= prob_pow && prob_pow <= 0.5092) {
            y = 4;
        } else if (0.5093 <= prob_pow && prob_pow <= 0.5487) {
            y = 5;
        } else if (0.5488 <= prob_pow && prob_pow <= 0.5882) {
            y = 8;
        } else if (0.5883 <= prob_pow && prob_pow <= 0.6277) {
            y = 12;
        } else if (0.6278 <= prob_pow && prob_pow <= 0.6672) {
            y = 15;
        } else if (0.6673 <= prob_pow && prob_pow <= 0.7067) {
            y = 17;
        } else if (0.7068 <= prob_pow && prob_pow <= 0.7422) {
            y = 11;
        } else if (0.7423 <= prob_pow && prob_pow <= 0.7777) {
            y = 20;
        } else if (0.7778 <= prob_pow && prob_pow <= 0.8132) {
            y = 26;
        } else if (0.8133 <= prob_pow && prob_pow <= 0.8448) {
            y = 2;
        } else if (0.8449 <= prob_pow && prob_pow <= 0.8764) {
            y = 7;
        } else if (0.8765 <= prob_pow && prob_pow <= 0.9080) {
            y = 16;
        } else if (0.9080 <= prob_pow && prob_pow <= 0.9356) {
            y = 1;
        } else if (0.9357 <= prob_pow && prob_pow <= 0.9632) {
            y = 18;
        } else if (0.9633 <= prob_pow && prob_pow <= 0.9869) {
            y = 23;
        } else if (0.9870 <= prob_pow && prob_pow <= 1.0000) {
            y = 14;
        }

        return y;
    }

    public static String powballNum(String pbNum) {
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, pow = 0, count = 0;
        double test = 0.0;
        String answ;
        Random r = new Random();
        Scanner k = new Scanner(System.in);
        Prob_generator n = new Prob_generator();



            n1 = n.Prob_Num(n1);
            n2 = n.Prob_Num(n2);
            n3 = n.Prob_Num(n3);
            n4 = n.Prob_Num(n4);
            n5 = n.Prob_Num(n5);
            pow = n.Prob_pow(pow);
            count = 0;
            while (count < 5) {
                if (n1 != n2 && n1 != n3 && n1 != n4 && n1 != n5) {
                    if (n1 != n2 && n2 != n3 && n2 != n4 && n2 != n5) {
                        if (n1 != n3 && n2 != n3 && n3 != n4 && n3 != n5) {
                            if (n1 != n4 && n2 != n4 && n3 != n4 && n4 != n5) {
                                if (n1 != n5 && n2 != n5 && n3 != n5 && n4 != n5) {
                                    count = 5;
                                } else {
                                    count = 0;
                                    n5 = n.Prob_Num(n5);
                                }

                            } else {
                                count = 0;
                                n4 = n.Prob_Num(n4);
                            }
                        } else {
                            count = 0;
                            n3 = n.Prob_Num(n3);
                        }

                    } else {
                        count = 0;
                        n2 = n.Prob_Num(n2);
                    }
                } else {
                    count = 0;
                    n1 = n.Prob_Num(n1);
                }
            }

            answ = (n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ", power ball: " + pow);

            return answ;

        }
}

