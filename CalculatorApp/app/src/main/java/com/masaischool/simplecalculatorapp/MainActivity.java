package com.masaischool.simplecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int inputOne = 0, inputTwo = 0;
    TextView editInput;
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnAdd, btnSub, btnMul, btnDiv, btnEqual, btnClear, btnModulus, btnPower, btnDecimal, btnAllClear;
    boolean Addition, Subtract, Multiply, Division, Decimal, Modulus, Power;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnModulus = (Button) findViewById(R.id.btnModulus);
        btnDecimal = (Button) findViewById(R.id.btnDecimal);
        btnAllClear = (Button) findViewById(R.id.btnAllClear);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnModulus = (Button) findViewById(R.id.btnModulus);
        btnPower = (Button) findViewById(R.id.btnPower);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnEqual = (Button) findViewById(R.id.btnEqual);

        editInput = (TextView) findViewById(R.id.etTextBar);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "9");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(editInput.getText() + "0");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editInput.getText().length() != 0) {
                    inputOne = Integer.parseInt(editInput.getText() + "");
                    Addition = true;
                    editInput.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editInput.getText().length() != 0) {
                    inputOne = Integer.parseInt(editInput.getText() + "");
                    Subtract = true;
                    editInput.setText(null);
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editInput.getText().length() != 0) {
                    inputOne = Integer.parseInt(editInput.getText() + "");
                    Multiply = true;
                    editInput.setText(null);
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editInput.getText().length() != 0) {
                    inputOne = (int) Float.parseFloat(editInput.getText() + "");
                    Division = true;
                    editInput.setText(null);
                }
            }
        });

        btnModulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editInput.getText().length() != 0) {
                    inputOne = Integer.parseInt(editInput.getText() + "");
                    Modulus = true;
                    editInput.setText(null);
                }
            }
        });

        btnPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editInput.getText().length() != 0) {
                    inputOne = Integer.parseInt(editInput.getText() + "");
                    Power = true;
                    editInput.setText(null);
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Addition || Subtract || Multiply || Division || Modulus || Power) {
                    inputTwo = Integer.parseInt(editInput.getText() + "");
                }

                if (Addition) {

                    editInput.setText(inputOne + inputTwo + "");
                    Addition = true;
                }

                if (Subtract) {

                    editInput.setText(inputOne - inputTwo + "");
                    Subtract = true;
                }

                if (Multiply) {
                    editInput.setText(inputOne * inputTwo + "");
                    Multiply = true;
                }

                if (Division) {
                    editInput.setText(inputOne / inputTwo + "");
                    Division = true;
                }

                if (Modulus) {
                    editInput.setText(inputOne % inputTwo + "");
                    Modulus = true;
                }

                if (Power) {
                    editInput.setText(Math.pow(inputOne, inputTwo) + "");
                    Power = true;
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.btnClear) {
                    String clear = editInput.getText().toString();
                    clear = clear.substring(0, clear.length() - 1);
                    editInput.setText(clear);
                }
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Decimal) {

                } else {
                    editInput.setText(editInput.getText() + ".");
                    Decimal = true;
                }
            }

        });

        btnAllClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(null);
                inputOne = 0;
                inputTwo = 0;
            }
        });
    }
}