package com.example.lab1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView startNum = (TextView)view.getRootView().findViewById(R.id.num);
        view.findViewById(R.id.incButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int newNum = Integer.parseInt(startNum.getText().toString()) + 1;
                //String stringNewNum = int(startNum.getText().toString());
                String result = String.valueOf(newNum);
                startNum.setText(result);
            }
        });
        view.findViewById(R.id.decButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TextView startNum = (TextView)view.getRootView().findViewById(R.id.num);
                int newNum = Integer.parseInt(startNum.getText().toString()) - 1;
                //String stringNewNum = int(startNum.getText().toString());
                String result = String.valueOf(newNum);
                startNum.setText(result);
            }
        });
    }
}