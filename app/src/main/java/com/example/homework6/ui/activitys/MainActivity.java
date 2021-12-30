package com.example.homework6.ui.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.homework6.ui.adapter.GameAdapter;
import com.example.homework6.ui.data.GameClient;
import com.example.homework6.ui.data.GameModel;
import com.example.homework6.databinding.ActivityMainBinding;
import com.example.homework6.ui.interfaces.OnItemClickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    GameAdapter gameAdapter;
    ArrayList<GameModel> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialization();
        listener();
    }


    private void initialization() {
        list = GameClient.getGameList();
        gameAdapter = new GameAdapter(list);
        binding.recyclerView.setAdapter(gameAdapter);
    }

    private void listener() {
        gameAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(GameModel gameModel) {
                Intent intent = new Intent(MainActivity.this , GameActivity.class);
                intent.putExtra("key" , gameModel);
                startActivity(intent);
            }
        });
    }
}