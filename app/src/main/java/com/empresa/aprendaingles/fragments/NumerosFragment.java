package com.empresa.aprendaingles.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.empresa.aprendaingles.R;


public class NumerosFragment extends Fragment implements  View.OnClickListener{

    private ImageButton imageUm,imageDois,imageTres,imageQuatro,imageCinco,imageSeis;
    private MediaPlayer player;

    public NumerosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

         imageUm = view.findViewById(R.id.imageUm);
         imageDois = view.findViewById(R.id.imageDois);
         imageTres = view.findViewById(R.id.imageTres);
         imageQuatro = view.findViewById(R.id.imageQuatro);
         imageCinco = view.findViewById(R.id.imageCinco);
         imageSeis = view.findViewById(R.id.imageSeis);

         imageUm.setOnClickListener(this);
        imageDois.setOnClickListener(this);
        imageTres.setOnClickListener(this);
        imageQuatro.setOnClickListener(this);
        imageCinco.setOnClickListener(this);
        imageSeis.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageUm: player = MediaPlayer.create(getActivity(),R.raw.one);
                tocarSom();
                break;
            case R.id.imageDois: player = MediaPlayer.create(getActivity(),R.raw.two);
                tocarSom();
                break;
            case R.id.imageTres: player = MediaPlayer.create(getActivity(),R.raw.three);
                tocarSom();
                break;
            case R.id.imageQuatro: player = MediaPlayer.create(getActivity(),R.raw.four);
                tocarSom();
                break;
            case R.id.imageCinco: player = MediaPlayer.create(getActivity(),R.raw.five);
                tocarSom();
                break;
            case R.id.imageSeis: player = MediaPlayer.create(getActivity(),R.raw.six);
                tocarSom();
                break;
        }
    }

    public void tocarSom() {
        if (player != null){
            player.start();
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    player.release();
                }
            });
        }

    }
}