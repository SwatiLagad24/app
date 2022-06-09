package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private EditText edtEnterNumber;
    private TextView txtColorPanelOne;
    private TextView txtColorPanelTwo;
    private TextView txtColorPanelThree;
    private TextView txtColorPanelFour;
    private TextView ;
    private Button btnChangeColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLinearLayout = new LinearLayout(this);
        mainLinearLayout.setOrientation(LinearLayout.VERTICAL);
        mainLinearLayout.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        mainLinearLayout.setPadding(20, 20, 20, 20);

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        mainLinearLayout.setLayoutParams(layoutParams);

        ViewGroup.LayoutParams paramsForView = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        txtColorPanelOne = new TextView(this);
        txtColorPanelOne.setBackgroundColor(Color.WHITE);
        txtColorPanelOne.setLayoutParams(paramsForView);
        txtColorPanelOne.setPadding(20, 20, 20, 20);
        mainLinearLayout.addView(txtColorPanelOne);

        txtColorPanelTwo = new TextView(this);
        txtColorPanelTwo.setBackgroundColor(Color.WHITE);
        txtColorPanelTwo.setLayoutParams(paramsForView);
        txtColorPanelTwo.setPadding(20, 20, 20, 20);

        mainLinearLayout.addView(txtColorPanelTwo);

        txtColorPanelThree = new TextView(this);
        txtColorPanelThree.setBackgroundColor(Color.WHITE);
        txtColorPanelThree.setLayoutParams(paramsForView);
        txtColorPanelThree.setPadding(20, 20, 20, 20);
        mainLinearLayout.addView(txtColorPanelThree);

        txtColorPanelFour = new TextView(this);
        txtColorPanelFour.setBackgroundColor(Color.WHITE);
        txtColorPanelFour.setLayoutParams(paramsForView);
        txtColorPanelFour.setPadding(20, 20, 20, 20);
        mainLinearLayout.addView(txtColorPanelFour);

        edtEnterNumber = new EditText(this);
        edtEnterNumber.setHint("Enter color code ");
        edtEnterNumber.setLayoutParams(paramsForView);
        mainLinearLayout.addView(edtEnterNumber);

        btnChangeColor = new Button(this);
        btnChangeColor.setText("Change Color");
        mainLinearLayout.addView(btnChangeColor);


        setContentView(mainLinearLayout);
        btnChangeColor.setOnClickListener(new btnEvent());

    }

    class btnEvent implements View.OnClickListener {

        @Override
        public void onClick(View view) {
           String checkColorCode=edtEnterNumber.getText().toString();

           switch (checkColorCode){
               case "1":
                        txtColorPanelOne.setBackgroundColor(Color.RED);
                        break;
               case "2":
                        txtColorPanelTwo.setBackgroundColor(Color.GRAY);
                        break;
               case "3":
                        txtColorPanelThree.setBackgroundColor(Color.CYAN);
                        break;
               case "4":
                        txtColorPanelFour.setBackgroundColor(Color.YELLOW);
                        break;
               default:
                        edtEnterNumber.setText("Enter valid Color Code");
           }
        }
    }
}