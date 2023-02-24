package com.example.lipstick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MyAdapter.OnItemClickListener {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.my_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);

        adapter = new MyAdapter(getChar(), this);
        recyclerView.setAdapter(adapter);
    }
    private List<Character> getChar()
    {
        List<Character> characters = new ArrayList<>();
        Character character1 = new Character(R.drawable.ayaka,"Kamisato Ayaka","She is in charge of the internal and external affairs of the Kamisato Clan and is the younger sister of Kamisato Ayato. Beautiful, dignified, and noble, Ayaka has earned the title Shirasagi Himegimi and is considered a model of perfection in Inazuma.","$1999");
        Character character2 = new Character(R.drawable.mona,"Mona","An astrologist of knowledgeable skill and high pride, Mona has settled in Mondstadt to avoid suffering the ire of her master after unwittingly reading the latter's diary.","$1469");
        Character character3 = new Character(R.drawable.tt,"Nahida","She is the vessel of Buer, as Lesser Lord Kusanali,[5] the current Dendro Archon. Having been freed from her extensive confinement in the Sanctuary of Surasthana, she now strives to have a stronger presence in Sumeru.","$2999");
        characters.add(character1);
        characters.add(character2);
        characters.add(character3);

        return characters;
    }
    public void onItemClick(Character character) {
        Intent intent = new Intent(this, DetailChar.class);
        intent.putExtra("detail", character.getDetail().toString());
        intent.putExtra("id",String.valueOf(character.getId()));
        intent.putExtra("name",character.getName());
        intent.putExtra("price",character.getPrice());
        startActivity(intent);
    }
}