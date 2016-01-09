package com.example.asif.hello;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String total = "";
    public String sign = "";
    public Double temp1, temp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        Button button1 = (Button)(findViewById(R.id.button1));
        Button button2 = (Button)(findViewById(R.id.button2));
        Button button3 = (Button)(findViewById(R.id.button3));
        Button button4 = (Button)(findViewById(R.id.button4));
        Button button5 = (Button)(findViewById(R.id.button5));
        Button button6 = (Button)(findViewById(R.id.button6));
        Button button7 = (Button)(findViewById(R.id.button7));
        Button button8 = (Button)(findViewById(R.id.button8));
        Button button9 = (Button)(findViewById(R.id.button9));
        Button button0 = (Button)(findViewById(R.id.button0));

        Button buttonCln = (Button)(findViewById(R.id.buttonCln));
        Button buttonEqu = (Button)(findViewById(R.id.buttonEqu));
        Button buttonAdd = (Button)(findViewById(R.id.buttonAdd));
        Button buttonSub = (Button)(findViewById(R.id.buttonSub));
        Button buttonMul = (Button)(findViewById(R.id.buttonMul));
        Button buttonDiv = (Button)(findViewById(R.id.buttonDiv));

        // button0 event
        button0.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View b)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("0");
                    }
                }
        );

        // button1 event
        button1.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View b)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("1");
                    }
                }
        );

        // button2 event
        button2.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View b)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("2");
                    }
                }
        );

        // button3 event
        button3.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View b)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("3");
                    }
                }
        );

        // button4 event
        button4.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View b)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("4");
                    }
                }
        );

        // button5 event
        button5.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View b)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("5");
                    }
                }
        );

        // button6 event
        button6.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View b)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("6");
                    }
                }
        );

        // button7 event
        button7.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View b)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("7");
                    }
                }
        );

        // button8 event
        button8.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View b)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("8");
                    }
                }
        );

        // button9 event
        button9.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View b)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("9");
                    }
                }
        );

        // buttonClean event
        buttonCln.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View b)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.setText("");
                    }
                }
        );

        // buttonAddition event
        buttonAdd.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View b)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        temp1 = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = ("+");
                    }
                }
        );

        // buttonSubtraction event
        buttonSub.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View b)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        temp1 = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = ("-");
                    }
                }
        );

        // buttonMultiplication event
        buttonMul.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View b)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        temp1 = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = ("X");
                    }
                }
        );

        // buttonDivide event
        buttonDiv.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View b)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        temp1 = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = ("/");
                    }
                }
        );

        // buttonEquals event
        buttonEqu.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View b)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        temp2 = Double.parseDouble(output.getText().toString());

                        if (sign == "+"){
                            output.setText(Double.toString(temp1 + temp2));
                        }

                        else if (sign == "-"){
                            output.setText(Double.toString(temp1 - temp2));
                        }

                        else if (sign == "X"){
                            output.setText(Double.toString(temp1 * temp2));
                        }

                        else if (sign == "/")
                        {
                        if (temp2 == 0){
                            output.setText("Invalid Input");
                        }
                        else{
                            output.setText(Double.toString(temp1 / temp2));
                            }
                        }
                        sign = "";
                    }
                }
        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
