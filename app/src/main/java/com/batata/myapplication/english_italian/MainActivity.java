package com.batata.myapplication.english_italian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.edt0_1);
        textView=findViewById(R.id.txtNewname);
    }

    public void Onclickbtn(View view) {
        String str="";
        String Gettext=editText1.getText().toString();
        if(Gettext.length()>0)
        for (int i = 0; Gettext.length() > i; i++) {
            switch (Gettext.charAt(i)) {
                case 'a':
                case 'A':
                    str+=" " + "a";
                    break;
                case 'b':
                case 'B':
                    str+=" " + "bi";
                    break;
                case 'c':
                case 'C':
                    str+=" " + "ci";
                    break;
                case 'd':
                case 'D':
                    str+=" " + "di";
                    break;
                case 'e':
                case 'E':
                    str+=" " + "e";
                    break;
                case 'f':
                case 'F':
                    str+=" " + "effe";
                    break;
                case 'g':
                case 'G':
                    str+=" " + "gi";
                    break;
                case 'h':
                case 'H':
                    str+=" " + "acca";
                    break;
                case 'i':
                case 'I':
                    str+=" " + "i";
                    break;
                case 'j':
                case 'J':
                    str+=" " + "i lungo";
                    break;
                case 'k':
                case 'K':
                    str+=" " + "kappa";
                    break;
                case 'l':
                case 'L':
                    str+=" " + "elle";
                    break;

                case 'm':
                case 'M':
                    str+=" " + "emme";
                    break;
                case 'n':
                case 'N':
                    str+=" " + "enne";
                    break;
                case 'o':
                case 'O':
                    str+=" " + "o";
                    break;
                case 'p':
                case 'P':
                    str+=" " + "Pi";
                    break;
                case 'q':
                case 'Q':
                    str+=" " + "cu";
                    break;
                case 'r':
                case 'R':
                    str+=" " + "erre";
                    break;
                case 's':
                case 'S':
                    str+=" " + "esse";
                    break;
                case 't':
                case 'T':
                    str+=" " + "ti";
                    break;
                case 'u':
                case 'U':
                    str+=" " + "u";
                    break;
                case 'v':
                case 'V':
                    str+=" " + "vu";
                    break;
                case 'w':
                case 'W':
                    str+=" " + "doppia vu";
                    break;
                case 'x':
                case 'X':
                    str+=" " + "ics";
                    break;
                case 'y':
                case 'Y':
                    str+=" " + "ipsilo";
                    break;
                case 'z':
                case 'Z':
                    str+=" " + "zeta";
                    break;
                case 32:
                    str+="\n";
                    default:
                    break;
            }
        }
        textView.setText(str);
    }
}