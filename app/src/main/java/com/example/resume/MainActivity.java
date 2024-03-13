package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import org.intellij.lang.annotations.Language;

public class MainActivity extends AppCompatActivity {

    Button btnsubmit;
    CheckBox chkenlish,chkhindi,chkgujarati,chkmarathi;

    CheckBox chksinging,chkdancing,chkgym,chkreading,chkcyclling,chkmovies,chkcricket,chktravalling;

    CheckBox chkms,chkskills,chksteam,chkproblem,chkleader,chktime;

    EditText edt10th, edt12th,edtgraduation,edtyear10th,edtyear12th,edtyeargraduation;

    TextInputEditText edtfullname,edtnumber,edtemail,edtaddress,edtexperience;

    RadioGroup rggender,RGmarital;

    RadioButton rg,marital;

    StringBuilder Language = new StringBuilder();
    StringBuilder skills = new StringBuilder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();


    }

    private void initview() {

        // edit text
        btnsubmit=findViewById(R.id.btnsubmit);
        edtfullname=findViewById(R.id.edtfullname);
        edtnumber=findViewById(R.id.edtnumber);
        edtemail=findViewById(R.id.edtemail);
        edtaddress=findViewById(R.id.edtaddress);



        // languages
        chkenlish=findViewById(R.id.chkenlish);
        chkhindi=findViewById(R.id.chkhindi);
        chkgujarati=findViewById(R.id.chkgujarati);
        chkmarathi=findViewById(R.id.chkmarathi);

        //gender
        rggender= findViewById(R.id.rggender);
        RGmarital = findViewById(R.id.RGmarital);

        // hobbies
        chksinging = findViewById(R.id.chksinging);
        chkdancing = findViewById(R.id.chkdancing);
        chkgym = findViewById(R.id.chkgym);
        chkreading = findViewById(R.id.chkreading);
        chkcyclling = findViewById(R.id.chkcyclling);
        chkmovies = findViewById(R.id.chkmovies);
        chkcricket = findViewById(R.id.chkcricket);
        chktravalling = findViewById(R.id.chktravalling);

        //job
        edtexperience= findViewById(R.id.edtexperience);

        // marks
        edt10th = findViewById(R.id.edt10th);
        edt12th = findViewById(R.id.edt12th);
        edtgraduation = findViewById(R.id.edtgraduation);

        edtyear10th = findViewById(R.id.edtyear10th);
        edtyear12th = findViewById(R.id.edtyear12th);
        edtyeargraduation = findViewById(R.id.edtyeargraduation);

        // skills
        chkms = findViewById(R.id.chkms);
        chkskills = findViewById(R.id.chkskills);
        chksteam = findViewById(R.id.chksteam);
        chkproblem = findViewById(R.id.chkproblem);
        chkleader = findViewById(R.id.chkleader);
        chktime = findViewById(R.id.chktime);





        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


             String  Name = edtfullname.getText().toString();
             String  Phone = edtnumber.getText().toString();
             String   Email= edtemail.getText().toString();
             String Address = edtaddress.getText().toString();


//             String english = edtaddress.getText().toString();


             String per10 = edt10th.getText().toString();
             String per12 = edt12th.getText().toString();
             String pergra = edtgraduation.getText().toString();
             String year10 = edtyear10th.getText().toString();
             String year12 = edtyear12th.getText().toString();
             String yeargra = edtyeargraduation.getText().toString();

             String experience = edtexperience.getText().toString();

//             String msoffice = chkenlish.getText().toString();




                int SelectRadiobutton = rggender.getCheckedRadioButtonId();
                int SelectMaritalbutton = RGmarital.getCheckedRadioButtonId();


                rg = findViewById(SelectRadiobutton);
                String Gender = rg.getText().toString();

                marital = findViewById(SelectMaritalbutton);
                String Status = marital.getText().toString();



                // personal details -----------


                if(edtfullname.getText().toString().isEmpty()==true)
                {

                    Toast.makeText(MainActivity.this, "Please enter firstname", Toast.LENGTH_SHORT).show();
                }
                else if (edtnumber.getText().toString().isEmpty()== true)
                {
                    Toast.makeText(MainActivity.this, "Please enter phone number", Toast.LENGTH_SHORT).show();
                }
                else if (edtemail.getText().toString().isEmpty()== true)
                {
                    Toast.makeText(MainActivity.this, "Please enter email", Toast.LENGTH_SHORT).show();
                }

                else if (edtaddress.getText().toString().isEmpty()== true)
                {
                    Toast.makeText(MainActivity.this, "Please enter Address", Toast.LENGTH_SHORT).show();
                }



                // languages -----------

                if (chkenlish.isChecked())
                {
//                    Toast.makeText(MainActivity.this, "Please select languages", Toast.LENGTH_SHORT).show();
                    Language.append(" " + chkenlish.getText().toString());

                }

              if (chkhindi.isChecked())
                {
//                    Toast.makeText(MainActivity.this, "Please select languages", Toast.LENGTH_SHORT).show();
                    Language.append(" " + chkhindi.getText().toString());

                }

                 if ( chkgujarati.isChecked())
                {
//                    Toast.makeText(MainActivity.this, "Please select languages", Toast.LENGTH_SHORT).show();
                    Language.append(" " + chkgujarati.getText().toString());



                }

               if (chkmarathi.isChecked())
                {
//                    Toast.makeText(MainActivity.this, "Please select languages", Toast.LENGTH_SHORT).show();
                    Language.append(" " + chkmarathi.getText().toString());

                }
               else if(Language == null)
               {
                   Toast.makeText(MainActivity.this, "Please Select Language", Toast.LENGTH_SHORT).show();
               }


               // radio button ----------------------------------------------------------------------------------------

                else  if (SelectRadiobutton == -1 )
                {
                    rg=findViewById(SelectRadiobutton);
                    Toast.makeText(MainActivity.this, "Please select Gender", Toast.LENGTH_SHORT).show();

                }



                // marital button ----------------------------------------------------------------------------------------

                if (SelectMaritalbutton == -1 )
                {
                    marital=findViewById(SelectMaritalbutton);
                    Toast.makeText(MainActivity.this, "Please select Marital", Toast.LENGTH_SHORT).show();

                }

                // hobbies -----------

                else  if (chksinging.isChecked() == false && chkdancing.isChecked() == false && chkgym.isChecked() == false && chkreading.isChecked() == false && chkcyclling.isChecked() == false && chkmovies.isChecked() == false && chkcricket.isChecked() == false && chktravalling.isChecked() == false)
                {
                    Toast.makeText(MainActivity.this, "Please select Hobbies", Toast.LENGTH_SHORT).show();

                }

                // marks

                else if (edt10th.getText().toString().isEmpty()== true)
                {
                    edt10th.setError("Please enter percentages");
                    Toast.makeText(MainActivity.this, "Please enter percentages", Toast.LENGTH_SHORT).show();
                }

                else if (edt12th.getText().toString().isEmpty()== true)
                {
                    edt12th.setError("Please enter percentages");
                    Toast.makeText(MainActivity.this, "Please enter percentages", Toast.LENGTH_SHORT).show();
                }

                else if (edtgraduation.getText().toString().isEmpty()== true)
                {
                    edtgraduation.setError("Please enter percentages");
                    Toast.makeText(MainActivity.this, "Please enter percentages", Toast.LENGTH_SHORT).show();
                }


                else if (edtyear10th.getText().toString().isEmpty()== true)
                {
                    edtyear10th.setError("Please enter passing year");
                    Toast.makeText(MainActivity.this, "Please enter passing year", Toast.LENGTH_SHORT).show();
                }

                else if (edtyear12th.getText().toString().isEmpty()== true)
                {
                    edtyear12th.setError("Please enter passing year");
                    Toast.makeText(MainActivity.this, "Please enter passing year", Toast.LENGTH_SHORT).show();
                }

                else if (edtyeargraduation.getText().toString().isEmpty()== true)
                {
                    edtyeargraduation.setError("Please enter passing year");
                    Toast.makeText(MainActivity.this, "Please enter passing year", Toast.LENGTH_SHORT).show();
                }

                // job -----------

                else if (edtexperience.getText().toString().isEmpty()== true)
                {
                    edtexperience.setError("Please enter experience");
                    Toast.makeText(MainActivity.this, "Please enter experience", Toast.LENGTH_SHORT).show();
                }

                //skills--------------

                  if (chkms.isChecked() )
                {
                    skills.append(" "+chkms.getText().toString());

                }
                  if ( chkskills.isChecked())
                {
                    skills.append(" "+chkskills.getText().toString());

                }

                  if ( chksteam.isChecked()  )
                {
//
                    skills.append(" "+chksteam.getText().toString());

                }



                  if ( chkproblem.isChecked() )
                {
                    skills.append(" "+chkproblem.getText().toString());

                }

                  if ( chkleader.isChecked()   )
                {
                    skills.append(" "+chkleader.getText().toString());

                }

                  if (chktime.isChecked() )
                {
                    skills.append(" "+chktime.getText().toString());

                }

                  else if(skills == null)
                  {
                      Toast.makeText(MainActivity.this, "Please Select skills", Toast.LENGTH_SHORT).show();
                  }

                  else
                {
                    Intent i=new Intent(MainActivity.this,FullDetails.class);


                    i.putExtra("edtfullname",Name);
                    i.putExtra("edtnumber",Phone);
                    i.putExtra("edtemail",Email);
                    i.putExtra("edtaddress",Address);

//

                    i.putExtra("SelectRadiobutton",Gender);
                    i.putExtra("SelectMaritalbutton",Status);


                    i.putExtra("Language",""+Language);

                    i.putExtra("edt10th",per10);
                    i.putExtra("edt12th",per12);
                    i.putExtra("edtgraduation",pergra);
                    i.putExtra("edtyear10th",year10);
                    i.putExtra("edtyear12th",year12);
                    i.putExtra("edtyeargraduation",yeargra);

                    i.putExtra("edtexperience",experience);
//
                    i.putExtra("skillses"," "+skills);

                    startActivity(i);
                }


            }
        });
    }
}

