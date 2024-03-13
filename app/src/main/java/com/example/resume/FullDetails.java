package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FullDetails extends AppCompatActivity {

   TextView txtfullname,txtnumber,txtemail,txtaddress,txtlanguages,txtgender,txtstatus,txtmsoffice;

   TextView txt10th,txt12th,txtgraduation,txtpass10th,txtpass12th,txtpassgraduation,txtworked;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_details);

        initview();
    }

    private void initview()
    {

//        chkenlish,chkhindi,chkgujarati,chkmarathi

        txtfullname = findViewById(R.id.txtfullname);
        txtnumber = findViewById(R.id.txtnumber);
        txtemail = findViewById(R.id.txtemail);
        txtaddress = findViewById(R.id.txtaddress);

        txtlanguages = findViewById(R.id.txtlanguages);

        txtgender = findViewById(R.id.txtgender);

        txtstatus = findViewById(R.id.txtstatus);

        txt10th = findViewById(R.id.txt10th);
        txt12th = findViewById(R.id.txt12th);
        txtgraduation = findViewById(R.id.txtgraduation);
        txtpass10th = findViewById(R.id.txtpass10th);
        txtpass12th = findViewById(R.id.txtpass12th);
        txtpassgraduation = findViewById(R.id.txtpassgraduation);

        txtworked = findViewById(R.id.txtworked);

        txtmsoffice = findViewById(R.id.txtmsoffice);

        String language;

        String Name = getIntent().getExtras().getString("edtfullname");
        String Phone = getIntent().getExtras().getString("edtnumber");
        String Email = getIntent().getExtras().getString("edtemail");
        String Address = getIntent().getExtras().getString("edtaddress");

         language= getIntent().getStringExtra("Language");

        String gender = getIntent().getExtras().getString("SelectRadiobutton");
        String status = getIntent().getExtras().getString("SelectMaritalbutton");

        String percen10 = getIntent().getExtras().getString("edt10th");
        String percen12 = getIntent().getExtras().getString("edt12th");
        String percengra = getIntent().getExtras().getString("edtgraduation");
        String pass10 = getIntent().getExtras().getString("edtyear10th");
        String pass12 = getIntent().getExtras().getString("edtyear12th");
        String passgra = getIntent().getExtras().getString("edtyeargraduation");

        String Experience = getIntent().getExtras().getString("edtexperience");

        String skils = getIntent().getExtras().getString("skillses");



        txtfullname.setText("Full Name:-"+Name);
        txtnumber.setText("PHONE NUMBER :-" + Phone);
        txtemail.setText("EMAIL :-"+ Email);
        txtaddress.setText("ADDRESS :-"+ Address);


        txtlanguages.setText("Languages:-" + language);

        txtgender.setText("GENDER :-"+gender);
        txtstatus.setText("STATUS :-"+status);



        txt10th.setText("10th(%) :-"+percen10);
        txt12th.setText("12th(%) :-"+percen12);
        txtgraduation.setText("Graduation(%) :-"+percengra);
        txtpass10th.setText("Passing Year(10th) :-"+pass10);
        txtpass12th.setText("Passing Year(12th) :-"+pass12);
        txtpassgraduation.setText("Passing Year(Graduation) :-"+passgra);

        txtworked.setText("EXPERIENCE :-"+Experience);

        txtmsoffice.setText("SKILLS :-" +skils);






    }
}