package com.firstapp.fragment_task_alerdialog;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Fragment_One extends Fragment {
    DataModel dataModel;
    RecyclerView recyclerView;
    DataAdapter dataAdapter;
    List<DataModel> dataModelArrayList = new ArrayList<>();

    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__one, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.reccylerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setHasFixedSize(true);


        dataAdapter = new DataAdapter(getContext(), dataModelArrayList);
        recyclerView.setAdapter(dataAdapter);
        //loading the data with help of data model class
        DataModel dataModel = new DataModel("sai", "sai@gmail.com", "kakinada", "1234567890", "Android");
        dataModelArrayList.add(dataModel);

        DataModel dataModel1 = new DataModel("sanjay", "sanjay@gmail.com", "telengana", "1234567890", "Android");
        dataModelArrayList.add(dataModel1);

        DataModel dataModel2 = new DataModel("RK", "RK@gmail.com", "Hyderabad", "1234567890", "Android");
        dataModelArrayList.add(dataModel2);

        DataModel dataModel3 = new DataModel("Harish", "Harish@gmail.com", "Sangareddy", "1234567", "DotNet");
        dataModelArrayList.add(dataModel3);

        DataModel dataModel4 = new DataModel("Karuna", "Karuna@gmail.com", "Karnataka", "1234567890", "Android");
        dataModelArrayList.add(dataModel4);

        DataModel dataModel5 = new DataModel("Raju", "Raju@gmail.com", "Karnataka", "1234567890", "Android");
        dataModelArrayList.add(dataModel5);

        DataModel dataModel6 = new DataModel("Ruksana", "Ruksana@gmail.com", "Karnataka", "1234567890", "Android");
        dataModelArrayList.add(dataModel6);


    }
}