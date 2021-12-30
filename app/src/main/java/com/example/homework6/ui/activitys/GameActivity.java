package com.example.homework6.ui.activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.homework6.R;
import com.example.homework6.databinding.ActivityMainBinding;
import com.example.homework6.databinding.ActivitySecondBinding;
import com.example.homework6.ui.adapter.GameAdapter;
import com.example.homework6.ui.data.GameModel;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {
    private @NonNull ActivitySecondBinding binding;
    GameModel gameModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getData();
        Listener();
    }


    private void getData() {
        gameModel = (GameModel) getIntent().getSerializableExtra("key");
        binding.tvQuestion.setText(gameModel.getQuiz());
        binding.btnOne.setText(gameModel.getAnswerOne());
        binding.btnTwo.setText(gameModel.getAnswerTwo());
        binding.btnThree.setText(gameModel.getAnswerThree());
        binding.btnFour.setText(gameModel.getAnswerFour());
    }

    private void Listener() {
        binding.btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gameModel.getAnswerOne() == gameModel.getCorrectAnswer()){
                    Toast.makeText(GameActivity.this , "Yes" , Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.RubberBand)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    binding.btnOne.setBackgroundColor(Color.GREEN);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    binding.btnOne.setBackgroundColor(Color.BLACK);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(binding.btnOne);
                }else {
                    Toast.makeText(GameActivity.this , "No" , Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Swing)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    binding.btnOne.setBackgroundColor(Color.RED);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    binding.btnOne.setBackgroundColor(Color.BLACK);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(binding.btnOne);
                }

            }
        });
        binding.btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gameModel.getAnswerTwo() == gameModel.getCorrectAnswer()){
                    Toast.makeText(GameActivity.this , "Yes" , Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.RubberBand)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    binding.btnTwo.setBackgroundColor(Color.GREEN);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    binding.btnTwo.setBackgroundColor(Color.BLACK);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(binding.btnTwo);
                }else {
                    Toast.makeText(GameActivity.this , "No" , Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Swing)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    binding.btnTwo.setBackgroundColor(Color.RED);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    binding.btnTwo.setBackgroundColor(Color.BLACK);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(binding.btnTwo);
                }
            }
        });
        binding.btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gameModel.getAnswerThree() == gameModel.getCorrectAnswer()){
                    Toast.makeText(GameActivity.this , "Yes" , Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.RubberBand)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    binding.btnThree.setBackgroundColor(Color.GREEN);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    binding.btnThree.setBackgroundColor(Color.BLACK);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(binding.btnThree);
                }else {
                    Toast.makeText(GameActivity.this , "No" , Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Swing)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    binding.btnThree.setBackgroundColor(Color.RED);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    binding.btnThree.setBackgroundColor(Color.BLACK);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(binding.btnThree);
                }
            }
        });
        binding.btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gameModel.getAnswerFour() == gameModel.getCorrectAnswer()){
                    Toast.makeText(GameActivity.this , "Yes" , Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.RubberBand)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    binding.btnFour.setBackgroundColor(Color.GREEN);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    binding.btnFour.setBackgroundColor(Color.BLACK);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(binding.btnFour);
                }else {
                    Toast.makeText(GameActivity.this , "No" , Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Swing)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    binding.btnFour.setBackgroundColor(Color.RED);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    binding.btnFour.setBackgroundColor(Color.BLACK);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(binding.btnFour);
                }
            }
        });
    }


}