package com.example.ttn;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class FragmentC extends Fragment {
    ListView lv;

    int[] iconList = new int[]{
            R.drawable.ic_data_usage_24px, R.drawable.ic_data_usage_24px, R.drawable.ic_data_usage_24px, R.drawable.ic_data_usage_24px
    };

    String[] Headline = {"Menu 1", "Menu 2", "Menu 3", "Menu 4"
    };

    String[] Subhead = {"Deskripsi menu 1", "Deskripsi menu 2", "Deskripsi menu 3", "Deskripsi menu 4"
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_c,container,false);
        lv = view.findViewById(R.id.list);
        ListAdapter listAdapter = new ListAdapter(getContext(), iconList, Headline, Subhead);
        lv.setAdapter((android.widget.ListAdapter) listAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getContext(),
                        "You have selected : " + Headline[position],
                        Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }

}