package com.empresa.aprendaingles.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.empresa.aprendaingles.R;

public class BichosFragment extends Fragment implements  View.OnClickListener{

    private ImageButton imageCao,imageGato,imageLeao,imageMacaco,imageOvelha,imageVaca;
    private MediaPlayer player;

    public BichosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bichos, container, false);

        imageCao = view.findViewById(R.id.imageCao);
        imageGato = view.findViewById(R.id.imageGato);
        imageLeao = view.findViewById(R.id.imageLeao);
        imageMacaco = view.findViewById(R.id.imageMacaco);
        imageOvelha = view.findViewById(R.id.imageOvelha);
        imageVaca = view.findViewById(R.id.imageVaca);

        imageCao.setOnClickListener(this);
        imageGato.setOnClickListener(this);
        imageLeao.setOnClickListener(this);
        imageMacaco.setOnClickListener(this);
        imageOvelha.setOnClickListener(this);
        imageVaca.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageCao: player = MediaPlayer.create(getActivity(),R.raw.dog);
                tocarSom();
                break;
            case R.id.imageGato: player = MediaPlayer.create(getActivity(),R.raw.cat);
                tocarSom();
                break;
            case R.id.imageLeao: player = MediaPlayer.create(getActivity(),R.raw.lion);
                tocarSom();
                break;
            case R.id.imageMacaco: player = MediaPlayer.create(getActivity(),R.raw.monkey);
                tocarSom();
                break;
            case R.id.imageOvelha: player = MediaPlayer.create(getActivity(),R.raw.sheep);
                tocarSom();
                break;
            case R.id.imageVaca: player = MediaPlayer.create(getActivity(),R.raw.cow);
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