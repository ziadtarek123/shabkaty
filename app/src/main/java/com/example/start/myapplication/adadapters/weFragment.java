package com.example.start.myapplication.adadapters;




import android.Manifest;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.start.myapplication.R;
import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;

import java.io.IOException;

/**
 * A simple {@link Fragment} subclass.
 */


public class weFragment extends Fragment {

    long animaionDuration00=100;
    long animaionDuration=200;
    long animaionDuration1=250;
    long animaionDuration2=300;
    long animaionDuration3=350;
    long animaionDuration4=400;
    long animaionDuration5=600;
    long animaionDuration55=5800;



    public Button button1,button2,button3,button4,
            buttony1,buttony2,buttony3,buttony4,buttony5,buttony6,buttony7,buttony8,buttony9,buttony10,buttony11,buttony12,buttony13,buttony14,buttony15,buttony16,
            buttonn1,buttonn2,buttonn3,buttonn4,buttonn5,buttonn6,buttonn7,buttonn8,buttonn9,buttonn10,buttonn11,buttonn12,buttonn13,buttonn14,buttonn15,buttonn16,
            cameraon,cameraoff,
            voda1,voda2,voda3,voda4,voda5,voda6,voda7
            ,       btnmoney
            ,       buttonex
            ,       btncallme1
            , btncallme2
            ;

    public EditText editText1,editText2,editText3,plantext1,plantext2 ,textcallme2,textcallme;

    public CardView card2,card3,card4,card5,card6,card7,card8,card9,card10,card11,card12,card13,card14,card15,
            cardl1,cardl2,cardl3,cardl4,cardl5,cardl6,cardl7,cardl8,cardl9,cardl10,cardl11,cardl12,cardl13,cardl14,cardl15,cardl16,
            cardcam1,
            card02,card03,card04,card05,
            cardch0,cardch1,cardch2,
            cardnet1,cardnet11;

    public TextView number1,money1,le1;

    public LinearLayout lv2,lv3,lv03,lv04,lv05,lv06,lv07,lv08,lv09,lvch1,
            lv10,lv20,lv30,lv40,lv50,lv60,lv70,lv80;

    public ConstraintLayout con1,callme1,callme2,slide1,slide2,slide3;

    public HorizontalScrollView sc1,sc2;



    public SurfaceView surfaceView;







//-----------------------------------------------------------CAMERA-------------------------------------------------//

    SurfaceView cameraView;
    EditText textView;
    CameraSource cameraSource;
    final int RequestCameraPermissionID = 1001;


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode)
        {
            case RequestCameraPermissionID:
            {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED )
                {
                    if (ActivityCompat.checkSelfPermission(weFragment.super.getContext(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                        return;
                    }
                    try {
                        cameraSource.start(cameraView.getHolder());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }






//--------------------------------------------------------------------------------------------------------------------//


    public weFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        final View view=inflater.inflate(R.layout.fragment_we, container, false);






        lv2=(LinearLayout)view.findViewById(R.id.lv2);
        lv3=(LinearLayout)view.findViewById(R.id.lv3);


        con1=(ConstraintLayout)view.findViewById(R.id.con1);
        callme1=(ConstraintLayout)view.findViewById(R.id.callme1);
        callme2=(ConstraintLayout)view.findViewById(R.id.callme2);

        slide1=(ConstraintLayout)view.findViewById(R.id.slide1);
        slide2=(ConstraintLayout)view.findViewById(R.id.slide2);
        slide3=(ConstraintLayout)view.findViewById(R.id.slide3);



        card2=(CardView)view.findViewById(R.id.card2);
        card3=(CardView)view.findViewById(R.id.card3);
        card4=(CardView)view.findViewById(R.id.card4);
        card5=(CardView)view.findViewById(R.id.card5);
        card6=(CardView)view.findViewById(R.id.card6);
        card7=(CardView)view.findViewById(R.id.card7);
        card8=(CardView)view.findViewById(R.id.card8);
        card9=(CardView)view.findViewById(R.id.card9);
        card10=(CardView)view.findViewById(R.id.card10);
        card11=(CardView)view.findViewById(R.id.card11);
        card12=(CardView)view.findViewById(R.id.card12);
        card13=(CardView)view.findViewById(R.id.card13);
        card14=(CardView)view.findViewById(R.id.card14);
        card15=(CardView)view.findViewById(R.id.card15);

        card02=(CardView)view.findViewById(R.id.card02);
        card03=(CardView)view.findViewById(R.id.card03);
        card04=(CardView)view.findViewById(R.id.card04);
        card05=(CardView)view.findViewById(R.id.card05);

        lv03=(LinearLayout) view.findViewById(R.id.lv03);
        lv04=(LinearLayout) view.findViewById(R.id.lv04);
        lv05=(LinearLayout) view.findViewById(R.id.lv05);
        lv06=(LinearLayout) view.findViewById(R.id.lv06);
        lv07=(LinearLayout) view.findViewById(R.id.lv07);
        lv08=(LinearLayout) view.findViewById(R.id.lv08);
        lv09=(LinearLayout) view.findViewById(R.id.lv09);


        lv10=(LinearLayout) view.findViewById(R.id.lv10);
        lv20=(LinearLayout) view.findViewById(R.id.lv20);
        lv30=(LinearLayout) view.findViewById(R.id.lv30);
        lv40=(LinearLayout) view.findViewById(R.id.lv40);
        lv50=(LinearLayout) view.findViewById(R.id.lv50);
        lv60=(LinearLayout) view.findViewById(R.id.lv60);
        lv70=(LinearLayout) view.findViewById(R.id.lv70);
        lv80=(LinearLayout) view.findViewById(R.id.lv80);



        lvch1=(LinearLayout) view.findViewById(R.id.lvch1);

        sc1=(HorizontalScrollView)view.findViewById(R.id.sc1);
        sc2=(HorizontalScrollView)view.findViewById(R.id.sc2);


        cardl1=(CardView)view.findViewById(R.id.cardl1) ;
        cardl2=(CardView)view.findViewById(R.id.cardl2) ;
        cardl3=(CardView)view.findViewById(R.id.cardl3) ;
        cardl4=(CardView)view.findViewById(R.id.cardl4) ;
        cardl5=(CardView)view.findViewById(R.id.cardl5) ;
        cardl6=(CardView)view.findViewById(R.id.cardl6) ;
        cardl7=(CardView)view.findViewById(R.id.cardl7) ;
        cardl8=(CardView)view.findViewById(R.id.cardl8) ;
        cardl9=(CardView)view.findViewById(R.id.cardl9) ;
        cardl10=(CardView)view.findViewById(R.id.cardl10) ;
        cardl11=(CardView)view.findViewById(R.id.cardl11) ;
        cardl12=(CardView)view.findViewById(R.id.cardl12) ;
        cardl13=(CardView)view.findViewById(R.id.cardl13) ;
        cardl14=(CardView)view.findViewById(R.id.cardl14) ;
        cardl15=(CardView)view.findViewById(R.id.cardl15) ;
        cardl16=(CardView)view.findViewById(R.id.cardl16) ;

        cardcam1=(CardView)view.findViewById(R.id.cardcam1) ;

        cardch0=(CardView)view.findViewById(R.id.cardch0) ;
        cardch1=(CardView)view.findViewById(R.id.cardch1) ;
        cardch2=(CardView)view.findViewById(R.id.cardch2) ;

        cardnet1=(CardView)view.findViewById(R.id.cardnet1);
        cardnet11=(CardView)view.findViewById(R.id.cardnet11);


        button1=(Button) view.findViewById(R.id.button1);
        button3=(Button) view.findViewById(R.id.button3);

        buttony1=(Button) view.findViewById(R.id.buttony1);
        buttony2=(Button) view.findViewById(R.id.buttony2);
        buttony3=(Button) view.findViewById(R.id.buttony3);
        buttony4=(Button) view.findViewById(R.id.buttony4);
        buttony5=(Button) view.findViewById(R.id.buttony5);
        buttony6=(Button) view.findViewById(R.id.buttony6);
        buttony7=(Button) view.findViewById(R.id.buttony7);
        buttony8=(Button) view.findViewById(R.id.buttony8);

        buttony9=(Button) view.findViewById(R.id.buttony9);
        buttony10=(Button) view.findViewById(R.id.buttony10);
        buttony11=(Button) view.findViewById(R.id.buttony11);
        buttony12=(Button) view.findViewById(R.id.buttony12);
        buttony13=(Button) view.findViewById(R.id.buttony13);
        buttony14=(Button) view.findViewById(R.id.buttony14);
        buttony15=(Button) view.findViewById(R.id.buttony15);
        buttony16=(Button) view.findViewById(R.id.buttony16);



        buttonn1=(Button) view.findViewById(R.id.buttonex);
        buttonn2=(Button) view.findViewById(R.id.buttonn2);
        buttonn3=(Button) view.findViewById(R.id.buttonn3);
        buttonn4=(Button) view.findViewById(R.id.buttonn4);
        buttonn5=(Button) view.findViewById(R.id.buttonn5);
        buttonn6=(Button) view.findViewById(R.id.buttonn6);
        buttonn7=(Button) view.findViewById(R.id.buttonn7);
        buttonn8=(Button) view.findViewById(R.id.buttonn8);

        buttonn9=(Button) view.findViewById(R.id.buttonn9);
        buttonn10=(Button) view.findViewById(R.id.buttonn10);
        buttonn11=(Button) view.findViewById(R.id.buttonn11);
        buttonn12=(Button) view.findViewById(R.id.buttonn12);
        buttonn13=(Button) view.findViewById(R.id.buttonn13);
        buttonn14=(Button) view.findViewById(R.id.buttonn14);
        buttonn15=(Button) view.findViewById(R.id.buttonn15);
        buttonn16=(Button) view.findViewById(R.id.buttonn16);

        buttonex=(Button) view.findViewById(R.id.buttonex);


        voda1=(Button) view.findViewById(R.id.voda1);
        voda2=(Button) view.findViewById(R.id.voda2);
        voda3=(Button) view.findViewById(R.id.voda3);
        voda4=(Button) view.findViewById(R.id.voda4);
        voda5=(Button) view.findViewById(R.id.voda5);
        voda6=(Button) view.findViewById(R.id.voda6);
        voda7=(Button) view.findViewById(R.id.voda7);

        cameraon=(Button) view.findViewById(R.id.cameraon);
        cameraoff=(Button) view.findViewById(R.id.cameraoff);

        btnmoney=(Button) view.findViewById(R.id.btnMoney);

        btncallme1=(Button) view.findViewById(R.id.btncallme1);
        btncallme2=(Button) view.findViewById(R.id.btncallme2);



        le1=(TextView) view.findViewById(R.id.le);
        money1=(TextView) view.findViewById(R.id.money1);
        number1=(TextView) view.findViewById(R.id.number1);


        surfaceView=(SurfaceView)view.findViewById(R.id.SurfaceView);


        editText1=(EditText) view.findViewById(R.id.editText1);
        editText2=(EditText) view.findViewById(R.id.editText2);
        editText3=(EditText) view.findViewById(R.id.editText3);

        plantext1=(EditText) view.findViewById(R.id.plantext1);
        plantext2=(EditText) view.findViewById(R.id.plantext2);

        textcallme=(EditText) view.findViewById(R.id.textcallme);
        textcallme2=(EditText) view.findViewById(R.id.textcallme2);



        //-------------------------------------------button1------------------------------------------------//


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String number = editText1.getText().toString();
                String hash = Uri.encode("#");

                try {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:*858*" + number + hash));
                    startActivity(callIntent);  }
                catch (SecurityException err){
                    System.out.print(err);
                }

            }
        });


//----------------------------------------------button3-------------------------------------------------//



        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String number = editText2.getText().toString();
                String money = editText3.getText().toString();
                String hash = Uri.encode("#");

                try {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:*868*2*" + number + "*" + money +hash));
                    startActivity(callIntent);  }
                catch (SecurityException err){
                    System.out.print(err);
                }

            }
        });




        //----------------------------------------------------slider---------------------------------------------//

        Handler handler =new Handler();

        Runnable runnable=new Runnable() {
            @Override
            public void run() {

                ObjectAnimator slide22=ObjectAnimator.ofFloat(slide1,View.ALPHA,0,1);
                slide22.setDuration(animaionDuration3);
                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(slide22);
                animatorSet.start();

                slide1.setVisibility(View.VISIBLE);
            }
        };
        handler.postDelayed(runnable,200);



        Handler handler1 =new Handler();

        Runnable runnable1=new Runnable() {
            @Override
            public void run() {

                ObjectAnimator slide22=ObjectAnimator.ofFloat(slide2,View.ALPHA,0,1);
                slide22.setDuration(animaionDuration4);
                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(slide22);
                animatorSet.start();

                slide2.setVisibility(View.VISIBLE);
            }
        };
        handler1.postDelayed(runnable1,300);





        Handler handler2 =new Handler();

        Runnable runnable2=new Runnable() {
            @Override
            public void run() {

                ObjectAnimator slide33=ObjectAnimator.ofFloat(slide3,View.ALPHA,0,1);
                slide33.setDuration(animaionDuration5);
                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(slide33);
                animatorSet.start();

                slide3.setVisibility(View.VISIBLE);
            }
        };
        handler2.postDelayed(runnable2,500);






        slide1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator btn1=ObjectAnimator.ofFloat(button1,View.ALPHA,0f,1f);
                ObjectAnimator txt1=ObjectAnimator.ofFloat(editText1,View.ALPHA,0f,1f);

                ObjectAnimator btn3=ObjectAnimator.ofFloat(button3,View.ALPHA,1f,0f);
                ObjectAnimator txt2=ObjectAnimator.ofFloat(editText2,View.ALPHA,1f,0f);
                ObjectAnimator txt3=ObjectAnimator.ofFloat(editText3,View.ALPHA,1f,0f);

                button1.setVisibility(View.VISIBLE);
                button3.setVisibility(View.GONE);

                editText1.setVisibility(View.VISIBLE);
                editText2.setVisibility(View.GONE);
                editText3.setVisibility(View.GONE);




                btn1.setDuration(animaionDuration);
                btn3.setDuration(animaionDuration);

                txt1.setDuration(animaionDuration);
                txt2.setDuration(animaionDuration);
                txt3.setDuration(animaionDuration);

                cameraon.setVisibility(View.VISIBLE);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(btn1,btn3,txt1,txt2,txt3);
                animatorSet.start();


                le1.setVisibility(View.GONE);
                btnmoney.setVisibility(View.GONE);
                plantext1.setVisibility(View.GONE);
                plantext2.setVisibility(View.GONE);
                money1.setVisibility(View.GONE);
                number1.setVisibility(View.GONE);

                callme1.setVisibility(View.GONE);
                callme2.setVisibility(View.GONE);

                slide1.setVisibility(View.GONE);
                slide2.setVisibility(View.GONE);
                slide3.setVisibility(View.GONE);



            }});




        slide2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                ObjectAnimator btn1=ObjectAnimator.ofFloat(button1,View.ALPHA,0f,1f);
                ObjectAnimator txt1=ObjectAnimator.ofFloat(editText1,View.ALPHA,0f,1f);

                ObjectAnimator btn3=ObjectAnimator.ofFloat(button3,View.ALPHA,1f,0f);
                ObjectAnimator txt2=ObjectAnimator.ofFloat(editText2,View.ALPHA,1f,0f);
                ObjectAnimator txt3=ObjectAnimator.ofFloat(editText3,View.ALPHA,1f,0f);

                button1.setVisibility(View.GONE);
                button3.setVisibility(View.GONE);

                editText1.setVisibility(View.GONE);
                editText2.setVisibility(View.GONE);
                editText3.setVisibility(View.GONE);




                btn1.setDuration(animaionDuration);
                btn3.setDuration(animaionDuration);

                txt1.setDuration(animaionDuration);
                txt2.setDuration(animaionDuration);
                txt3.setDuration(animaionDuration);

                cameraon.setVisibility(View.GONE);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(btn1,btn3,txt1,txt2,txt3);
                animatorSet.start();



                le1.setVisibility(View.GONE);
                btnmoney.setVisibility(View.GONE);
                plantext1.setVisibility(View.GONE);
                plantext2.setVisibility(View.GONE);
                money1.setVisibility(View.GONE);
                number1.setVisibility(View.GONE);

                callme1.setVisibility(View.VISIBLE);
                callme2.setVisibility(View.GONE );

                slide1.setVisibility(View.GONE);
                slide2.setVisibility(View.GONE);
                slide3.setVisibility(View.GONE);

            }});


        slide3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {





                ObjectAnimator card1=ObjectAnimator.ofFloat(cardch1,View.SCALE_X,0.0f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(cardch2,View.SCALE_X,0.0f);

                ObjectAnimator card10=ObjectAnimator.ofFloat(cardch1,View.SCALE_Y,0.0f);
                ObjectAnimator card110=ObjectAnimator.ofFloat(cardch2,View.SCALE_Y,0.0f);

                ObjectAnimator cardch=ObjectAnimator.ofFloat(cardch0,View.ALPHA,1,0);

                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,0f,1f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,0f,1f);

                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardch,card10,card110,card114,card115);
                animatorSet.start();

                cardch0.setVisibility(View.GONE);

                card14.setVisibility(View.GONE);
                card15.setVisibility(View.GONE);

                le1.setVisibility(View.VISIBLE);
                btnmoney.setVisibility(View.VISIBLE);
                plantext1.setVisibility(View.VISIBLE);
                plantext2.setVisibility(View.VISIBLE);
                money1.setVisibility(View.VISIBLE);
                number1.setVisibility(View.VISIBLE);




                button1.setVisibility(View.GONE);
                button3.setVisibility(View.GONE);

                editText1.setVisibility(View.GONE);
                editText2.setVisibility(View.GONE);
                editText3.setVisibility(View.GONE);

                cameraon.setVisibility(View.GONE);
                cameraoff.setVisibility(View.GONE);
                callme1.setVisibility(View.GONE);
                callme2.setVisibility(View.GONE);


                slide1.setVisibility(View.GONE);
                slide2.setVisibility(View.GONE);
                slide3.setVisibility(View.GONE);

            }});

//-------------------------------------------------Lv2---------------------------------------------------//

        lv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator lv22=ObjectAnimator.ofFloat(lv2,View.TRANSLATION_X,-520f);
                ObjectAnimator lv33=ObjectAnimator.ofFloat(lv3,View.TRANSLATION_X,550f);


                ObjectAnimator sc=ObjectAnimator.ofFloat(sc1,View.ALPHA,0f,1f);


                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,0f,1f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,0f,1f);



                lv22.setDuration(animaionDuration);
                lv33.setDuration(animaionDuration);



                card114.setDuration(animaionDuration);
                card115.setDuration(animaionDuration);

                sc.setDuration(animaionDuration);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(lv22,lv33,card114,card115,sc);
                animatorSet.start();

                lv2.setVisibility(View.GONE);
                lv3.setVisibility(View.GONE);

                card14.setVisibility(View.VISIBLE);
                card15.setVisibility(View.VISIBLE);

                cardcam1.setVisibility(View.GONE);
                cameraoff.setVisibility(View.GONE);
                cameraon.setVisibility(View.GONE);

                surfaceView.setVisibility(View.GONE);

                sc1.setVisibility(View.VISIBLE);


            }});


        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator lv22=ObjectAnimator.ofFloat(lv2,View.TRANSLATION_X,0);
                ObjectAnimator lv33=ObjectAnimator.ofFloat(lv3,View.TRANSLATION_X,-0);


                ObjectAnimator sc=ObjectAnimator.ofFloat(sc1,View.ALPHA,1f,0f);


                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,1f,0f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,1f,0f);

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,-.001f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,-.001f);

                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl1,View.ALPHA,0,1f);

                card114.setDuration(animaionDuration);
                card115.setDuration(animaionDuration);

                card1.setDuration(animaionDuration5);
                card11.setDuration(animaionDuration5);
                cardl2.setDuration(animaionDuration5);

                lv22.setDuration(animaionDuration);
                lv33.setDuration(animaionDuration);

                sc.setDuration(animaionDuration4);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(lv22,lv33,card114,card115,sc,card1,card11,cardl2);
                animatorSet.start();

                cardl1.setVisibility(View.VISIBLE);

                lv2.setVisibility(View.VISIBLE);
                lv3.setVisibility(View.VISIBLE);

                card14.setVisibility(View.GONE);
                card15.setVisibility(View.GONE);

                sc1.setVisibility(View.GONE);

            }});

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator lv22=ObjectAnimator.ofFloat(lv2,View.TRANSLATION_X,0);
                ObjectAnimator lv33=ObjectAnimator.ofFloat(lv3,View.TRANSLATION_X,-0);


                ObjectAnimator sc=ObjectAnimator.ofFloat(sc1,View.ALPHA,1f,0f);


                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,1f,0f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,1f,0f);

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,-.001f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,-.001f);
                ObjectAnimator cardl22=ObjectAnimator.ofFloat(cardl2,View.ALPHA,0,1f);


                card1.setDuration(animaionDuration5);
                card11.setDuration(animaionDuration5);
                cardl22.setDuration(animaionDuration5);

                card114.setDuration(animaionDuration);
                card115.setDuration(animaionDuration);


                lv22.setDuration(animaionDuration);
                lv33.setDuration(animaionDuration);

                sc.setDuration(animaionDuration4);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(lv22,lv33,sc,card114,card115,card1,card11,cardl22);
                animatorSet.start();

                cardl2.setVisibility(View.VISIBLE);


                lv2.setVisibility(View.VISIBLE);
                lv3.setVisibility(View.VISIBLE);

                sc1.setVisibility(View.GONE);

                card14.setVisibility(View.GONE);
                card15.setVisibility(View.GONE);

            }});

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator lv22=ObjectAnimator.ofFloat(lv2,View.TRANSLATION_X,0);
                ObjectAnimator lv33=ObjectAnimator.ofFloat(lv3,View.TRANSLATION_X,-0);


                ObjectAnimator sc=ObjectAnimator.ofFloat(sc1,View.ALPHA,1f,0f);


                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,1f,0f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,1f,0f);

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,-.001f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,-.001f);
                ObjectAnimator cardl22=ObjectAnimator.ofFloat(cardl3,View.ALPHA,0,1f);



                card1.setDuration(animaionDuration5);
                card11.setDuration(animaionDuration5);
                cardl22.setDuration(animaionDuration5);

                card114.setDuration(animaionDuration);
                card115.setDuration(animaionDuration);


                lv22.setDuration(animaionDuration);
                lv33.setDuration(animaionDuration);

                sc.setDuration(animaionDuration4);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(lv22,lv33,sc,card114,card115,card1,card11,cardl22);
                animatorSet.start();

                cardl3.setVisibility(View.VISIBLE);

                lv2.setVisibility(View.VISIBLE);
                lv3.setVisibility(View.VISIBLE);

                sc1.setVisibility(View.GONE);


                card14.setVisibility(View.GONE);
                card15.setVisibility(View.GONE);
            }});
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator lv22=ObjectAnimator.ofFloat(lv2,View.TRANSLATION_X,0);
                ObjectAnimator lv33=ObjectAnimator.ofFloat(lv3,View.TRANSLATION_X,-0);


                ObjectAnimator sc=ObjectAnimator.ofFloat(sc1,View.ALPHA,1f,0f);


                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,1f,0f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,1f,0f);

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,-.001f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,-.001f);
                ObjectAnimator cardl22=ObjectAnimator.ofFloat(cardl4,View.ALPHA,0,1f);



                card1.setDuration(animaionDuration5);
                card11.setDuration(animaionDuration5);
                cardl22.setDuration(animaionDuration5);



                card114.setDuration(animaionDuration);
                card115.setDuration(animaionDuration);


                lv22.setDuration(animaionDuration);
                lv33.setDuration(animaionDuration);

                sc.setDuration(animaionDuration4);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(lv22,lv33,sc,card114,card115,card1,card11,cardl22);
                animatorSet.start();

                cardl4.setVisibility(View.VISIBLE);

                lv2.setVisibility(View.VISIBLE);
                lv3.setVisibility(View.VISIBLE);

                sc1.setVisibility(View.GONE);


                card14.setVisibility(View.GONE);
                card15.setVisibility(View.GONE);
            }});


        card02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator lv22=ObjectAnimator.ofFloat(lv2,View.TRANSLATION_X,0);
                ObjectAnimator lv33=ObjectAnimator.ofFloat(lv3,View.TRANSLATION_X,-0);


                ObjectAnimator sc=ObjectAnimator.ofFloat(sc1,View.ALPHA,1f,0f);


                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,1f,0f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,1f,0f);

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,-.001f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,-.001f);
                ObjectAnimator cardl22=ObjectAnimator.ofFloat(cardl5,View.ALPHA,0,1f);



                card1.setDuration(animaionDuration5);
                card11.setDuration(animaionDuration5);
                cardl22.setDuration(animaionDuration5);



                card114.setDuration(animaionDuration);
                card115.setDuration(animaionDuration);


                lv22.setDuration(animaionDuration);
                lv33.setDuration(animaionDuration);

                sc.setDuration(animaionDuration4);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(lv22,lv33,sc,card114,card115,card1,card11,cardl22);
                animatorSet.start();

                cardl5.setVisibility(View.VISIBLE);

                lv2.setVisibility(View.VISIBLE);
                lv3.setVisibility(View.VISIBLE);

                sc1.setVisibility(View.GONE);


                card14.setVisibility(View.GONE);
                card15.setVisibility(View.GONE);
            }});


        card03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator lv22=ObjectAnimator.ofFloat(lv2,View.TRANSLATION_X,0);
                ObjectAnimator lv33=ObjectAnimator.ofFloat(lv3,View.TRANSLATION_X,-0);


                ObjectAnimator sc=ObjectAnimator.ofFloat(sc1,View.ALPHA,1f,0f);


                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,1f,0f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,1f,0f);

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,-.001f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,-.001f);
                ObjectAnimator cardl22=ObjectAnimator.ofFloat(cardl6,View.ALPHA,0,1f);



                card1.setDuration(animaionDuration5);
                card11.setDuration(animaionDuration5);
                cardl22.setDuration(animaionDuration5);



                card114.setDuration(animaionDuration);
                card115.setDuration(animaionDuration);


                lv22.setDuration(animaionDuration);
                lv33.setDuration(animaionDuration);

                sc.setDuration(animaionDuration4);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(lv22,lv33,sc,card114,card115,card1,card11,cardl22);
                animatorSet.start();

                cardl6.setVisibility(View.VISIBLE);

                lv2.setVisibility(View.VISIBLE);
                lv3.setVisibility(View.VISIBLE);

                sc1.setVisibility(View.GONE);


                card14.setVisibility(View.GONE);
                card15.setVisibility(View.GONE);
            }});

        card04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator lv22=ObjectAnimator.ofFloat(lv2,View.TRANSLATION_X,0);
                ObjectAnimator lv33=ObjectAnimator.ofFloat(lv3,View.TRANSLATION_X,-0);


                ObjectAnimator sc=ObjectAnimator.ofFloat(sc1,View.ALPHA,1f,0f);


                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,1f,0f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,1f,0f);


                card114.setDuration(animaionDuration);
                card115.setDuration(animaionDuration);


                lv22.setDuration(animaionDuration);
                lv33.setDuration(animaionDuration);

                sc.setDuration(animaionDuration4);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(lv22,lv33,sc,card114,card115);
                animatorSet.start();


                lv2.setVisibility(View.VISIBLE);
                lv3.setVisibility(View.VISIBLE);

                sc1.setVisibility(View.GONE);


                card14.setVisibility(View.GONE);
                card15.setVisibility(View.GONE);



                String hash = Uri.encode("#");
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:*225" + hash ));
                startActivity(callIntent);


            }});


        card05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator lv22=ObjectAnimator.ofFloat(lv2,View.TRANSLATION_X,0);
                ObjectAnimator lv33=ObjectAnimator.ofFloat(lv3,View.TRANSLATION_X,-0);


                ObjectAnimator sc=ObjectAnimator.ofFloat(sc1,View.ALPHA,1f,0f);


                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,1f,0f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,1f,0f);









                card114.setDuration(animaionDuration);
                card115.setDuration(animaionDuration);


                lv22.setDuration(animaionDuration);
                lv33.setDuration(animaionDuration);

                sc.setDuration(animaionDuration4);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(lv22,lv33,sc,card114,card115);
                animatorSet.start();


                lv2.setVisibility(View.VISIBLE);
                lv3.setVisibility(View.VISIBLE);

                sc1.setVisibility(View.GONE);


                card14.setVisibility(View.GONE);
                card15.setVisibility(View.GONE);



                String hash = Uri.encode("#");
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:*225" + hash ));
                startActivity(callIntent);
            }});



//-----------------------------------------------Lv3-------------------------------------------------------//


        lv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator lv22=ObjectAnimator.ofFloat(lv2,View.TRANSLATION_X,-520f);
                ObjectAnimator lv33=ObjectAnimator.ofFloat(lv3,View.TRANSLATION_X,550f);


                ObjectAnimator sc=ObjectAnimator.ofFloat(sc2,View.ALPHA,0f,1f);


                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,0f,1f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,0f,1f);

                lv22.setDuration(animaionDuration);
                lv33.setDuration(animaionDuration);



                card114.setDuration(animaionDuration);
                card115.setDuration(animaionDuration);

                sc.setDuration(animaionDuration);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(lv22,lv33,sc,card114,card115);
                animatorSet.start();

                lv2.setVisibility(View.GONE);
                lv3.setVisibility(View.GONE);

                card14.setVisibility(View.VISIBLE);
                card15.setVisibility(View.VISIBLE);

                cardcam1.setVisibility(View.GONE);
                cameraoff.setVisibility(View.GONE);
                cameraon.setVisibility(View.GONE);


                sc2.setVisibility(View.VISIBLE);

                surfaceView.setVisibility(View.GONE);

            }});



        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator lv22=ObjectAnimator.ofFloat(lv2,View.TRANSLATION_X,0);
                ObjectAnimator lv33=ObjectAnimator.ofFloat(lv3,View.TRANSLATION_X,-0);


                ObjectAnimator sc=ObjectAnimator.ofFloat(sc2,View.ALPHA,1f,0f);


                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,1f,0f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,1f,0f);
                ObjectAnimator cardl22=ObjectAnimator.ofFloat(cardl9,View.ALPHA,0,1f);

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,-.001f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,-.001f);



                card1.setDuration(animaionDuration5);
                card11.setDuration(animaionDuration5);

                cardl22.setDuration(animaionDuration5);

                card114.setDuration(animaionDuration);
                card115.setDuration(animaionDuration);


                lv22.setDuration(animaionDuration);
                lv33.setDuration(animaionDuration);

                sc.setDuration(animaionDuration4);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(lv22,lv33,sc,card114,card115,cardl22,card1,card11);
                animatorSet.start();

                lv2.setVisibility(View.VISIBLE);
                lv3.setVisibility(View.VISIBLE);

                sc2.setVisibility(View.GONE);

                card14.setVisibility(View.GONE);
                card15.setVisibility(View.GONE);

                cardl9.setVisibility(View.VISIBLE);

            }});

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator lv22=ObjectAnimator.ofFloat(lv2,View.TRANSLATION_X,0);
                ObjectAnimator lv33=ObjectAnimator.ofFloat(lv3,View.TRANSLATION_X,-0);


                ObjectAnimator sc=ObjectAnimator.ofFloat(sc2,View.ALPHA,1f,0f);


                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,1f,0f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,1f,0f);

                ObjectAnimator cardl22=ObjectAnimator.ofFloat(cardl10,View.ALPHA,0,1f);

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,-.001f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,-.001f);


                card1.setDuration(animaionDuration5);
                card11.setDuration(animaionDuration5);

                cardl22.setDuration(animaionDuration5);

                card114.setDuration(animaionDuration);
                card115.setDuration(animaionDuration);


                lv22.setDuration(animaionDuration);
                lv33.setDuration(animaionDuration);

                sc.setDuration(animaionDuration4);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(lv22,lv33,sc,card114,card115,cardl22,card1,card11);
                animatorSet.start();

                lv2.setVisibility(View.VISIBLE);
                lv3.setVisibility(View.VISIBLE);

                sc2.setVisibility(View.GONE);

                cardl10.setVisibility(View.VISIBLE);

                card14.setVisibility(View.GONE);
                card15.setVisibility(View.GONE);
            }});
        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator lv22=ObjectAnimator.ofFloat(lv2,View.TRANSLATION_X,0);
                ObjectAnimator lv33=ObjectAnimator.ofFloat(lv3,View.TRANSLATION_X,-0);

                ObjectAnimator sc=ObjectAnimator.ofFloat(sc2,View.ALPHA,1f,0f);

                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,1f,0f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,1f,0f);

                ObjectAnimator cardl22=ObjectAnimator.ofFloat(cardl11,View.ALPHA,0,1f);

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,-.001f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,-.001f);



                card1.setDuration(animaionDuration5);
                card11.setDuration(animaionDuration5);

                cardl22.setDuration(animaionDuration5);

                card114.setDuration(animaionDuration);
                card115.setDuration(animaionDuration);


                lv22.setDuration(animaionDuration);
                lv33.setDuration(animaionDuration);

                sc.setDuration(animaionDuration4);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(lv22,lv33,sc,card114,card115,cardl22,card1,card11);
                animatorSet.start();

                lv2.setVisibility(View.VISIBLE);
                lv3.setVisibility(View.VISIBLE);

                sc2.setVisibility(View.GONE);

                cardl11.setVisibility(View.VISIBLE);


                card14.setVisibility(View.GONE);
                card15.setVisibility(View.GONE);
            }});
        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator lv22=ObjectAnimator.ofFloat(lv2,View.TRANSLATION_X,0);
                ObjectAnimator lv33=ObjectAnimator.ofFloat(lv3,View.TRANSLATION_X,-0);


                ObjectAnimator sc=ObjectAnimator.ofFloat(sc2,View.ALPHA,1f,0f);


                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,1f,0f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,1f,0f);

                ObjectAnimator cardl22=ObjectAnimator.ofFloat(cardl12,View.ALPHA,0,1f);

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,-.001f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,-.001f);


                card1.setDuration(animaionDuration5);
                card11.setDuration(animaionDuration5);

                cardl22.setDuration(animaionDuration5);

                card114.setDuration(animaionDuration);
                card115.setDuration(animaionDuration);


                lv22.setDuration(animaionDuration);
                lv33.setDuration(animaionDuration);

                sc.setDuration(animaionDuration4);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(lv22,lv33,sc,card114,card115,cardl22,card1,card11);
                animatorSet.start();

                lv2.setVisibility(View.VISIBLE);
                lv3.setVisibility(View.VISIBLE);

                sc2.setVisibility(View.GONE);

                cardl12.setVisibility(View.VISIBLE);

                card14.setVisibility(View.GONE);
                card15.setVisibility(View.GONE);
            }});


        //---------------------------------------------------------------------------------------------//


        card14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator lv22=ObjectAnimator.ofFloat(lv2,View.TRANSLATION_X,0);
                ObjectAnimator lv33=ObjectAnimator.ofFloat(lv3,View.TRANSLATION_X,-0);


                ObjectAnimator sc=ObjectAnimator.ofFloat(sc1,View.ALPHA,1f,0f);

                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,1f,0f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,1f,0f);



                ObjectAnimator cardch=ObjectAnimator.ofFloat(cardch0,View.ALPHA,1,0);

                ObjectAnimator card1=ObjectAnimator.ofFloat(cardch1,View.SCALE_X,0.0f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(cardch2,View.SCALE_X,0.0f);

                ObjectAnimator card10=ObjectAnimator.ofFloat(cardch1,View.SCALE_Y,0.0f);
                ObjectAnimator card110=ObjectAnimator.ofFloat(cardch2,View.SCALE_Y,0.0f);


                card114.setDuration(animaionDuration);
                card115.setDuration(animaionDuration);



                lv22.setDuration(animaionDuration);
                lv33.setDuration(animaionDuration);

                sc.setDuration(animaionDuration4);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(lv22,lv33,card114,card115,sc,card1,card11,cardch,card10,card110);
                animatorSet.start();



                lv2.setVisibility(View.VISIBLE);
                lv3.setVisibility(View.VISIBLE);

                card14.setVisibility(View.GONE);
                card15.setVisibility(View.GONE);

                sc1.setVisibility(View.GONE);
                sc2.setVisibility(View.GONE);

                cardch0.setVisibility(View.GONE);

            }});


        card15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator lv22=ObjectAnimator.ofFloat(lv2,View.TRANSLATION_X,0);
                ObjectAnimator lv33=ObjectAnimator.ofFloat(lv3,View.TRANSLATION_X,-0);


                ObjectAnimator sc=ObjectAnimator.ofFloat(sc1,View.ALPHA,1f,0f);

                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,1f,0f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,1f,0f);

                ObjectAnimator card1=ObjectAnimator.ofFloat(cardch1,View.SCALE_X,0.0f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(cardch2,View.SCALE_X,0.0f);

                ObjectAnimator card10=ObjectAnimator.ofFloat(cardch1,View.SCALE_Y,0.0f);
                ObjectAnimator card110=ObjectAnimator.ofFloat(cardch2,View.SCALE_Y,0.0f);


                ObjectAnimator cardch=ObjectAnimator.ofFloat(cardch0,View.ALPHA,1,0);

                card114.setDuration(animaionDuration);
                card115.setDuration(animaionDuration);

                //  cardl1.setDuration(animaionDuration5);
                // cardl2.setDuration(animaionDuration5);
                //cardl3.setDuration(animaionDuration5);

                lv22.setDuration(animaionDuration);
                lv33.setDuration(animaionDuration);

                sc.setDuration(animaionDuration4);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(lv22,lv33,card114,card115,sc,card1,card11,cardch,card10,card110);
                animatorSet.start();



                lv2.setVisibility(View.VISIBLE);
                lv3.setVisibility(View.VISIBLE);

                card14.setVisibility(View.GONE);
                card15.setVisibility(View.GONE);

                sc1.setVisibility(View.GONE);
                sc2.setVisibility(View.GONE);

                cardch0.setVisibility(View.GONE);


            }});

        //--------------------------------------button Yes slide 1-------------------------------------------------------------//


        buttony1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl1,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl1.setVisibility(View.GONE);



                String hash = Uri.encode("#");
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:*020" + hash ));
                startActivity(callIntent);


            }});

        buttony2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl22=ObjectAnimator.ofFloat(cardl2,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl22.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl22);
                animatorSet.start();

                cardl2.setVisibility(View.GONE);



                String hash = Uri.encode("#");
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:*030" + hash ));
                startActivity(callIntent);

            }});

        buttony3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl3,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl3.setVisibility(View.GONE);




                String hash = Uri.encode("#");
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:*050" + hash ));
                startActivity(callIntent);


            }});

        buttony4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl4,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl4.setVisibility(View.GONE);



                String hash = Uri.encode("#");
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:*070" + hash ));
                startActivity(callIntent);

            }});




        buttony5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl5,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);;
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl5.setVisibility(View.GONE);



                String hash = Uri.encode("#");
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:*090" + hash ));
                startActivity(callIntent);


            }});

        buttony6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl22=ObjectAnimator.ofFloat(cardl6,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl22.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl22);
                animatorSet.start();

                cardl6.setVisibility(View.GONE);


            }});

        buttony7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl7,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl7.setVisibility(View.GONE);


            }});

        buttony8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl8,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl8.setVisibility(View.GONE);


            }});




//--------------------------------------button No slide 1-------------------------------------------------------------//




        buttonex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl1,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl1.setVisibility(View.GONE);
                con1.setVisibility(View.VISIBLE);



            }});


        buttonn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl22=ObjectAnimator.ofFloat(cardl2,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl22.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl22);
                animatorSet.start();

                cardl2.setVisibility(View.GONE);
                con1.setVisibility(View.VISIBLE);


            }});

        buttonn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl3,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl3.setVisibility(View.GONE);
                con1.setVisibility(View.VISIBLE);


            }});

        buttonn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl4,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl4.setVisibility(View.GONE);
                con1.setVisibility(View.VISIBLE);

            }});



        buttonn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl5,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl5.setVisibility(View.GONE);
                con1.setVisibility(View.VISIBLE);


            }});

        buttonn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl6,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl6.setVisibility(View.GONE);
                con1.setVisibility(View.VISIBLE);


            }});

        buttonn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl7,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl7.setVisibility(View.GONE);


            }});

        buttonn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl8,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl8.setVisibility(View.GONE);

            }});

//-------------------------------------button slide 2 Yes-------------------------------------------------------//



        buttony9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl9,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl9.setVisibility(View.GONE);


            }});

        buttony10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl22=ObjectAnimator.ofFloat(cardl10,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl22.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl22);
                animatorSet.start();

                cardl10.setVisibility(View.GONE);


            }});

        buttony11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl11,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl11.setVisibility(View.GONE);


            }});

        buttony12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl12,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl12.setVisibility(View.GONE);


            }});



        buttony13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl13,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);;
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl13.setVisibility(View.GONE);



            }});

        buttony14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl22=ObjectAnimator.ofFloat(cardl14,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl22.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl22);
                animatorSet.start();

                cardl14.setVisibility(View.GONE);


            }});

        buttony15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl15,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl15.setVisibility(View.GONE);


            }});

        buttony16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl16,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl16.setVisibility(View.GONE);


            }});


//----------------------------------------button slide2 No-------------------------------------------------------------//

        buttonn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl9,View.ALPHA,0,1f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);;
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl9.setVisibility(View.GONE);



            }});

        buttonn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl22=ObjectAnimator.ofFloat(cardl10,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl22.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl22);
                animatorSet.start();

                cardl10.setVisibility(View.GONE);


            }});

        buttonn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl11,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl11.setVisibility(View.GONE);


            }});

        buttonn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl12,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl12.setVisibility(View.GONE);


            }});




        buttonn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl13,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);;
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl13.setVisibility(View.GONE);


            }});

        buttonn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl22=ObjectAnimator.ofFloat(cardl14,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl22.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl22);
                animatorSet.start();

                cardl14.setVisibility(View.GONE);


            }});

        buttonn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl15,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl15.setVisibility(View.GONE);


            }});

        buttonn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1);
                ObjectAnimator cardl2=ObjectAnimator.ofFloat(cardl16,View.ALPHA,1,0f);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);
                cardl2.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardl2);
                animatorSet.start();

                cardl16.setVisibility(View.GONE);


            }});




        cameraon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                surfaceView.setVisibility(View.VISIBLE);
                cardcam1.setVisibility(View.VISIBLE);
                cameraoff.setVisibility(View.VISIBLE);
                cameraon.setVisibility(View.GONE);




            }});





        cameraoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                surfaceView.setVisibility(View.GONE);

                cardcam1.setVisibility(View.GONE);
                cameraoff.setVisibility(View.GONE);
                cameraon.setVisibility(View.VISIBLE);


            }});



//--------------------------------------------------CAMERA-----------------------------------------------------//


        cameraView = (SurfaceView)view.findViewById(R.id.SurfaceView);
        textView = (EditText)view.findViewById(R.id.editText1);

        TextRecognizer textRecognizer = new TextRecognizer.Builder(getActivity().getApplicationContext()).build();





        if (!textRecognizer.isOperational()) {
            Log.w("MainActivity", "Detector dependancies are not yet avaliable");
        } else {



            cameraSource = new CameraSource.Builder(getActivity().getApplicationContext(), textRecognizer)
                    .setFacing(CameraSource.CAMERA_FACING_BACK)
                    .setRequestedPreviewSize(1280, 1024)
                    .setRequestedFps(2.f)
                    .setAutoFocusEnabled(true)
                    .build();

            cameraView.getHolder().addCallback(new SurfaceHolder.Callback() {
                @Override
                public void surfaceCreated(SurfaceHolder surfaceHolder) {

                    try {
                        if (ActivityCompat.checkSelfPermission(getActivity().getApplicationContext(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(weFragment.super.getActivity(), new String[]{Manifest.permission.CAMERA},
                                    RequestCameraPermissionID);
                            return;
                        }
                        cameraSource.start(cameraView.getHolder());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

                }

                @Override
                public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    cameraSource.stop();

                }
            });


            textRecognizer.setProcessor(new Detector.Processor<TextBlock>() {
                @Override
                public void release() {

                }

                @Override
                public void receiveDetections(Detector.Detections<TextBlock> detections) {

                    final SparseArray<TextBlock> items = detections.getDetectedItems();
                    if (items.size() != 0) {
                        textView.post(new Runnable() {
                            @Override
                            public void run() {
                                StringBuilder stringBuilder = new StringBuilder();                con1.setVisibility(View.VISIBLE);

                                for (int i = 0; i < items.size(); ++i) {
                                    TextBlock item = items.valueAt(i);
                                    stringBuilder.append(item.getValue());
                                    stringBuilder.append("\n");
                                }
                                textView.setText(stringBuilder.toString());
                            }
                        });
                    }

                }
            });

        }
//------------------------------------------lv03------------------------------------------------------//


        lv03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {





                String hash = Uri.encode("#");
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:*20"+hash));
                startActivity(callIntent);


            }});




        //--------------------------------------------------------------------------------------------------//

        lv04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                ObjectAnimator card1=ObjectAnimator.ofFloat(cardch1,View.SCALE_X,1f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(cardch2,View.SCALE_X,1f);

                ObjectAnimator card10=ObjectAnimator.ofFloat(cardch1,View.SCALE_Y,1f);
                ObjectAnimator card110=ObjectAnimator.ofFloat(cardch2,View.SCALE_Y,1f);

                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,0f,1f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,0f,1f);

                ObjectAnimator cardch=ObjectAnimator.ofFloat(cardch0,View.ALPHA,0,1);

                card1.setDuration(animaionDuration2);
                card11.setDuration(animaionDuration2);
                card10.setDuration(animaionDuration2);
                card110.setDuration(animaionDuration2);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card10,card11,card110,cardch,card114,card115);
                animatorSet.start();


                cardch0.setVisibility(View.VISIBLE);

                cardch1.setVisibility(View.VISIBLE);
                cardch2.setVisibility(View.VISIBLE);

                lvch1.setVisibility(View.VISIBLE);

                card14.setVisibility(View.VISIBLE);
                card15.setVisibility(View.VISIBLE);








            }});

        cardch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String hash = Uri.encode("#");
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:*9*1" + hash));
                startActivity(callIntent);



                ObjectAnimator card1=ObjectAnimator.ofFloat(cardch1,View.SCALE_X,0.0f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(cardch2,View.SCALE_X,0.0f);

                ObjectAnimator card10=ObjectAnimator.ofFloat(cardch1,View.SCALE_Y,0.0f);
                ObjectAnimator card110=ObjectAnimator.ofFloat(cardch2,View.SCALE_Y,0.0f);

                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,0f,1f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,0f,1f);

                ObjectAnimator cardch=ObjectAnimator.ofFloat(cardch0,View.ALPHA,1,0);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardch,card10,card110,card114,card115);
                animatorSet.start();

                cardch0.setVisibility(View.GONE);

                card14.setVisibility(View.GONE);
                card15.setVisibility(View.GONE);

            }});


        cardch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {






                ObjectAnimator card1=ObjectAnimator.ofFloat(cardch1,View.SCALE_X,0.0f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(cardch2,View.SCALE_X,0.0f);

                ObjectAnimator card10=ObjectAnimator.ofFloat(cardch1,View.SCALE_Y,0.0f);
                ObjectAnimator card110=ObjectAnimator.ofFloat(cardch2,View.SCALE_Y,0.0f);

                ObjectAnimator cardch=ObjectAnimator.ofFloat(cardch0,View.ALPHA,1,0);

                ObjectAnimator card114=ObjectAnimator.ofFloat(card14,View.ALPHA,0f,1f);
                ObjectAnimator card115=ObjectAnimator.ofFloat(card15,View.ALPHA,0f,1f);

                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardch,card10,card110,card114,card115);
                animatorSet.start();

                cardch0.setVisibility(View.GONE);

                card14.setVisibility(View.GONE);
                card15.setVisibility(View.GONE);

                le1.setVisibility(View.VISIBLE);
                btnmoney.setVisibility(View.VISIBLE);

                plantext1.setVisibility(View.VISIBLE);
                plantext2.setVisibility(View.VISIBLE);

                money1.setVisibility(View.VISIBLE);
                number1.setVisibility(View.VISIBLE);




                button1.setVisibility(View.GONE);
                button3.setVisibility(View.GONE);

                editText1.setVisibility(View.GONE);
                editText2.setVisibility(View.GONE);
                editText3.setVisibility(View.GONE);

                cameraon.setVisibility(View.GONE);
                cameraoff.setVisibility(View.GONE);

                callme1.setVisibility(View.GONE);
                callme2.setVisibility(View.GONE);

                slide1.setVisibility(View.GONE);
                slide2.setVisibility(View.GONE);
                slide3.setVisibility(View.GONE);




            }});

//---------------------------------------------------------------------------------------------------//


        lv05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,-.001f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,-.001f);

                ObjectAnimator cardnt1=ObjectAnimator.ofFloat(cardnet1,View.SCALE_X,1);
                ObjectAnimator cardnt11=ObjectAnimator.ofFloat(cardnet11,View.SCALE_X,1);

                ObjectAnimator cardnt01=ObjectAnimator.ofFloat(cardnet1,View.SCALE_Y,1);
                ObjectAnimator cardnt011=ObjectAnimator.ofFloat(cardnet11,View.SCALE_Y,1);


                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardnt1,cardnt11,cardnt01,cardnt011);
                animatorSet.start();

                cardnet1.setVisibility(View.VISIBLE);
                cardnet11.setVisibility(View.VISIBLE);



            }});


        lv06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String hash = Uri.encode("#");
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:*225"+hash));
                startActivity(callIntent);

            }
        });












        lv08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String hash = Uri.encode("#");
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:880"));
                startActivity(callIntent);

            }
        });

        lv09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator btn1=ObjectAnimator.ofFloat(button1,View.ALPHA,1f,0f);
                ObjectAnimator txt1=ObjectAnimator.ofFloat(editText1,View.ALPHA,1f,0f);



                ObjectAnimator btn3=ObjectAnimator.ofFloat(button3,View.ALPHA,0f,1f);
                ObjectAnimator txt2=ObjectAnimator.ofFloat(editText2,View.ALPHA,0f,1f);
                ObjectAnimator txt3=ObjectAnimator.ofFloat(editText3,View.ALPHA,0f,1f);

                button1.setVisibility(View.GONE);
                button3.setVisibility(View.VISIBLE);

                editText1.setVisibility(View.GONE);
                editText2.setVisibility(View.VISIBLE);
                editText3.setVisibility(View.VISIBLE);

                cameraon.setVisibility(View.GONE);
                cameraoff.setVisibility(View.GONE);


                le1.setVisibility(View.GONE);
                btnmoney.setVisibility(View.GONE);
                plantext1.setVisibility(View.GONE);
                plantext2.setVisibility(View.GONE);
                money1.setVisibility(View.GONE);
                number1.setVisibility(View.GONE);

                btn1.setDuration(animaionDuration);
                btn3.setDuration(animaionDuration);

                txt1.setDuration(animaionDuration);
                txt2.setDuration(animaionDuration);
                txt3.setDuration(animaionDuration);

                callme1.setVisibility(View.GONE);
                callme2.setVisibility(View.GONE);

                slide1.setVisibility(View.GONE);
                slide2.setVisibility(View.GONE);
                slide3.setVisibility(View.GONE);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(btn1,btn3,txt1,txt2,txt3);
                animatorSet.start();

            }
        });



        voda1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1f);

                ObjectAnimator cardnt1=ObjectAnimator.ofFloat(cardnet1,View.SCALE_X,.0f);
                ObjectAnimator cardnt11=ObjectAnimator.ofFloat(cardnet11,View.SCALE_X,.0f);

                ObjectAnimator cardnt01=ObjectAnimator.ofFloat(cardnet1,View.SCALE_Y,.0f);
                ObjectAnimator cardnt011=ObjectAnimator.ofFloat(cardnet11,View.SCALE_Y,.0f);

                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardnt1,cardnt11,cardnt01,cardnt011);
                animatorSet.start();


                cardnet1.setVisibility(View.GONE);
                cardnet11.setVisibility(View.GONE);

            }
        });

        voda2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1f);

                ObjectAnimator cardnt1=ObjectAnimator.ofFloat(cardnet1,View.SCALE_X,.0f);
                ObjectAnimator cardnt11=ObjectAnimator.ofFloat(cardnet11,View.SCALE_X,.0f);

                ObjectAnimator cardnt01=ObjectAnimator.ofFloat(cardnet1,View.SCALE_Y,.0f);
                ObjectAnimator cardnt011=ObjectAnimator.ofFloat(cardnet11,View.SCALE_Y,.0f);

                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardnt1,cardnt11,cardnt01,cardnt011);
                animatorSet.start();

                cardnet1.setVisibility(View.GONE);
                cardnet11.setVisibility(View.GONE);

            }
        });


        voda3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1f);

                ObjectAnimator cardnt1=ObjectAnimator.ofFloat(cardnet1,View.SCALE_X,.0f);
                ObjectAnimator cardnt11=ObjectAnimator.ofFloat(cardnet11,View.SCALE_X,.0f);

                ObjectAnimator cardnt01=ObjectAnimator.ofFloat(cardnet1,View.SCALE_Y,.0f);
                ObjectAnimator cardnt011=ObjectAnimator.ofFloat(cardnet11,View.SCALE_Y,.0f);

                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardnt1,cardnt11,cardnt01,cardnt011);
                animatorSet.start();


                cardnet1.setVisibility(View.GONE);
                cardnet11.setVisibility(View.GONE);


            }
        });


        voda4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1f);

                ObjectAnimator cardnt1=ObjectAnimator.ofFloat(cardnet1,View.SCALE_X,.0f);
                ObjectAnimator cardnt11=ObjectAnimator.ofFloat(cardnet11,View.SCALE_X,.0f);

                ObjectAnimator cardnt01=ObjectAnimator.ofFloat(cardnet1,View.SCALE_Y,.0f);
                ObjectAnimator cardnt011=ObjectAnimator.ofFloat(cardnet11,View.SCALE_Y,.0f);

                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardnt1,cardnt11,cardnt01,cardnt011);
                animatorSet.start();


                cardnet1.setVisibility(View.GONE);
                cardnet11.setVisibility(View.GONE);


            }
        });


        voda5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1f);

                ObjectAnimator cardnt1=ObjectAnimator.ofFloat(cardnet1,View.SCALE_X,.0f);
                ObjectAnimator cardnt11=ObjectAnimator.ofFloat(cardnet11,View.SCALE_X,.0f);

                ObjectAnimator cardnt01=ObjectAnimator.ofFloat(cardnet1,View.SCALE_Y,.0f);
                ObjectAnimator cardnt011=ObjectAnimator.ofFloat(cardnet11,View.SCALE_Y,.0f);

                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardnt1,cardnt11,cardnt01,cardnt011);
                animatorSet.start();

                cardnet1.setVisibility(View.GONE);
                cardnet11.setVisibility(View.GONE);

            }
        });


        voda6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1f);

                ObjectAnimator cardnt1=ObjectAnimator.ofFloat(cardnet1,View.SCALE_X,.0f);
                ObjectAnimator cardnt11=ObjectAnimator.ofFloat(cardnet11,View.SCALE_X,.0f);

                ObjectAnimator cardnt01=ObjectAnimator.ofFloat(cardnet1,View.SCALE_Y,.0f);
                ObjectAnimator cardnt011=ObjectAnimator.ofFloat(cardnet11,View.SCALE_Y,.0f);

                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardnt1,cardnt11,cardnt01,cardnt011);
                animatorSet.start();


                cardnet1.setVisibility(View.GONE);
                cardnet11.setVisibility(View.GONE);
            }
        });


        voda7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator card1=ObjectAnimator.ofFloat(con1,View.SCALE_X,1f);
                ObjectAnimator card11=ObjectAnimator.ofFloat(con1,View.SCALE_Y,1f);

                ObjectAnimator cardnt1=ObjectAnimator.ofFloat(cardnet1,View.SCALE_X,.0f);
                ObjectAnimator cardnt11=ObjectAnimator.ofFloat(cardnet11,View.SCALE_X,.0f);

                ObjectAnimator cardnt01=ObjectAnimator.ofFloat(cardnet1,View.SCALE_Y,.0f);
                ObjectAnimator cardnt011=ObjectAnimator.ofFloat(cardnet11,View.SCALE_Y,.0f);

                card1.setDuration(animaionDuration3);
                card11.setDuration(animaionDuration3);

                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(card1,card11,cardnt1,cardnt11,cardnt01,cardnt011);
                animatorSet.start();

                cardnet1.setVisibility(View.GONE);
                cardnet11.setVisibility(View.GONE);

            }
        });




        lv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                ObjectAnimator btn1=ObjectAnimator.ofFloat(button1,View.ALPHA,0f,1f);
                ObjectAnimator txt1=ObjectAnimator.ofFloat(editText1,View.ALPHA,0f,1f);

                ObjectAnimator btn3=ObjectAnimator.ofFloat(button3,View.ALPHA,1f,0f);
                ObjectAnimator txt2=ObjectAnimator.ofFloat(editText2,View.ALPHA,1f,0f);
                ObjectAnimator txt3=ObjectAnimator.ofFloat(editText3,View.ALPHA,1f,0f);

                button1.setVisibility(View.VISIBLE);
                button3.setVisibility(View.GONE);

                editText1.setVisibility(View.VISIBLE);
                editText2.setVisibility(View.GONE);
                editText3.setVisibility(View.GONE);




                btn1.setDuration(animaionDuration);
                btn3.setDuration(animaionDuration);

                txt1.setDuration(animaionDuration);
                txt2.setDuration(animaionDuration);
                txt3.setDuration(animaionDuration);

                cameraon.setVisibility(View.VISIBLE);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(btn1,btn3,txt1,txt2,txt3);
                animatorSet.start();


                le1.setVisibility(View.GONE);
                btnmoney.setVisibility(View.GONE);
                plantext1.setVisibility(View.GONE);
                plantext2.setVisibility(View.GONE);
                money1.setVisibility(View.GONE);
                number1.setVisibility(View.GONE);

                callme1.setVisibility(View.GONE);
                callme2.setVisibility(View.GONE);

                slide1.setVisibility(View.GONE);
                slide2.setVisibility(View.GONE);
                slide3.setVisibility(View.GONE);


            }
        });


        lv20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                ObjectAnimator btn1=ObjectAnimator.ofFloat(button1,View.ALPHA,0f,1f);
                ObjectAnimator txt1=ObjectAnimator.ofFloat(editText1,View.ALPHA,0f,1f);

                ObjectAnimator btn3=ObjectAnimator.ofFloat(button3,View.ALPHA,1f,0f);
                ObjectAnimator txt2=ObjectAnimator.ofFloat(editText2,View.ALPHA,1f,0f);
                ObjectAnimator txt3=ObjectAnimator.ofFloat(editText3,View.ALPHA,1f,0f);

                button1.setVisibility(View.GONE);
                button3.setVisibility(View.GONE);

                editText1.setVisibility(View.GONE);
                editText2.setVisibility(View.GONE);
                editText3.setVisibility(View.GONE);




                btn1.setDuration(animaionDuration);
                btn3.setDuration(animaionDuration);

                txt1.setDuration(animaionDuration);
                txt2.setDuration(animaionDuration);
                txt3.setDuration(animaionDuration);

                cameraon.setVisibility(View.GONE);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(btn1,btn3,txt1,txt2,txt3);
                animatorSet.start();

                slide1.setVisibility(View.GONE);
                slide2.setVisibility(View.GONE);
                slide3.setVisibility(View.GONE);

                le1.setVisibility(View.GONE);
                btnmoney.setVisibility(View.GONE);
                plantext1.setVisibility(View.GONE);
                plantext2.setVisibility(View.GONE);
                money1.setVisibility(View.GONE);
                number1.setVisibility(View.GONE);

                callme1.setVisibility(View.VISIBLE);
                callme2.setVisibility(View.GONE );

            }
        });



        lv30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                slide1.setVisibility(View.GONE);
                slide2.setVisibility(View.GONE);
                slide3.setVisibility(View.GONE);

                ObjectAnimator btn1=ObjectAnimator.ofFloat(button1,View.ALPHA,0f,1f);
                ObjectAnimator txt1=ObjectAnimator.ofFloat(editText1,View.ALPHA,0f,1f);

                ObjectAnimator btn3=ObjectAnimator.ofFloat(button3,View.ALPHA,1f,0f);
                ObjectAnimator txt2=ObjectAnimator.ofFloat(editText2,View.ALPHA,1f,0f);
                ObjectAnimator txt3=ObjectAnimator.ofFloat(editText3,View.ALPHA,1f,0f);

                button1.setVisibility(View.GONE);
                button3.setVisibility(View.GONE);

                editText1.setVisibility(View.GONE);
                editText2.setVisibility(View.GONE);
                editText3.setVisibility(View.GONE);




                btn1.setDuration(animaionDuration);
                btn3.setDuration(animaionDuration);

                txt1.setDuration(animaionDuration);
                txt2.setDuration(animaionDuration);
                txt3.setDuration(animaionDuration);

                cameraon.setVisibility(View.GONE);


                AnimatorSet animatorSet=new AnimatorSet();
                animatorSet.playTogether(btn1,btn3,txt1,txt2,txt3);
                animatorSet.start();


                le1.setVisibility(View.GONE);
                btnmoney.setVisibility(View.GONE);
                plantext1.setVisibility(View.GONE);
                plantext2.setVisibility(View.GONE);
                money1.setVisibility(View.GONE);
                number1.setVisibility(View.GONE);

                callme1.setVisibility(View.GONE);
                callme2.setVisibility(View.VISIBLE);

            }
        });

        lv40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String hash = Uri.encode("#");
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:*868*3"+hash));
                startActivity(callIntent);

            }
        });


        lv50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String hash = Uri.encode("#");
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:*878"+hash));
                startActivity(callIntent);

            }
        });


        lv60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String hash = Uri.encode("#");
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:*878"+hash));
                startActivity(callIntent);

            }
        });


        lv70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String hash = Uri.encode("#");
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:*055*000000"+hash));
                startActivity(callIntent);

            }
        });


        lv80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String hash = Uri.encode("#");
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:888"));
                startActivity(callIntent);

            }
        });






        btnmoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String number = plantext1.getText().toString();
                String money = plantext2.getText().toString();
                String hash = Uri.encode("#");

                try {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:*9*7*" + number + "*" + money + hash ));
                    startActivity(callIntent);  }
                catch (SecurityException err){
                    System.out.print(err);
                }


            }
        });


        btncallme1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String number = textcallme.getText().toString();
                String hash = Uri.encode("#");

                try {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:*505*" + number + hash ));
                    startActivity(callIntent);  }
                catch (SecurityException err){
                    System.out.print(err);
                }


            }
        });

        btncallme2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String number = textcallme2.getText().toString();
                String hash = Uri.encode("#");

                try {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:*506*" + number  ));
                    startActivity(callIntent);  }
                catch (SecurityException err){
                    System.out.print(err);
                }


            }
        });



        return view;

    }

}/* */