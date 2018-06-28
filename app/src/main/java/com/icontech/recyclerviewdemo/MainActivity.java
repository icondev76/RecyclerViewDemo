package com.icontech.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mImages=new ArrayList<>();
    private ArrayList<String> mImageurls=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBitmaps();
    }

    public void initBitmaps(){
        mImageurls.add("https://i.redd.it/we5ivqry4n611.jpg");
        mImages.add("Washington State");

        mImageurls.add("https://i.redd.it/5mlgxo1qoj611.jpg");
        mImages.add("Chilean Patagonia");

        mImageurls.add("https://i.redd.it/b09ga89nrj611.jpg");
        mImages.add("Yosemite");

        mImageurls.add("https://i.redd.it/we5ivqry4n611.jpg");
        mImages.add("Washington State");

        mImageurls.add("https://i.redd.it/5mlgxo1qoj611.jpg");
        mImages.add("Chilean Patagonia");

        mImageurls.add("https://i.redd.it/b09ga89nrj611.jpg");
        mImages.add("Yosemite");

        mImageurls.add("https://i.redd.it/we5ivqry4n611.jpg");
        mImages.add("Washington State");

        mImageurls.add("https://i.redd.it/5mlgxo1qoj611.jpg");
        mImages.add("Chilean Patagonia");

        mImageurls.add("https://i.redd.it/b09ga89nrj611.jpg");
        mImages.add("Yosemite");

        mImageurls.add("https://i.redd.it/we5ivqry4n611.jpg");
        mImages.add("Washington State");

        mImageurls.add("https://i.redd.it/5mlgxo1qoj611.jpg");
        mImages.add("Chilean Patagonia");

        mImageurls.add("https://i.redd.it/b09ga89nrj611.jpg");
        mImages.add("Yosemite");

        mImageurls.add("https://i.redd.it/we5ivqry4n611.jpg");
        mImages.add("Washington State");

        mImageurls.add("https://i.redd.it/5mlgxo1qoj611.jpg");
        mImages.add("Chilean Patagonia");

        mImageurls.add("https://i.redd.it/b09ga89nrj611.jpg");
        mImages.add("Yosemite");
        initRecyclerview();
    }

public void initRecyclerview(){
    RecyclerView recyclerView=findViewById(R.id.recycler_view);
    RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,mImages,mImageurls);
    recyclerView.setAdapter(adapter);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
}


}
