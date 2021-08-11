package com.example.noisetest;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageButton btnCar, btnCloudRain, btnForest, btnWave,
                btnWaterFlow, btnCrikets, btnFire, btnHeart,
                btnTruck, btnTrain, btnPlane, btnWsMachine,
                btnVacuum, btnClock, btnRaido, btnHairDryer,
                btnFan, btnShower, btnCat, btnSoundWave;

    MediaPlayer mediaPlayer;
    int position = 0;
    String title = "";
    String check = "";
    ArrayList<Audio> listAudio ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
        addAudio();
        setMediaPlayer();
    }

    private void setMediaPlayer() {
        if(mediaPlayer == null) {
            for(int i=0; i<listAudio.size(); i++) {
                if(listAudio.get(i).getKey().equals(title)) {
                    check = listAudio.get(i).getKey();
                    position = i;
                }
            }
            mediaPlayer = MediaPlayer.create(MainActivity.this,listAudio.get(position).getFile());
        }
        else {
            if(check.equals(title)) {

            }
            else {
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                for(int i=0; i<listAudio.size(); i++) {
                    if(listAudio.get(i).getKey().equals(title)) {
                        check = listAudio.get(i).getKey();
                        position = i;
                    }
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this,listAudio.get(position).getFile());
            }
        }
    }

    private void setPlayMedia() {
        mediaPlayer.setLooping(true);
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
        else {
            mediaPlayer.start();
        }
    }


    private void addAudio() {
        listAudio = new ArrayList<>();

        listAudio.add(new Audio("btnCloudRain",R.raw.rain));
        listAudio.add(new Audio("btnForest",R.raw.forest));
        listAudio.add(new Audio("btnWave",R.raw.wave));
        listAudio.add(new Audio("btnWaterFlow",R.raw.waterflowing));
        listAudio.add(new Audio("btnCrikets",R.raw.crikets));
        listAudio.add(new Audio("btnFire",R.raw.fire));
        listAudio.add(new Audio("btnHeart",R.raw.heartbeat));
        listAudio.add(new Audio("btnCar",R.raw.car));
        listAudio.add(new Audio("btnTruck",R.raw.truck));
        listAudio.add(new Audio("btnTrain",R.raw.train));
        listAudio.add(new Audio("btnPlane",R.raw.plane));
        listAudio.add(new Audio("btnWsMachine",R.raw.washingmachine));
        listAudio.add(new Audio("btnVacuum",R.raw.vacuumcleaner));
        listAudio.add(new Audio("btnClock",R.raw.clock));
        listAudio.add(new Audio("btnRaido",R.raw.radio));
        listAudio.add(new Audio("btnHairDryer",R.raw.hairdryer));
        listAudio.add(new Audio("btnFan",R.raw.fan));
        listAudio.add(new Audio("btnShower",R.raw.shower));
        listAudio.add(new Audio("btnCat",R.raw.catsnores));
        listAudio.add(new Audio("btnSoundWave",R.raw.whitenoise));
    }

    private void addControls() {
        btnCloudRain    = findViewById(R.id.btnRain);
        btnForest       = findViewById(R.id.btnForest);
        btnWave         = findViewById(R.id.btnWave);
        btnWaterFlow    = findViewById(R.id.btnWaterFlow);
        btnCrikets      = findViewById(R.id.btnCrikets);
        btnFire         = findViewById(R.id.btnFire);
        btnHeart        = findViewById(R.id.btnHerat);
        btnCar          = findViewById(R.id.btnCar);
        btnTruck        = findViewById(R.id.btnTruck);
        btnTrain        = findViewById(R.id.btnTrain);
        btnPlane        = findViewById(R.id.btnPlane);
        btnWsMachine    = findViewById(R.id.btnWashingMachine);
        btnVacuum       = findViewById(R.id.btnVacuumCleaner);
        btnClock        = findViewById(R.id.btnClock);
        btnRaido        = findViewById(R.id.btnRaido);
        btnHairDryer    = findViewById(R.id.btnHairDryer);
        btnFan          = findViewById(R.id.btnFan);
        btnShower       = findViewById(R.id.btnShower);
        btnCat          = findViewById(R.id.btnCat);
        btnSoundWave    = findViewById(R.id.btnSoundwaves);
    }

    private void addEvents() {

       btnCloudRain.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               title = "btnCloudRain";
               setMediaPlayer();
                setPlayMedia();
           }
       });


        btnForest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnForest";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnWave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnWave";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnWaterFlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnWaterFlow";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnCrikets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnCrikets";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnFire";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnHeart";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnCar";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnTruck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnTruck";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnTrain";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnPlane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnPlane";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnWsMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnWsMachine";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnVacuum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnVacuum";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnClock";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnRaido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnRaido";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnHairDryer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnHairDryer";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnFan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnFan";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnShower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnShower";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnCat";
                setMediaPlayer();
                setPlayMedia();
            }
        });


        btnSoundWave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title = "btnSoundWave";
                setMediaPlayer();
                setPlayMedia();
            }
        });
    }


}