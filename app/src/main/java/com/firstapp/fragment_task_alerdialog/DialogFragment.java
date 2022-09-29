package com.firstapp.fragment_task_alerdialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

import java.util.Objects;

public class DialogFragment extends androidx.fragment.app.DialogFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view=inflater.inflate(R.layout.custom_alertdialog,null,false);

        AppCompatButton welcom= view.findViewById(R.id.ok);
        AppCompatButton thankyou=view.findViewById(R.id.cancel);



        welcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Wellcome", Toast.LENGTH_SHORT).show();
                Objects.requireNonNull(getDialog()).dismiss();
            }
        });

        thankyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "ThankYou", Toast.LENGTH_SHORT).show();
                Objects.requireNonNull(getDialog()).dismiss();
            }
        });


        return view;

    }
}
