package com.example.kh.myapplication.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.kh.myapplication.Module.Information;
import com.example.kh.myapplication.Module.MyRecycle;
import com.example.kh.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Navigation_Fragment extends Fragment {

    private    RecyclerView recyclerView;
    public Navigation_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_navigation_, container, false);
        recyclerView  = (RecyclerView) v.findViewById(R.id.recycle);
        MyRecycle adapter = new MyRecycle(getActivity(), getData() );

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager( new LinearLayoutManager(getActivity()));
        Toast.makeText(getActivity(), getData().get(0).title, Toast.LENGTH_SHORT).show();
        return v;
    }

    public List<Information>  getData(){
        List<Information> data = new ArrayList<Information>();
        int[] icon= new int[]{R.drawable.ic_child_friendly_black_24dp, R.drawable.ic_euro_symbol_black_24px, R.drawable.ic_exit, R.drawable.ic_manager};
        String[] title = new String[]{"Mot", "Hai","Ba", "Bon"};
        for(int i = 0 ;i< icon.length && i<title.length; i++){
            Information current = new Information();
            current.title = title[i];
            current.icon = icon[i];
            data.add(current);
        }
        return data;
    }

}
